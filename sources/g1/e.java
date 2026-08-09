package G1;

import e0.AbstractC0829j;
import y1.EnumC1313p;
import y1.S;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends G1.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final S.j f1986p = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final S f1987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final S.e f1988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private S.c f1989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private S f1990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private S.c f1991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private S f1992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private EnumC1313p f1993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private S.j f1994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1995o;

    class b extends G1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        S f1997a;

        b() {
        }

        @Override // G1.c, y1.S.e
        public void f(EnumC1313p enumC1313p, S.j jVar) {
            if (this.f1997a == e.this.f1992l) {
                AbstractC0829j.u(e.this.f1995o, "there's pending lb while current lb has been out of READY");
                e.this.f1993m = enumC1313p;
                e.this.f1994n = jVar;
                if (enumC1313p != EnumC1313p.READY) {
                    return;
                }
            } else {
                if (this.f1997a != e.this.f1990j) {
                    return;
                }
                e.this.f1995o = enumC1313p == EnumC1313p.READY;
                if (e.this.f1995o || e.this.f1992l == e.this.f1987g) {
                    e.this.f1988h.f(enumC1313p, jVar);
                    return;
                }
            }
            e.this.q();
        }

        @Override // G1.c
        protected S.e g() {
            return e.this.f1988h;
        }
    }

    class c extends S.j {
        c() {
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            return S.f.g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public e(S.e eVar) {
        a aVar = new a();
        this.f1987g = aVar;
        this.f1990j = aVar;
        this.f1992l = aVar;
        this.f1988h = (S.e) AbstractC0829j.o(eVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.f1988h.f(this.f1993m, this.f1994n);
        this.f1990j.f();
        this.f1990j = this.f1992l;
        this.f1989i = this.f1991k;
        this.f1992l = this.f1987g;
        this.f1991k = null;
    }

    @Override // y1.S
    public void f() {
        this.f1992l.f();
        this.f1990j.f();
    }

    @Override // G1.b
    protected S g() {
        S s2 = this.f1992l;
        return s2 == this.f1987g ? this.f1990j : s2;
    }

    public void r(S.c cVar) {
        AbstractC0829j.o(cVar, "newBalancerFactory");
        if (cVar.equals(this.f1991k)) {
            return;
        }
        this.f1992l.f();
        this.f1992l = this.f1987g;
        this.f1991k = null;
        this.f1993m = EnumC1313p.CONNECTING;
        this.f1994n = f1986p;
        if (cVar.equals(this.f1989i)) {
            return;
        }
        b bVar = new b();
        S sA = cVar.a(bVar);
        bVar.f1997a = sA;
        this.f1992l = sA;
        this.f1991k = cVar;
        if (this.f1995o) {
            return;
        }
        q();
    }

    class a extends S {
        a() {
        }

        @Override // y1.S
        public void c(l0 l0Var) {
            e.this.f1988h.f(EnumC1313p.TRANSIENT_FAILURE, new S.d(S.f.f(l0Var)));
        }

        @Override // y1.S
        public void d(S.h hVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // y1.S
        public void f() {
        }
    }
}
