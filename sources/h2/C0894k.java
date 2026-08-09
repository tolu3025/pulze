package h2;

import c2.InterfaceC0561f0;
import c2.InterfaceC0576n;
import c2.U;
import c2.X;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: h2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0894k extends c2.K implements X {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7451n = AtomicIntegerFieldUpdater.newUpdater(C0894k.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X f7452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c2.K f7453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7455f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C0899p f7456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f7457m;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: h2.k$a */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f7458a;

        public a(Runnable runnable) {
            this.f7458a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i3 = 0;
            while (true) {
                try {
                    this.f7458a.run();
                } catch (Throwable th) {
                    c2.M.a(M1.h.f2707a, th);
                }
                Runnable runnableB0 = C0894k.this.b0();
                if (runnableB0 == null) {
                    return;
                }
                this.f7458a = runnableB0;
                i3++;
                if (i3 >= 16 && C0894k.this.f7453d.V(C0894k.this)) {
                    C0894k.this.f7453d.U(C0894k.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0894k(c2.K k3, int i3, String str) {
        X x2 = k3 instanceof X ? (X) k3 : null;
        this.f7452c = x2 == null ? U.a() : x2;
        this.f7453d = k3;
        this.f7454e = i3;
        this.f7455f = str;
        this.f7456l = new C0899p(false);
        this.f7457m = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable b0() {
        while (true) {
            Runnable runnable = (Runnable) this.f7456l.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f7457m) {
                f7451n.decrementAndGet(this);
                if (this.f7456l.c() == 0) {
                    return null;
                }
                f7451n.incrementAndGet(this);
            }
        }
    }

    private final boolean c0() {
        synchronized (this.f7457m) {
            if (f7451n.get(this) >= this.f7454e) {
                return false;
            }
            f7451n.incrementAndGet(this);
            return true;
        }
    }

    @Override // c2.X
    public void L(long j3, InterfaceC0576n interfaceC0576n) {
        this.f7452c.L(j3, interfaceC0576n);
    }

    @Override // c2.K
    public void U(M1.g gVar, Runnable runnable) {
        Runnable runnableB0;
        this.f7456l.a(runnable);
        if (f7451n.get(this) >= this.f7454e || !c0() || (runnableB0 = b0()) == null) {
            return;
        }
        this.f7453d.U(this, new a(runnableB0));
    }

    @Override // c2.K
    public c2.K W(int i3, String str) {
        AbstractC0895l.a(i3);
        return i3 >= this.f7454e ? AbstractC0895l.b(this, str) : super.W(i3, str);
    }

    @Override // c2.X
    public InterfaceC0561f0 b(long j3, Runnable runnable, M1.g gVar) {
        return this.f7452c.b(j3, runnable, gVar);
    }

    @Override // c2.K
    public String toString() {
        String str = this.f7455f;
        if (str != null) {
            return str;
        }
        return this.f7453d + ".limitedParallelism(" + this.f7454e + ')';
    }
}
