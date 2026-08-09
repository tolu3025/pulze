package io.grpc.internal;

import e0.AbstractC0829j;
import g0.AbstractC0871b;
import io.grpc.internal.AbstractC0935c;
import io.grpc.internal.C0958n0;
import io.grpc.internal.InterfaceC0966s;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.AbstractC1291C;
import y1.C1300c;
import y1.C1316t;
import y1.C1318v;
import y1.InterfaceC1309l;
import y1.InterfaceC1311n;
import y1.InterfaceC1317u;
import y1.Z;

/* JADX INFO: renamed from: io.grpc.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0931a extends AbstractC0935c implements r, C0958n0.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f8817g = Logger.getLogger(AbstractC0931a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f8818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f8819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y1.Z f8822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f8823f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: io.grpc.internal.a$b */
    public interface b {
        void d(y1.l0 l0Var);

        void e(y1.Z z2, byte[] bArr);

        void f(W0 w02, boolean z2, boolean z3, int i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: io.grpc.internal.a$c */
    public static abstract class c extends AbstractC0935c.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final P0 f8829i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f8830j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private InterfaceC0966s f8831k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f8832l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private C1318v f8833m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f8834n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Runnable f8835o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private volatile boolean f8836p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f8837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f8838r;

        /* JADX INFO: renamed from: io.grpc.internal.a$c$a, reason: collision with other inner class name */
        class RunnableC0136a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1.l0 f8839a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0966s.a f8840b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y1.Z f8841c;

            RunnableC0136a(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
                this.f8839a = l0Var;
                this.f8840b = aVar;
                this.f8841c = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.C(this.f8839a, this.f8840b, this.f8841c);
            }
        }

        protected c(int i3, P0 p02, V0 v02) {
            super(i3, p02, v02);
            this.f8833m = C1318v.c();
            this.f8834n = false;
            this.f8829i = (P0) AbstractC0829j.o(p02, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
            if (this.f8830j) {
                return;
            }
            this.f8830j = true;
            this.f8829i.m(l0Var);
            if (m() != null) {
                m().f(l0Var.o());
            }
            o().c(l0Var, aVar, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I(C1318v c1318v) {
            AbstractC0829j.u(this.f8831k == null, "Already called start");
            this.f8833m = (C1318v) AbstractC0829j.o(c1318v, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(boolean z2) {
            this.f8832l = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L() {
            this.f8836p = true;
        }

        protected void D(z0 z0Var) throws Throwable {
            AbstractC0829j.o(z0Var, "frame");
            boolean z2 = true;
            try {
                if (this.f8837q) {
                    AbstractC0931a.f8817g.log(Level.INFO, "Received data on closed stream");
                    z0Var.close();
                    return;
                } else {
                    try {
                        l(z0Var);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z2 = false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (z2) {
                z0Var.close();
            }
            throw th;
        }

        protected void E(y1.Z z2) {
            boolean z3;
            AbstractC0829j.u(!this.f8837q, "Received headers on closed stream");
            this.f8829i.a();
            String str = (String) z2.g(S.f8657g);
            if (!this.f8832l || str == null) {
                z3 = false;
            } else if (str.equalsIgnoreCase("gzip")) {
                w(new T());
                z3 = true;
            } else {
                if (!str.equalsIgnoreCase("identity")) {
                    b(y1.l0.f11974s.q(String.format("Can't find full stream decompressor for %s", str)).d());
                    return;
                }
                z3 = false;
            }
            String str2 = (String) z2.g(S.f8655e);
            if (str2 != null) {
                InterfaceC1317u interfaceC1317uE = this.f8833m.e(str2);
                if (interfaceC1317uE == null) {
                    b(y1.l0.f11974s.q(String.format("Can't find decompressor for %s", str2)).d());
                    return;
                } else if (interfaceC1317uE != InterfaceC1309l.b.f11958a) {
                    if (z3) {
                        b(y1.l0.f11974s.q("Full stream and gRPC message encoding cannot both be set").d());
                        return;
                    }
                    v(interfaceC1317uE);
                }
            }
            o().d(z2);
        }

        protected void F(y1.Z z2, y1.l0 l0Var) {
            AbstractC0829j.o(l0Var, "status");
            AbstractC0829j.o(z2, "trailers");
            if (this.f8837q) {
                AbstractC0931a.f8817g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{l0Var, z2});
            } else {
                this.f8829i.b(z2);
                N(l0Var, false, z2);
            }
        }

        protected final boolean G() {
            return this.f8836p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.AbstractC0935c.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0966s o() {
            return this.f8831k;
        }

        public final void K(InterfaceC0966s interfaceC0966s) {
            AbstractC0829j.u(this.f8831k == null, "Already called setListener");
            this.f8831k = (InterfaceC0966s) AbstractC0829j.o(interfaceC0966s, "listener");
        }

        public final void M(y1.l0 l0Var, InterfaceC0966s.a aVar, boolean z2, y1.Z z3) {
            AbstractC0829j.o(l0Var, "status");
            AbstractC0829j.o(z3, "trailers");
            if (!this.f8837q || z2) {
                this.f8837q = true;
                this.f8838r = l0Var.o();
                s();
                if (this.f8834n) {
                    this.f8835o = null;
                    C(l0Var, aVar, z3);
                } else {
                    this.f8835o = new RunnableC0136a(l0Var, aVar, z3);
                    k(z2);
                }
            }
        }

        public final void N(y1.l0 l0Var, boolean z2, y1.Z z3) {
            M(l0Var, InterfaceC0966s.a.PROCESSED, z2, z3);
        }

        public void e(boolean z2) {
            AbstractC0829j.u(this.f8837q, "status should have been reported on deframer closed");
            this.f8834n = true;
            if (this.f8838r && z2) {
                N(y1.l0.f11974s.q("Encountered end-of-stream mid-frame"), true, new y1.Z());
            }
            Runnable runnable = this.f8835o;
            if (runnable != null) {
                runnable.run();
                this.f8835o = null;
            }
        }
    }

    protected AbstractC0931a(X0 x02, P0 p02, V0 v02, y1.Z z2, C1300c c1300c, boolean z3) {
        AbstractC0829j.o(z2, "headers");
        this.f8818a = (V0) AbstractC0829j.o(v02, "transportTracer");
        this.f8820c = S.p(c1300c);
        this.f8821d = z3;
        if (z3) {
            this.f8819b = new C0135a(z2, p02);
        } else {
            this.f8819b = new C0958n0(this, x02, p02);
            this.f8822e = z2;
        }
    }

    @Override // io.grpc.internal.r
    public void c(int i3) {
        z().x(i3);
    }

    @Override // io.grpc.internal.r
    public final void d(y1.l0 l0Var) {
        AbstractC0829j.e(!l0Var.o(), "Should not cancel with OK status");
        this.f8823f = true;
        v().d(l0Var);
    }

    @Override // io.grpc.internal.r
    public void e(int i3) {
        this.f8819b.e(i3);
    }

    @Override // io.grpc.internal.r
    public final void g(InterfaceC0966s interfaceC0966s) {
        z().K(interfaceC0966s);
        if (this.f8821d) {
            return;
        }
        v().e(this.f8822e, null);
        this.f8822e = null;
    }

    @Override // io.grpc.internal.r
    public final void h(C1318v c1318v) {
        z().I(c1318v);
    }

    @Override // io.grpc.internal.AbstractC0935c, io.grpc.internal.Q0
    public final boolean i() {
        return super.i() && !this.f8823f;
    }

    @Override // io.grpc.internal.r
    public final void l(Y y2) {
        y2.b("remote_addr", f().b(AbstractC1291C.f11754a));
    }

    @Override // io.grpc.internal.r
    public void m(C1316t c1316t) {
        y1.Z z2 = this.f8822e;
        Z.g gVar = S.f8654d;
        z2.e(gVar);
        this.f8822e.p(gVar, Long.valueOf(Math.max(0L, c1316t.n(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.r
    public final void o() {
        if (z().G()) {
            return;
        }
        z().L();
        r();
    }

    @Override // io.grpc.internal.C0958n0.d
    public final void p(W0 w02, boolean z2, boolean z3, int i3) {
        AbstractC0829j.e(w02 != null || z2, "null frame before EOS");
        v().f(w02, z2, z3, i3);
    }

    @Override // io.grpc.internal.r
    public final void q(boolean z2) {
        z().J(z2);
    }

    @Override // io.grpc.internal.AbstractC0935c
    protected final P s() {
        return this.f8819b;
    }

    protected abstract b v();

    protected V0 x() {
        return this.f8818a;
    }

    public final boolean y() {
        return this.f8820c;
    }

    protected abstract c z();

    /* JADX INFO: renamed from: io.grpc.internal.a$a, reason: collision with other inner class name */
    private class C0135a implements P {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y1.Z f8824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final P0 f8826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f8827d;

        public C0135a(y1.Z z2, P0 p02) {
            this.f8824a = (y1.Z) AbstractC0829j.o(z2, "headers");
            this.f8826c = (P0) AbstractC0829j.o(p02, "statsTraceCtx");
        }

        @Override // io.grpc.internal.P
        public boolean b() {
            return this.f8825b;
        }

        @Override // io.grpc.internal.P
        public void c(InputStream inputStream) {
            AbstractC0829j.u(this.f8827d == null, "writePayload should not be called multiple times");
            try {
                this.f8827d = AbstractC0871b.d(inputStream);
                this.f8826c.i(0);
                P0 p02 = this.f8826c;
                byte[] bArr = this.f8827d;
                p02.j(0, bArr.length, bArr.length);
                this.f8826c.k(this.f8827d.length);
                this.f8826c.l(this.f8827d.length);
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // io.grpc.internal.P
        public void close() {
            this.f8825b = true;
            AbstractC0829j.u(this.f8827d != null, "Lack of request message. GET request is only supported for unary requests");
            AbstractC0931a.this.v().e(this.f8824a, this.f8827d);
            this.f8827d = null;
            this.f8824a = null;
        }

        @Override // io.grpc.internal.P
        public void e(int i3) {
        }

        @Override // io.grpc.internal.P
        public void flush() {
        }

        @Override // io.grpc.internal.P
        public P a(InterfaceC1311n interfaceC1311n) {
            return this;
        }
    }
}
