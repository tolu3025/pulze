package e;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: e.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0817c extends AbstractC0819e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile C0817c f7046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f7047d = new Executor() { // from class: e.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C0817c.g(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f7048e = new Executor() { // from class: e.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C0817c.h(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC0819e f7049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0819e f7050b;

    private C0817c() {
        C0818d c0818d = new C0818d();
        this.f7050b = c0818d;
        this.f7049a = c0818d;
    }

    public static C0817c f() {
        if (f7046c != null) {
            return f7046c;
        }
        synchronized (C0817c.class) {
            try {
                if (f7046c == null) {
                    f7046c = new C0817c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7046c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Runnable runnable) {
        f().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        f().a(runnable);
    }

    @Override // e.AbstractC0819e
    public void a(Runnable runnable) {
        this.f7049a.a(runnable);
    }

    @Override // e.AbstractC0819e
    public boolean b() {
        return this.f7049a.b();
    }

    @Override // e.AbstractC0819e
    public void c(Runnable runnable) {
        this.f7049a.c(runnable);
    }
}
