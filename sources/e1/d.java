package e1;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import b1.AbstractC0525b;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import x1.f;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7104a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f7105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0838b f7107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FlutterJNI f7108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ExecutorService f7109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Future f7110g;

    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f7111a;

        a(Context context) {
            this.f7111a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            d.this.f7108e.prefetchDefaultFontManager();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            f fVarR = f.r("FlutterLoader initTask");
            try {
                d.a(d.this, this.f7111a);
                try {
                    d.this.f7108e.loadLibrary();
                    d.this.f7108e.updateRefreshRate();
                    d.this.f7109f.execute(new Runnable() { // from class: e1.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7103a.c();
                        }
                    });
                    b bVar = new b(x1.c.d(this.f7111a), x1.c.a(this.f7111a), x1.c.c(this.f7111a), null);
                    if (fVarR != null) {
                        fVarR.close();
                    }
                    return bVar;
                } catch (UnsatisfiedLinkError e3) {
                    if (!e3.toString().contains("couldn't find \"libflutter.so\"") && !e3.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e3;
                    }
                    String property = System.getProperty("os.arch");
                    File file = new File(d.this.f7107d.f7101f);
                    throw new UnsupportedOperationException("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: " + property + ", and the native libraries directory (with path " + file.getAbsolutePath() + ") contains the following files: " + Arrays.toString(file.list()), e3);
                }
            } catch (Throwable th) {
                if (fVarR != null) {
                    try {
                        fVarR.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f7113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f7114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f7115c;

        private b(String str, String str2, String str3) {
            this.f7113a = str;
            this.f7114b = str2;
            this.f7115c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7116a;

        public String a() {
            return this.f7116a;
        }
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f7108e = flutterJNI;
        this.f7109f = executorService;
    }

    static /* synthetic */ e a(d dVar, Context context) {
        dVar.h(context);
        return null;
    }

    private e h(Context context) {
        return null;
    }

    private static boolean j(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean e() {
        return this.f7107d.f7102g;
    }

    public void f(Context context, String[] strArr) {
        if (this.f7104a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f7105b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            f fVarR = f.r("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = (b) this.f7110g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder();
                sb.append("--icu-native-lib-path=");
                sb.append(this.f7107d.f7101f);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.f7107d.f7096a);
                arrayList.add("--aot-shared-library-name=" + this.f7107d.f7101f + str + this.f7107d.f7096a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(bVar.f7114b);
                arrayList.add(sb2.toString());
                if (this.f7107d.f7100e != null) {
                    arrayList.add("--domain-network-policy=" + this.f7107d.f7100e);
                }
                if (this.f7105b.a() != null) {
                    arrayList.add("--log-tag=" + this.f7105b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i3 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i3 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i3 = (int) ((r7.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i3);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                        arrayList.add("--enable-impeller");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                }
                arrayList.add("--leak-vm=" + (j(bundle) ? "true" : "false"));
                this.f7108e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f7113a, bVar.f7114b, SystemClock.uptimeMillis() - this.f7106c);
                this.f7104a = true;
                if (fVarR != null) {
                    fVarR.close();
                }
            } finally {
            }
        } catch (Exception e3) {
            AbstractC0525b.c("FlutterLoader", "Flutter initialization failed.", e3);
            throw new RuntimeException(e3);
        }
    }

    public String g() {
        return this.f7107d.f7099d;
    }

    public boolean i() {
        return this.f7104a;
    }

    public void k(Context context) {
        l(context, new c());
    }

    public void l(Context context, c cVar) {
        if (this.f7105b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        f fVarR = f.r("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f7105b = cVar;
            this.f7106c = SystemClock.uptimeMillis();
            this.f7107d = AbstractC0837a.e(applicationContext);
            t.f((DisplayManager) applicationContext.getSystemService("display"), this.f7108e).g();
            this.f7110g = this.f7109f.submit(new a(applicationContext));
            if (fVarR != null) {
                fVarR.close();
            }
        } catch (Throwable th) {
            if (fVarR != null) {
                try {
                    fVarR.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
