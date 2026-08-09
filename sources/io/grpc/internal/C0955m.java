package io.grpc.internal;

import com.google.android.gms.common.api.a;
import e0.AbstractC0829j;
import io.grpc.internal.C0960o0;
import io.grpc.internal.InterfaceC0970u;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import y1.AbstractC1299b;
import y1.AbstractC1303f;
import y1.AbstractC1308k;
import y1.C1300c;
import y1.C1310m;

/* JADX INFO: renamed from: io.grpc.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0955m implements InterfaceC0970u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0970u f9160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1299b f9161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f9162c;

    /* JADX INFO: renamed from: io.grpc.internal.m$a */
    private class a extends K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0974w f9163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9164b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile y1.l0 f9166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private y1.l0 f9167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private y1.l0 f9168f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f9165c = new AtomicInteger(-2147483647);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C0960o0.a f9169g = new C0139a();

        /* JADX INFO: renamed from: io.grpc.internal.m$a$a, reason: collision with other inner class name */
        class C0139a implements C0960o0.a {
            C0139a() {
            }

            @Override // io.grpc.internal.C0960o0.a
            public void a() {
                if (a.this.f9165c.decrementAndGet() == 0) {
                    a.this.k();
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.m$a$b */
        class b extends AbstractC1299b.AbstractC0192b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1.a0 f9172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1300c f9173b;

            b(y1.a0 a0Var, C1300c c1300c) {
                this.f9172a = a0Var;
                this.f9173b = c1300c;
            }
        }

        a(InterfaceC0974w interfaceC0974w, String str) {
            this.f9163a = (InterfaceC0974w) AbstractC0829j.o(interfaceC0974w, "delegate");
            this.f9164b = (String) AbstractC0829j.o(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            synchronized (this) {
                try {
                    if (this.f9165c.get() != 0) {
                        return;
                    }
                    y1.l0 l0Var = this.f9167e;
                    y1.l0 l0Var2 = this.f9168f;
                    this.f9167e = null;
                    this.f9168f = null;
                    if (l0Var != null) {
                        super.d(l0Var);
                    }
                    if (l0Var2 != null) {
                        super.i(l0Var2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.K
        protected InterfaceC0974w a() {
            return this.f9163a;
        }

        @Override // io.grpc.internal.K, io.grpc.internal.InterfaceC0968t
        public r b(y1.a0 a0Var, y1.Z z2, C1300c c1300c, AbstractC1308k[] abstractC1308kArr) {
            AbstractC1299b abstractC1299bC = c1300c.c();
            if (abstractC1299bC == null) {
                abstractC1299bC = C0955m.this.f9161b;
            } else if (C0955m.this.f9161b != null) {
                abstractC1299bC = new C1310m(C0955m.this.f9161b, abstractC1299bC);
            }
            if (abstractC1299bC == null) {
                return this.f9165c.get() >= 0 ? new G(this.f9166d, abstractC1308kArr) : this.f9163a.b(a0Var, z2, c1300c, abstractC1308kArr);
            }
            C0960o0 c0960o0 = new C0960o0(this.f9163a, a0Var, z2, c1300c, this.f9169g, abstractC1308kArr);
            if (this.f9165c.incrementAndGet() > 0) {
                this.f9169g.a();
                return new G(this.f9166d, abstractC1308kArr);
            }
            try {
                abstractC1299bC.a(new b(a0Var, c1300c), C0955m.this.f9162c, c0960o0);
            } catch (Throwable th) {
                c0960o0.b(y1.l0.f11968m.q("Credentials should use fail() instead of throwing exceptions").p(th));
            }
            return c0960o0.d();
        }

        @Override // io.grpc.internal.K, io.grpc.internal.InterfaceC0954l0
        public void d(y1.l0 l0Var) {
            AbstractC0829j.o(l0Var, "status");
            synchronized (this) {
                try {
                    if (this.f9165c.get() < 0) {
                        this.f9166d = l0Var;
                        this.f9165c.addAndGet(a.e.API_PRIORITY_OTHER);
                        if (this.f9165c.get() != 0) {
                            this.f9167e = l0Var;
                        } else {
                            super.d(l0Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.K, io.grpc.internal.InterfaceC0954l0
        public void i(y1.l0 l0Var) {
            AbstractC0829j.o(l0Var, "status");
            synchronized (this) {
                try {
                    if (this.f9165c.get() < 0) {
                        this.f9166d = l0Var;
                        this.f9165c.addAndGet(a.e.API_PRIORITY_OTHER);
                    } else if (this.f9168f != null) {
                        return;
                    }
                    if (this.f9165c.get() != 0) {
                        this.f9168f = l0Var;
                    } else {
                        super.i(l0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C0955m(InterfaceC0970u interfaceC0970u, AbstractC1299b abstractC1299b, Executor executor) {
        this.f9160a = (InterfaceC0970u) AbstractC0829j.o(interfaceC0970u, "delegate");
        this.f9161b = abstractC1299b;
        this.f9162c = (Executor) AbstractC0829j.o(executor, "appExecutor");
    }

    @Override // io.grpc.internal.InterfaceC0970u
    public ScheduledExecutorService F() {
        return this.f9160a.F();
    }

    @Override // io.grpc.internal.InterfaceC0970u
    public InterfaceC0974w H(SocketAddress socketAddress, InterfaceC0970u.a aVar, AbstractC1303f abstractC1303f) {
        return new a(this.f9160a.H(socketAddress, aVar, abstractC1303f), aVar.a());
    }

    @Override // io.grpc.internal.InterfaceC0970u
    public Collection Q() {
        return this.f9160a.Q();
    }

    @Override // io.grpc.internal.InterfaceC0970u, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9160a.close();
    }
}
