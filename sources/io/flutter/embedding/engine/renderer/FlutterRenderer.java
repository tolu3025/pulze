package io.flutter.embedding.engine.renderer;

import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import b1.AbstractC0525b;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class FlutterRenderer implements TextureRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f7749a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Surface f7751c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f7755g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f7750b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7752d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f7753e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f7754f = new HashSet();

    final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.b {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private final long id;
        private boolean released;
        private boolean ignoringFence = false;
        private boolean trimOnMemoryPressure = true;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private Object lock = new Object();
        private final ArrayDeque<b> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, b> perImageReaders = new HashMap<>();
        private a lastDequeuedImage = null;
        private b lastReaderDequeuedFrom = null;

        private class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Image f7756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f7757b;

            public a(Image image, long j3) {
                this.f7756a = image;
                this.f7757b = j3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ImageReader f7759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ArrayDeque f7760b = new ArrayDeque();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f7761c = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final ImageReader.OnImageAvailableListener f7762d;

            public b(ImageReader imageReader) {
                ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.i
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        this.f7798a.f(imageReader2);
                    }
                };
                this.f7762d = onImageAvailableListener;
                this.f7759a = imageReader;
                imageReader.setOnImageAvailableListener(onImageAvailableListener, new Handler(Looper.getMainLooper()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(ImageReader imageReader) {
                Image imageAcquireLatestImage;
                try {
                    imageAcquireLatestImage = imageReader.acquireLatestImage();
                } catch (IllegalStateException e3) {
                    AbstractC0525b.b(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e3);
                    imageAcquireLatestImage = null;
                }
                if (imageAcquireLatestImage == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.this.released || this.f7761c) {
                    imageAcquireLatestImage.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, imageAcquireLatestImage);
                }
            }

            boolean c() {
                return this.f7760b.size() == 0 && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            void d() {
                this.f7761c = true;
                this.f7759a.close();
                this.f7760b.clear();
            }

            a e() {
                if (this.f7760b.size() == 0) {
                    return null;
                }
                return (a) this.f7760b.removeFirst();
            }

            a g(Image image) {
                if (this.f7761c) {
                    return null;
                }
                a aVar = ImageReaderSurfaceProducer.this.new a(image, System.nanoTime());
                this.f7760b.add(aVar);
                while (this.f7760b.size() > 2) {
                    ((a) this.f7760b.removeFirst()).f7756a.close();
                }
                return aVar;
            }
        }

        ImageReaderSurfaceProducer(long j3) {
            this.id = j3;
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (b bVar : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == bVar) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        bVar.d();
                    }
                    this.perImageReaders.clear();
                    a aVar = this.lastDequeuedImage;
                    if (aVar != null) {
                        aVar.f7756a.close();
                        this.lastDequeuedImage = null;
                    }
                    b bVar2 = this.lastReaderDequeuedFrom;
                    if (bVar2 != null) {
                        bVar2.d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private ImageReader createImageReader() {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 33) {
                return createImageReader33();
            }
            if (i3 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        private ImageReader createImageReader29() {
            return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
        }

        private ImageReader createImageReader33() {
            h.a();
            ImageReader.Builder builderA = g.a(this.requestedWidth, this.requestedHeight);
            builderA.setMaxImages(5);
            builderA.setImageFormat(34);
            builderA.setUsage(256L);
            return builderA.build();
        }

        private b getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (!this.createNewReader) {
                        return this.imageReaderQueue.peekLast();
                    }
                    this.createNewReader = false;
                    return getOrCreatePerImageReader(createImageReader());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                AbstractC0525b.g(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
        }

        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public Image acquireLatestImage() {
            a aVarDequeueImage = dequeueImage();
            if (aVarDequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(aVarDequeueImage.f7756a);
            return aVarDequeueImage.f7756a;
        }

        double deltaMillis(long j3) {
            return j3 / 1000000.0d;
        }

        a dequeueImage() {
            a aVar;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    aVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b next = it.next();
                        a aVarE = next.e();
                        if (aVarE == null) {
                            aVar = aVarE;
                        } else {
                            a aVar2 = this.lastDequeuedImage;
                            if (aVar2 != null) {
                                aVar2.f7756a.close();
                                this.lastDequeuedImage = null;
                            }
                            this.lastDequeuedImage = aVarE;
                            this.lastReaderDequeuedFrom = next;
                            aVar = aVarE;
                        }
                    }
                    pruneImageReaderQueue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        protected void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.f7753e.post(new e(this.id, FlutterRenderer.this.f7749a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        b getOrCreatePerImageReader(ImageReader imageReader) {
            b bVar = this.perImageReaders.get(imageReader);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(imageReader);
            this.perImageReaders.put(imageReader, bVar2);
            this.imageReaderQueue.add(bVar2);
            return bVar2;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().f7759a.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public long id() {
            return this.id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int size;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    size = 0;
                    while (it.hasNext()) {
                        size += it.next().f7760b.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return size;
        }

        public int numTrims() {
            int i3;
            synchronized (this.lock) {
                i3 = this.numTrims;
            }
            return i3;
        }

        void onImage(ImageReader imageReader, Image image) {
            a aVarG;
            synchronized (this.lock) {
                aVarG = getOrCreatePerImageReader(imageReader).g(image);
            }
            if (aVarG == null) {
                return;
            }
            FlutterRenderer.this.l();
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i3) {
            if (this.trimOnMemoryPressure && i3 >= 40) {
                synchronized (this.lock) {
                    this.numTrims++;
                }
                cleanup();
                this.createNewReader = true;
            }
        }

        void pruneImageReaderQueue() {
            while (this.imageReaderQueue.size() > 1) {
                b bVarPeekFirst = this.imageReaderQueue.peekFirst();
                if (!bVarPeekFirst.c()) {
                    return;
                }
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(bVarPeekFirst.f7759a);
                bVarPeekFirst.d();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.s(this.id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.l();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i3, int i4) {
            int iMax = Math.max(1, i3);
            int iMax2 = Math.max(1, i4);
            if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = iMax2;
            this.requestedWidth = iMax;
        }
    }

    final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        ImageTextureRegistryEntry(long j3) {
            this.id = j3;
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                AbstractC0525b.g(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        protected void finalize() throws Throwable {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.f7753e.post(new e(this.id, FlutterRenderer.this.f7749a));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public long id() {
            return this.id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                AbstractC0525b.b(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.l();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.s(this.id);
        }
    }

    class a implements j {
        a() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void c() {
            FlutterRenderer.this.f7752d = false;
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            FlutterRenderer.this.f7752d = true;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f7765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f7766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f7767c;

        public b(Rect rect, d dVar) {
            this.f7765a = rect;
            this.f7766b = dVar;
            this.f7767c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f7765a = rect;
            this.f7766b = dVar;
            this.f7767c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7772a;

        c(int i3) {
            this.f7772a = i3;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7778a;

        d(int i3) {
            this.f7778a = i3;
        }
    }

    static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f7779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FlutterJNI f7780b;

        e(long j3, FlutterJNI flutterJNI) {
            this.f7779a = j3;
            this.f7780b = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7780b.isAttached()) {
                AbstractC0525b.f("FlutterRenderer", "Releasing a Texture (" + this.f7779a + ").");
                this.f7780b.unregisterTexture(this.f7779a);
            }
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f7781a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7782b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7783c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7784d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7785e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7786f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7787g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7788h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7789i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f7790j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7791k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7792l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7793m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7794n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7795o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7796p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List f7797q = new ArrayList();

        boolean a() {
            return this.f7782b > 0 && this.f7783c > 0 && this.f7781a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f7755g = aVar;
        this.f7749a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.f7749a.scheduleFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(long j3) {
        this.f7749a.unregisterTexture(j3);
    }

    public void f(j jVar) {
        this.f7749a.addIsDisplayingFlutterUiListener(jVar);
        if (this.f7752d) {
            jVar.f();
        }
    }

    public void g(ByteBuffer byteBuffer, int i3) {
        this.f7749a.dispatchPointerDataPacket(byteBuffer, i3);
    }

    public boolean h() {
        return this.f7752d;
    }

    public boolean i() {
        return this.f7749a.getIsSoftwareRenderingEnabled();
    }

    public void j(int i3) {
        Iterator it = this.f7754f.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = (TextureRegistry.b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.onTrimMemory(i3);
            } else {
                it.remove();
            }
        }
    }

    public void k(j jVar) {
        this.f7749a.removeIsDisplayingFlutterUiListener(jVar);
    }

    public void m(boolean z2) {
        this.f7749a.setSemanticsEnabled(z2);
    }

    public void n(f fVar) {
        if (fVar.a()) {
            AbstractC0525b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + fVar.f7782b + " x " + fVar.f7783c + "\nPadding - L: " + fVar.f7787g + ", T: " + fVar.f7784d + ", R: " + fVar.f7785e + ", B: " + fVar.f7786f + "\nInsets - L: " + fVar.f7791k + ", T: " + fVar.f7788h + ", R: " + fVar.f7789i + ", B: " + fVar.f7790j + "\nSystem Gesture Insets - L: " + fVar.f7795o + ", T: " + fVar.f7792l + ", R: " + fVar.f7793m + ", B: " + fVar.f7793m + "\nDisplay Features: " + fVar.f7797q.size());
            int[] iArr = new int[fVar.f7797q.size() * 4];
            int[] iArr2 = new int[fVar.f7797q.size()];
            int[] iArr3 = new int[fVar.f7797q.size()];
            for (int i3 = 0; i3 < fVar.f7797q.size(); i3++) {
                b bVar = (b) fVar.f7797q.get(i3);
                int i4 = i3 * 4;
                Rect rect = bVar.f7765a;
                iArr[i4] = rect.left;
                iArr[i4 + 1] = rect.top;
                iArr[i4 + 2] = rect.right;
                iArr[i4 + 3] = rect.bottom;
                iArr2[i3] = bVar.f7766b.f7778a;
                iArr3[i3] = bVar.f7767c.f7772a;
            }
            this.f7749a.setViewportMetrics(fVar.f7781a, fVar.f7782b, fVar.f7783c, fVar.f7784d, fVar.f7785e, fVar.f7786f, fVar.f7787g, fVar.f7788h, fVar.f7789i, fVar.f7790j, fVar.f7791k, fVar.f7792l, fVar.f7793m, fVar.f7794n, fVar.f7795o, fVar.f7796p, iArr, iArr2, iArr3);
        }
    }

    public void o(Surface surface, boolean z2) {
        if (!z2) {
            p();
        }
        this.f7751c = surface;
        if (z2) {
            this.f7749a.onSurfaceWindowChanged(surface);
        } else {
            this.f7749a.onSurfaceCreated(surface);
        }
    }

    public void p() {
        if (this.f7751c != null) {
            this.f7749a.onSurfaceDestroyed();
            if (this.f7752d) {
                this.f7755g.c();
            }
            this.f7752d = false;
            this.f7751c = null;
        }
    }

    public void q(int i3, int i4) {
        this.f7749a.onSurfaceChanged(i3, i4);
    }

    public void r(Surface surface) {
        this.f7751c = surface;
        this.f7749a.onSurfaceWindowChanged(surface);
    }
}
