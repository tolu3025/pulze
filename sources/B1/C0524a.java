package b1;

import d1.InterfaceC0814a;
import e1.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: b1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0524a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C0524a f4941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f4942e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f4943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FlutterJNI.c f4944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExecutorService f4945c;

    /* JADX INFO: renamed from: b1.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f4946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private FlutterJNI.c f4947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ExecutorService f4948c;

        /* JADX INFO: renamed from: b1.a$b$a, reason: collision with other inner class name */
        private class ThreadFactoryC0102a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f4949a;

            private ThreadFactoryC0102a() {
                this.f4949a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i3 = this.f4949a;
                this.f4949a = i3 + 1;
                sb.append(i3);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f4947b == null) {
                this.f4947b = new FlutterJNI.c();
            }
            if (this.f4948c == null) {
                this.f4948c = Executors.newCachedThreadPool(new ThreadFactoryC0102a());
            }
            if (this.f4946a == null) {
                this.f4946a = new d(this.f4947b.a(), this.f4948c);
            }
        }

        public C0524a a() {
            b();
            return new C0524a(this.f4946a, null, this.f4947b, this.f4948c);
        }
    }

    private C0524a(d dVar, InterfaceC0814a interfaceC0814a, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f4943a = dVar;
        this.f4944b = cVar;
        this.f4945c = executorService;
    }

    public static C0524a e() {
        f4942e = true;
        if (f4941d == null) {
            f4941d = new b().a();
        }
        return f4941d;
    }

    public InterfaceC0814a a() {
        return null;
    }

    public ExecutorService b() {
        return this.f4945c;
    }

    public d c() {
        return this.f4943a;
    }

    public FlutterJNI.c d() {
        return this.f4944b;
    }
}
