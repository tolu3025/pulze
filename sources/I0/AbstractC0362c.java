package I0;

import J0.AbstractC0386b;
import J0.C0391g;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import y1.AbstractC1304g;
import y1.Z;
import y1.l0;

/* JADX INFO: renamed from: I0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0362c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f2272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f2273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f2274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f2275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f2276r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0391g.b f2277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0391g.b f2278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0384z f2279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y1.a0 f2280d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0391g f2282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0391g.d f2283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0391g.d f2284h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AbstractC1304g f2287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final J0.u f2288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final W f2289m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private V f2285i = V.Initial;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f2286j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f2281e = new b();

    /* JADX INFO: renamed from: I0.c$a */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f2290a;

        a(long j3) {
            this.f2290a = j3;
        }

        void a(Runnable runnable) {
            AbstractC0362c.this.f2282f.x();
            if (AbstractC0362c.this.f2286j == this.f2290a) {
                runnable.run();
            } else {
                J0.A.a(AbstractC0362c.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: I0.c$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0362c.this.j();
        }
    }

    /* JADX INFO: renamed from: I0.c$c, reason: collision with other inner class name */
    class C0044c implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f2293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2294b = 0;

        C0044c(a aVar) {
            this.f2293a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(l0 l0Var) {
            if (l0Var.o()) {
                J0.A.a(AbstractC0362c.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(AbstractC0362c.this)));
            } else {
                J0.A.e(AbstractC0362c.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(AbstractC0362c.this)), l0Var);
            }
            AbstractC0362c.this.k(l0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(y1.Z z2) {
            if (J0.A.c()) {
                HashMap map = new HashMap();
                for (String str : z2.j()) {
                    if (r.f2345d.contains(str.toLowerCase(Locale.ENGLISH))) {
                        map.put(str, (String) z2.g(Z.g.e(str, y1.Z.f11842e)));
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                J0.A.a(AbstractC0362c.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(AbstractC0362c.this)), map);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(int i3, Object obj) {
            if (J0.A.c()) {
                J0.A.a(AbstractC0362c.this.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(AbstractC0362c.this)), Integer.valueOf(i3), obj);
            }
            if (i3 == 1) {
                AbstractC0362c.this.r(obj);
            } else {
                AbstractC0362c.this.s(obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            J0.A.a(AbstractC0362c.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(AbstractC0362c.this)));
            AbstractC0362c.this.t();
        }

        @Override // I0.K
        public void a() {
            this.f2293a.a(new Runnable() { // from class: I0.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2298a.l();
                }
            });
        }

        @Override // I0.K
        public void b(final l0 l0Var) {
            this.f2293a.a(new Runnable() { // from class: I0.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2308a.i(l0Var);
                }
            });
        }

        @Override // I0.K
        public void c(final y1.Z z2) {
            this.f2293a.a(new Runnable() { // from class: I0.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2306a.j(z2);
                }
            });
        }

        @Override // I0.K
        public void d(final Object obj) {
            final int i3 = this.f2294b + 1;
            this.f2293a.a(new Runnable() { // from class: I0.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2303a.k(i3, obj);
                }
            });
            this.f2294b = i3;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f2272n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f2273o = timeUnit2.toMillis(1L);
        f2274p = timeUnit2.toMillis(1L);
        f2275q = timeUnit.toMillis(10L);
        f2276r = timeUnit.toMillis(10L);
    }

    AbstractC0362c(C0384z c0384z, y1.a0 a0Var, C0391g c0391g, C0391g.d dVar, C0391g.d dVar2, C0391g.d dVar3, W w2) {
        this.f2279c = c0384z;
        this.f2280d = a0Var;
        this.f2282f = c0391g;
        this.f2283g = dVar2;
        this.f2284h = dVar3;
        this.f2289m = w2;
        this.f2288l = new J0.u(c0391g, dVar, f2272n, 1.5d, f2273o);
    }

    private void g() {
        C0391g.b bVar = this.f2277a;
        if (bVar != null) {
            bVar.c();
            this.f2277a = null;
        }
    }

    private void h() {
        C0391g.b bVar = this.f2278b;
        if (bVar != null) {
            bVar.c();
            this.f2278b = null;
        }
    }

    private void i(V v2, l0 l0Var) {
        AbstractC0386b.d(n(), "Only started streams should be closed.", new Object[0]);
        V v3 = V.Error;
        AbstractC0386b.d(v2 == v3 || l0Var.o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f2282f.x();
        if (r.h(l0Var)) {
            J0.L.k(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", l0Var.l()));
        }
        h();
        g();
        this.f2288l.c();
        this.f2286j++;
        l0.b bVarM = l0Var.m();
        if (bVarM == l0.b.OK) {
            this.f2288l.f();
        } else if (bVarM == l0.b.RESOURCE_EXHAUSTED) {
            J0.A.a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.f2288l.g();
        } else if (bVarM == l0.b.UNAUTHENTICATED && this.f2285i != V.Healthy) {
            this.f2279c.h();
        } else if (bVarM == l0.b.UNAVAILABLE && ((l0Var.l() instanceof UnknownHostException) || (l0Var.l() instanceof ConnectException))) {
            this.f2288l.h(f2276r);
        }
        if (v2 != v3) {
            J0.A.a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            x();
        }
        if (this.f2287k != null) {
            if (l0Var.o()) {
                J0.A.a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                try {
                    this.f2287k.b();
                } catch (IllegalStateException e3) {
                    J0.A.a(getClass().getSimpleName(), "(%x) Closing stream client-side result in exception: [%s]", Integer.valueOf(System.identityHashCode(this)), e3);
                }
            }
            this.f2287k = null;
        }
        this.f2285i = v2;
        this.f2289m.b(l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (m()) {
            i(V.Initial, l0.f11960e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (m()) {
            this.f2285i = V.Healthy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        V v2 = this.f2285i;
        AbstractC0386b.d(v2 == V.Backoff, "State should still be backoff but was %s", v2);
        this.f2285i = V.Initial;
        v();
        AbstractC0386b.d(n(), "Stream should have started", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.f2285i = V.Open;
        this.f2289m.a();
        if (this.f2277a == null) {
            this.f2277a = this.f2282f.k(this.f2284h, f2275q, new Runnable() { // from class: I0.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2260a.o();
                }
            });
        }
    }

    private void u() {
        AbstractC0386b.d(this.f2285i == V.Error, "Should only perform backoff in an error state", new Object[0]);
        this.f2285i = V.Backoff;
        this.f2288l.b(new Runnable() { // from class: I0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f2243a.p();
            }
        });
    }

    void k(l0 l0Var) {
        AbstractC0386b.d(n(), "Can't handle server close on non-started stream!", new Object[0]);
        i(V.Error, l0Var);
    }

    public void l() {
        AbstractC0386b.d(!n(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f2282f.x();
        this.f2285i = V.Initial;
        this.f2288l.f();
    }

    public boolean m() {
        this.f2282f.x();
        V v2 = this.f2285i;
        return v2 == V.Open || v2 == V.Healthy;
    }

    public boolean n() {
        this.f2282f.x();
        V v2 = this.f2285i;
        return v2 == V.Starting || v2 == V.Backoff || m();
    }

    void q() {
        if (m() && this.f2278b == null) {
            this.f2278b = this.f2282f.k(this.f2283g, f2274p, this.f2281e);
        }
    }

    public abstract void r(Object obj);

    public abstract void s(Object obj);

    public void v() {
        this.f2282f.x();
        AbstractC0386b.d(this.f2287k == null, "Last call still set", new Object[0]);
        AbstractC0386b.d(this.f2278b == null, "Idle timer still set", new Object[0]);
        V v2 = this.f2285i;
        if (v2 == V.Error) {
            u();
            return;
        }
        AbstractC0386b.d(v2 == V.Initial, "Already started", new Object[0]);
        this.f2287k = this.f2279c.m(this.f2280d, new C0044c(new a(this.f2286j)));
        this.f2285i = V.Starting;
    }

    public void w() {
        if (n()) {
            i(V.Initial, l0.f11960e);
        }
    }

    protected void y(Object obj) {
        this.f2282f.x();
        J0.A.a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), obj);
        h();
        this.f2287k.d(obj);
    }

    protected void x() {
    }
}
