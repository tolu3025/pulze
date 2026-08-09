package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import b1.AbstractC0525b;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class r extends View implements io.flutter.embedding.engine.renderer.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageReader f7653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Image f7654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f7655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FlutterRenderer f7656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f7657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7658f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7659a;

        static {
            int[] iArr = new int[b.values().length];
            f7659a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7659a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        background,
        overlay
    }

    public r(Context context, int i3, int i4, b bVar) {
        this(context, h(i3, i4), bVar);
    }

    private void f() {
        Image image = this.f7654b;
        if (image != null) {
            image.close();
            this.f7654b = null;
        }
    }

    private static ImageReader h(int i3, int i4) {
        int i5;
        int i6;
        if (i3 <= 0) {
            j("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i3));
            i5 = 1;
        } else {
            i5 = i3;
        }
        if (i4 <= 0) {
            j("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i4));
            i6 = 1;
        } else {
            i6 = i4;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i5, i6, 1, 3, 768L) : ImageReader.newInstance(i5, i6, 1, 3);
    }

    private void i() {
        setAlpha(0.0f);
    }

    private static void j(String str, Object... objArr) {
        AbstractC0525b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f7654b.getHardwareBuffer();
            this.f7655c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f7654b.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f7654b.getHeight();
        Bitmap bitmap = this.f7655c;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f7655c.getHeight() != height) {
            this.f7655c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f7655c.copyPixelsFromBuffer(buffer);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void a() {
        if (this.f7658f) {
            setAlpha(0.0f);
            e();
            this.f7655c = null;
            f();
            invalidate();
            this.f7658f = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void c(FlutterRenderer flutterRenderer) {
        if (a.f7659a[this.f7657e.ordinal()] == 1) {
            flutterRenderer.r(this.f7653a.getSurface());
        }
        setAlpha(1.0f);
        this.f7656d = flutterRenderer;
        this.f7658f = true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void d() {
    }

    public boolean e() {
        if (!this.f7658f) {
            return false;
        }
        Image imageAcquireLatestImage = this.f7653a.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            f();
            this.f7654b = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public void g() {
        this.f7653a.close();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public FlutterRenderer getAttachedRenderer() {
        return this.f7656d;
    }

    public ImageReader getImageReader() {
        return this.f7653a;
    }

    public Surface getSurface() {
        return this.f7653a.getSurface();
    }

    public void k(int i3, int i4) {
        if (this.f7656d == null) {
            return;
        }
        if (i3 == this.f7653a.getWidth() && i4 == this.f7653a.getHeight()) {
            return;
        }
        f();
        g();
        this.f7653a = h(i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7654b != null) {
            l();
        }
        Bitmap bitmap = this.f7655c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        if (!(i3 == this.f7653a.getWidth() && i4 == this.f7653a.getHeight()) && this.f7657e == b.background && this.f7658f) {
            k(i3, i4);
            this.f7656d.r(this.f7653a.getSurface());
        }
    }

    r(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f7658f = false;
        this.f7653a = imageReader;
        this.f7657e = bVar;
        i();
    }
}
