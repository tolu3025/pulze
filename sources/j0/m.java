package J0;

import c2.AbstractC0586s0;
import c2.C0557d0;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2477b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f2478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f2479d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f2480a = new b.C0045b();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f2481a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: J0.m$b$b, reason: collision with other inner class name */
        public static final class C0045b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Semaphore f2482a = new Semaphore(0);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f2483b;

            public final Semaphore a() {
                return this.f2482a;
            }

            public final int b() {
                return this.f2483b;
            }

            public final void c(int i3) {
                this.f2483b = i3;
            }
        }
    }

    static {
        int iA = Y1.i.a(Runtime.getRuntime().availableProcessors(), 2);
        f2478c = iA;
        f2479d = AbstractC0586s0.a(C0557d0.b().W(iA, "firestore.BackgroundQueue"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Runnable runnable, b bVar) {
        try {
            runnable.run();
        } finally {
            ((b.C0045b) bVar).a().release();
        }
    }

    public final void b() throws InterruptedException {
        b bVar = this.f2480a;
        if (!(bVar instanceof b.C0045b)) {
            throw new IllegalStateException("drain() may not be called more than once".toString());
        }
        this.f2480a = b.a.f2481a;
        b.C0045b c0045b = (b.C0045b) bVar;
        c0045b.a().acquire(c0045b.b());
    }

    public final void c(final Runnable runnable) {
        kotlin.jvm.internal.m.e(runnable, "runnable");
        final b bVar = this.f2480a;
        if (!(bVar instanceof b.C0045b)) {
            throw new IllegalStateException("submit() may not be called after drain()".toString());
        }
        b.C0045b c0045b = (b.C0045b) bVar;
        c0045b.c(c0045b.b() + 1);
        f2479d.execute(new Runnable() { // from class: J0.l
            @Override // java.lang.Runnable
            public final void run() {
                m.d(runnable, bVar);
            }
        });
    }
}
