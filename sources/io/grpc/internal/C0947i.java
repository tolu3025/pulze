package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import io.grpc.internal.L0;
import java.util.List;
import java.util.Map;
import y1.AbstractC1303f;
import y1.EnumC1313p;
import y1.S;
import y1.c0;

/* JADX INFO: renamed from: io.grpc.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0947i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.U f9081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9082b;

    /* JADX INFO: renamed from: io.grpc.internal.i$b */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.e f9083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y1.S f9084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private y1.T f9085c;

        b(S.e eVar) {
            this.f9083a = eVar;
            y1.T tD = C0947i.this.f9081a.d(C0947i.this.f9082b);
            this.f9085c = tD;
            if (tD != null) {
                this.f9084b = tD.a(eVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + C0947i.this.f9082b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        public y1.S a() {
            return this.f9084b;
        }

        void b(y1.l0 l0Var) {
            a().c(l0Var);
        }

        void c() {
            a().e();
        }

        void d() {
            this.f9084b.f();
            this.f9084b = null;
        }

        y1.l0 e(S.h hVar) {
            L0.b bVar = (L0.b) hVar.c();
            if (bVar == null) {
                try {
                    C0947i c0947i = C0947i.this;
                    bVar = new L0.b(c0947i.d(c0947i.f9082b, "using default policy"), null);
                } catch (f e3) {
                    this.f9083a.f(EnumC1313p.TRANSIENT_FAILURE, new d(y1.l0.f11974s.q(e3.getMessage())));
                    this.f9084b.f();
                    this.f9085c = null;
                    this.f9084b = new e();
                    return y1.l0.f11960e;
                }
            }
            if (this.f9085c == null || !bVar.f8627a.b().equals(this.f9085c.b())) {
                this.f9083a.f(EnumC1313p.CONNECTING, new c());
                this.f9084b.f();
                y1.T t2 = bVar.f8627a;
                this.f9085c = t2;
                y1.S s2 = this.f9084b;
                this.f9084b = t2.a(this.f9083a);
                this.f9083a.b().b(AbstractC1303f.a.INFO, "Load balancer changed from {0} to {1}", s2.getClass().getSimpleName(), this.f9084b.getClass().getSimpleName());
            }
            Object obj = bVar.f8628b;
            if (obj != null) {
                this.f9083a.b().b(AbstractC1303f.a.DEBUG, "Load-balancing config: {0}", bVar.f8628b);
            }
            return a().a(S.h.d().b(hVar.a()).c(hVar.b()).d(obj).a());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.i$c */
    private static final class c extends S.j {
        private c() {
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            return S.f.g();
        }

        public String toString() {
            return AbstractC0825f.a(c.class).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.i$d */
    private static final class d extends S.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y1.l0 f9087a;

        d(y1.l0 l0Var) {
            this.f9087a = l0Var;
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            return S.f.f(this.f9087a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.i$f */
    static final class f extends Exception {
        private f(String str) {
            super(str);
        }
    }

    public C0947i(String str) {
        this(y1.U.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y1.T d(String str, String str2) throws f {
        y1.T tD = this.f9081a.d(str);
        if (tD != null) {
            return tD;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public b e(S.e eVar) {
        return new b(eVar);
    }

    c0.b f(Map map) {
        List listA;
        if (map != null) {
            try {
                listA = L0.A(L0.g(map));
            } catch (RuntimeException e3) {
                return c0.b.b(y1.l0.f11962g.q("can't parse load balancer configuration").p(e3));
            }
        } else {
            listA = null;
        }
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return L0.y(listA, this.f9081a);
    }

    C0947i(y1.U u2, String str) {
        this.f9081a = (y1.U) AbstractC0829j.o(u2, "registry");
        this.f9082b = (String) AbstractC0829j.o(str, "defaultPolicy");
    }

    /* JADX INFO: renamed from: io.grpc.internal.i$e */
    private static final class e extends y1.S {
        private e() {
        }

        @Override // y1.S
        public y1.l0 a(S.h hVar) {
            return y1.l0.f11960e;
        }

        @Override // y1.S
        public void f() {
        }

        @Override // y1.S
        public void c(y1.l0 l0Var) {
        }

        @Override // y1.S
        public void d(S.h hVar) {
        }
    }
}
