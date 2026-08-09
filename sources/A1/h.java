package A1;

import A1.r;
import e0.AbstractC0829j;
import g0.AbstractC0870a;
import io.grpc.internal.AbstractC0931a;
import io.grpc.internal.InterfaceC0966s;
import io.grpc.internal.P0;
import io.grpc.internal.V;
import io.grpc.internal.V0;
import io.grpc.internal.W0;
import java.io.EOFException;
import java.util.List;
import y1.C1298a;
import y1.C1300c;
import y1.Z;
import y1.a0;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
class h extends AbstractC0931a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final m2.d f401p = new m2.d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a0 f402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final P0 f404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1298a f408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f409o;

    class a implements AbstractC0931a.b {
        a() {
        }

        @Override // io.grpc.internal.AbstractC0931a.b
        public void d(l0 l0Var) {
            H1.e eVarH = H1.c.h("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (h.this.f406l.f427z) {
                    h.this.f406l.a0(l0Var, true, null);
                }
                if (eVarH != null) {
                    eVarH.close();
                }
            } catch (Throwable th) {
                if (eVarH != null) {
                    try {
                        eVarH.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.AbstractC0931a.b
        public void e(Z z2, byte[] bArr) {
            H1.e eVarH = H1.c.h("OkHttpClientStream$Sink.writeHeaders");
            try {
                String str = "/" + h.this.f402h.c();
                if (bArr != null) {
                    h.this.f409o = true;
                    str = str + "?" + AbstractC0870a.a().e(bArr);
                }
                synchronized (h.this.f406l.f427z) {
                    h.this.f406l.g0(z2, str);
                }
                if (eVarH != null) {
                    eVarH.close();
                }
            } catch (Throwable th) {
                if (eVarH != null) {
                    try {
                        eVarH.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.AbstractC0931a.b
        public void f(W0 w02, boolean z2, boolean z3, int i3) {
            m2.d dVarE;
            H1.e eVarH = H1.c.h("OkHttpClientStream$Sink.writeFrame");
            try {
                if (w02 == null) {
                    dVarE = h.f401p;
                } else {
                    dVarE = ((p) w02).e();
                    int iB0 = (int) dVarE.b0();
                    if (iB0 > 0) {
                        h.this.t(iB0);
                    }
                }
                synchronized (h.this.f406l.f427z) {
                    h.this.f406l.e0(dVarE, z2, z3);
                    h.this.x().e(i3);
                }
                if (eVarH != null) {
                    eVarH.close();
                }
            } catch (Throwable th) {
                if (eVarH != null) {
                    try {
                        eVarH.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    class b extends V implements r.b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private List f411A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private m2.d f412B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private boolean f413C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f414D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private boolean f415E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f416F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f417G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private final A1.b f418H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private final r f419I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private final i f420J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private boolean f421K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final H1.d f422L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private r.c f423M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private int f424N;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final int f426y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final Object f427z;

        public b(int i3, P0 p02, Object obj, A1.b bVar, r rVar, i iVar, int i4, String str) {
            super(i3, p02, h.this.x());
            this.f412B = new m2.d();
            this.f413C = false;
            this.f414D = false;
            this.f415E = false;
            this.f421K = true;
            this.f424N = -1;
            this.f427z = AbstractC0829j.o(obj, "lock");
            this.f418H = bVar;
            this.f419I = rVar;
            this.f420J = iVar;
            this.f416F = i4;
            this.f417G = i4;
            this.f426y = i4;
            this.f422L = H1.c.b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(l0 l0Var, boolean z2, Z z3) throws EOFException {
            if (this.f415E) {
                return;
            }
            this.f415E = true;
            if (!this.f421K) {
                this.f420J.V(c0(), l0Var, InterfaceC0966s.a.PROCESSED, z2, C1.a.CANCEL, z3);
                return;
            }
            this.f420J.h0(h.this);
            this.f411A = null;
            this.f412B.c();
            this.f421K = false;
            if (z3 == null) {
                z3 = new Z();
            }
            N(l0Var, true, z3);
        }

        private void d0() {
            if (G()) {
                this.f420J.V(c0(), null, InterfaceC0966s.a.PROCESSED, false, null, null);
            } else {
                this.f420J.V(c0(), null, InterfaceC0966s.a.PROCESSED, false, C1.a.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(m2.d dVar, boolean z2, boolean z3) {
            if (this.f415E) {
                return;
            }
            if (!this.f421K) {
                AbstractC0829j.u(c0() != -1, "streamId should be set");
                this.f419I.d(z2, this.f423M, dVar, z3);
            } else {
                this.f412B.T(dVar, (int) dVar.b0());
                this.f413C |= z2;
                this.f414D |= z3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(Z z2, String str) {
            this.f411A = d.b(z2, str, h.this.f405k, h.this.f403i, h.this.f409o, this.f420J.b0());
            this.f420J.o0(h.this);
        }

        @Override // io.grpc.internal.V
        protected void P(l0 l0Var, boolean z2, Z z3) throws EOFException {
            a0(l0Var, z2, z3);
        }

        @Override // io.grpc.internal.C0956m0.b
        public void b(Throwable th) throws EOFException {
            P(l0.k(th), true, new Z());
        }

        r.c b0() {
            r.c cVar;
            synchronized (this.f427z) {
                cVar = this.f423M;
            }
            return cVar;
        }

        @Override // io.grpc.internal.C0941f.d
        public void c(Runnable runnable) {
            synchronized (this.f427z) {
                runnable.run();
            }
        }

        int c0() {
            return this.f424N;
        }

        @Override // io.grpc.internal.V, io.grpc.internal.AbstractC0931a.c, io.grpc.internal.C0956m0.b
        public void e(boolean z2) {
            d0();
            super.e(z2);
        }

        @Override // io.grpc.internal.C0956m0.b
        public void f(int i3) {
            int i4 = this.f417G - i3;
            this.f417G = i4;
            float f3 = i4;
            int i5 = this.f426y;
            if (f3 <= i5 * 0.5f) {
                int i6 = i5 - i4;
                this.f416F += i6;
                this.f417G = i4 + i6;
                this.f418H.g(c0(), i6);
            }
        }

        public void f0(int i3) {
            AbstractC0829j.v(this.f424N == -1, "the stream has been started with id %s", i3);
            this.f424N = i3;
            this.f423M = this.f419I.c(this, i3);
            h.this.f406l.r();
            if (this.f421K) {
                this.f418H.J(h.this.f409o, false, this.f424N, 0, this.f411A);
                h.this.f404j.c();
                this.f411A = null;
                if (this.f412B.b0() > 0) {
                    this.f419I.d(this.f413C, this.f423M, this.f412B, this.f414D);
                }
                this.f421K = false;
            }
        }

        H1.d h0() {
            return this.f422L;
        }

        public void i0(m2.d dVar, boolean z2, int i3) throws Throwable {
            int iB0 = this.f416F - (((int) dVar.b0()) + i3);
            this.f416F = iB0;
            this.f417G -= i3;
            if (iB0 >= 0) {
                super.S(new l(dVar), z2);
            } else {
                this.f418H.d(c0(), C1.a.FLOW_CONTROL_ERROR);
                this.f420J.V(c0(), l0.f11974s.q("Received data size exceeded our receiving window size"), InterfaceC0966s.a.PROCESSED, false, null, null);
            }
        }

        public void j0(List list, boolean z2) {
            if (z2) {
                U(s.c(list));
            } else {
                T(s.a(list));
            }
        }

        @Override // io.grpc.internal.AbstractC0935c.a
        protected void r() {
            super.r();
            m().c();
        }
    }

    h(a0 a0Var, Z z2, A1.b bVar, i iVar, r rVar, Object obj, int i3, int i4, String str, String str2, P0 p02, V0 v02, C1300c c1300c, boolean z3) {
        super(new q(), p02, v02, z2, c1300c, z3 && a0Var.f());
        this.f407m = new a();
        this.f409o = false;
        this.f404j = (P0) AbstractC0829j.o(p02, "statsTraceCtx");
        this.f402h = a0Var;
        this.f405k = str;
        this.f403i = str2;
        this.f408n = iVar.f();
        this.f406l = new b(i3, p02, obj, bVar, rVar, iVar, i4, a0Var.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractC0931a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a v() {
        return this.f407m;
    }

    public a0.d M() {
        return this.f402h.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractC0931a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b z() {
        return this.f406l;
    }

    boolean O() {
        return this.f409o;
    }

    @Override // io.grpc.internal.r
    public C1298a f() {
        return this.f408n;
    }

    @Override // io.grpc.internal.r
    public void k(String str) {
        this.f405k = (String) AbstractC0829j.o(str, "authority");
    }
}
