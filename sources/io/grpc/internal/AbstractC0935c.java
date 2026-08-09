package io.grpc.internal;

import e0.AbstractC0829j;
import io.grpc.internal.C0939e;
import io.grpc.internal.C0956m0;
import io.grpc.internal.R0;
import java.io.InputStream;
import y1.InterfaceC1309l;
import y1.InterfaceC1311n;
import y1.InterfaceC1317u;

/* JADX INFO: renamed from: io.grpc.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0935c implements Q0 {

    /* JADX INFO: renamed from: io.grpc.internal.c$a */
    public static abstract class a implements C0939e.h, C0956m0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC0979z f8846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f8847b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final P0 f8848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final V0 f8849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C0956m0 f8850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f8851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f8852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f8853h;

        /* JADX INFO: renamed from: io.grpc.internal.c$a$a, reason: collision with other inner class name */
        class RunnableC0137a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ H1.b f8854a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f8855b;

            RunnableC0137a(H1.b bVar, int i3) {
                this.f8854a = bVar;
                this.f8855b = i3;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    H1.e eVarH = H1.c.h("AbstractStream.request");
                    try {
                        H1.c.e(this.f8854a);
                        a.this.f8846a.b(this.f8855b);
                        if (eVarH != null) {
                            eVarH.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    a.this.b(th);
                }
            }
        }

        protected a(int i3, P0 p02, V0 v02) {
            this.f8848c = (P0) AbstractC0829j.o(p02, "statsTraceCtx");
            this.f8849d = (V0) AbstractC0829j.o(v02, "transportTracer");
            C0956m0 c0956m0 = new C0956m0(this, InterfaceC1309l.b.f11958a, i3, p02, v02);
            this.f8850e = c0956m0;
            this.f8846a = c0956m0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean n() {
            boolean z2;
            synchronized (this.f8847b) {
                try {
                    z2 = this.f8852g && this.f8851f < 32768 && !this.f8853h;
                } finally {
                }
            }
            return z2;
        }

        private void p() {
            boolean zN;
            synchronized (this.f8847b) {
                zN = n();
            }
            if (zN) {
                o().b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(int i3) {
            synchronized (this.f8847b) {
                this.f8851f += i3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(int i3) {
            c(new RunnableC0137a(H1.c.f(), i3));
        }

        @Override // io.grpc.internal.C0956m0.b
        public void a(R0.a aVar) {
            o().a(aVar);
        }

        public final void d(int i3) {
            boolean z2;
            synchronized (this.f8847b) {
                AbstractC0829j.u(this.f8852g, "onStreamAllocated was not called, but it seems the stream is active");
                int i4 = this.f8851f;
                z2 = false;
                boolean z3 = i4 < 32768;
                int i5 = i4 - i3;
                this.f8851f = i5;
                boolean z4 = i5 < 32768;
                if (!z3 && z4) {
                    z2 = true;
                }
            }
            if (z2) {
                p();
            }
        }

        protected final void k(boolean z2) {
            if (z2) {
                this.f8846a.close();
            } else {
                this.f8846a.l();
            }
        }

        protected final void l(z0 z0Var) {
            try {
                this.f8846a.q(z0Var);
            } catch (Throwable th) {
                b(th);
            }
        }

        protected V0 m() {
            return this.f8849d;
        }

        protected abstract R0 o();

        protected void r() {
            AbstractC0829j.t(o() != null);
            synchronized (this.f8847b) {
                AbstractC0829j.u(!this.f8852g, "Already allocated");
                this.f8852g = true;
            }
            p();
        }

        protected final void s() {
            synchronized (this.f8847b) {
                this.f8853h = true;
            }
        }

        final void t() {
            this.f8850e.W(this);
            this.f8846a = this.f8850e;
        }

        protected final void v(InterfaceC1317u interfaceC1317u) {
            this.f8846a.f(interfaceC1317u);
        }

        protected void w(T t2) {
            this.f8850e.V(t2);
            this.f8846a = new C0939e(this, this, this.f8850e);
        }

        final void x(int i3) {
            this.f8846a.c(i3);
        }
    }

    @Override // io.grpc.internal.Q0
    public final void a(InterfaceC1311n interfaceC1311n) {
        s().a((InterfaceC1311n) AbstractC0829j.o(interfaceC1311n, "compressor"));
    }

    @Override // io.grpc.internal.Q0
    public final void b(int i3) {
        u().u(i3);
    }

    @Override // io.grpc.internal.Q0
    public final void flush() {
        if (s().b()) {
            return;
        }
        s().flush();
    }

    @Override // io.grpc.internal.Q0
    public boolean i() {
        return u().n();
    }

    @Override // io.grpc.internal.Q0
    public final void j(InputStream inputStream) {
        AbstractC0829j.o(inputStream, "message");
        try {
            if (!s().b()) {
                s().c(inputStream);
            }
        } finally {
            S.e(inputStream);
        }
    }

    @Override // io.grpc.internal.Q0
    public void n() {
        u().t();
    }

    protected final void r() {
        s().close();
    }

    protected abstract P s();

    protected final void t(int i3) {
        u().q(i3);
    }

    protected abstract a u();
}
