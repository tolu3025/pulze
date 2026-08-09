package A1;

import A1.b;
import e0.AbstractC0829j;
import io.grpc.internal.K0;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
final class a implements m2.r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K0 f318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.a f319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f320e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private m2.r f324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Socket f325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f328r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f316a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2.d f317b = new m2.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f321f = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f322l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f323m = false;

    /* JADX INFO: renamed from: A1.a$a, reason: collision with other inner class name */
    class C0001a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final H1.b f329b;

        C0001a() {
            super(a.this, null);
            this.f329b = H1.c.f();
        }

        @Override // A1.a.e
        public void a() {
            int i3;
            m2.d dVar = new m2.d();
            H1.e eVarH = H1.c.h("WriteRunnable.runWrite");
            try {
                H1.c.e(this.f329b);
                synchronized (a.this.f316a) {
                    dVar.T(a.this.f317b, a.this.f317b.q());
                    a.this.f321f = false;
                    i3 = a.this.f328r;
                }
                a.this.f324n.T(dVar, dVar.b0());
                synchronized (a.this.f316a) {
                    a.q(a.this, i3);
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

    class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final H1.b f331b;

        b() {
            super(a.this, null);
            this.f331b = H1.c.f();
        }

        @Override // A1.a.e
        public void a() {
            m2.d dVar = new m2.d();
            H1.e eVarH = H1.c.h("WriteRunnable.runFlush");
            try {
                H1.c.e(this.f331b);
                synchronized (a.this.f316a) {
                    dVar.T(a.this.f317b, a.this.f317b.b0());
                    a.this.f322l = false;
                }
                a.this.f324n.T(dVar, dVar.b0());
                a.this.f324n.flush();
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

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f324n != null && a.this.f317b.b0() > 0) {
                    a.this.f324n.T(a.this.f317b, a.this.f317b.b0());
                }
            } catch (IOException e3) {
                a.this.f319d.e(e3);
            }
            a.this.f317b.close();
            try {
                if (a.this.f324n != null) {
                    a.this.f324n.close();
                }
            } catch (IOException e4) {
                a.this.f319d.e(e4);
            }
            try {
                if (a.this.f325o != null) {
                    a.this.f325o.close();
                }
            } catch (IOException e5) {
                a.this.f319d.e(e5);
            }
        }
    }

    private class d extends A1.c {
        public d(C1.c cVar) {
            super(cVar);
        }

        @Override // A1.c, C1.c
        public void d(int i3, C1.a aVar) {
            a.K(a.this);
            super.d(i3, aVar);
        }

        @Override // A1.c, C1.c
        public void e(boolean z2, int i3, int i4) {
            if (z2) {
                a.K(a.this);
            }
            super.e(z2, i3, i4);
        }

        @Override // A1.c, C1.c
        public void j(C1.i iVar) {
            a.K(a.this);
            super.j(iVar);
        }
    }

    private abstract class e implements Runnable {
        private e() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.this.f324n == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e3) {
                a.this.f319d.e(e3);
            }
        }

        /* synthetic */ e(a aVar, C0001a c0001a) {
            this();
        }
    }

    private a(K0 k02, b.a aVar, int i3) {
        this.f318c = (K0) AbstractC0829j.o(k02, "executor");
        this.f319d = (b.a) AbstractC0829j.o(aVar, "exceptionHandler");
        this.f320e = i3;
    }

    static /* synthetic */ int K(a aVar) {
        int i3 = aVar.f327q;
        aVar.f327q = i3 + 1;
        return i3;
    }

    static a R(K0 k02, b.a aVar, int i3) {
        return new a(k02, aVar, i3);
    }

    static /* synthetic */ int q(a aVar, int i3) {
        int i4 = aVar.f328r - i3;
        aVar.f328r = i4;
        return i4;
    }

    void L(m2.r rVar, Socket socket) {
        AbstractC0829j.u(this.f324n == null, "AsyncSink's becomeConnected should only be called once.");
        this.f324n = (m2.r) AbstractC0829j.o(rVar, "sink");
        this.f325o = (Socket) AbstractC0829j.o(socket, "socket");
    }

    C1.c P(C1.c cVar) {
        return new d(cVar);
    }

    @Override // m2.r
    public void T(m2.d dVar, long j3) throws IOException {
        AbstractC0829j.o(dVar, "source");
        if (this.f323m) {
            throw new IOException("closed");
        }
        H1.e eVarH = H1.c.h("AsyncSink.write");
        try {
            synchronized (this.f316a) {
                try {
                    this.f317b.T(dVar, j3);
                    int i3 = this.f328r + this.f327q;
                    this.f328r = i3;
                    boolean z2 = false;
                    this.f327q = 0;
                    if (this.f326p || i3 <= this.f320e) {
                        if (!this.f321f && !this.f322l && this.f317b.q() > 0) {
                            this.f321f = true;
                        }
                        if (eVarH != null) {
                            eVarH.close();
                            return;
                        }
                        return;
                    }
                    this.f326p = true;
                    z2 = true;
                    if (!z2) {
                        this.f318c.execute(new C0001a());
                        if (eVarH != null) {
                            eVarH.close();
                            return;
                        }
                        return;
                    }
                    try {
                        this.f325o.close();
                    } catch (IOException e3) {
                        this.f319d.e(e3);
                    }
                    if (eVarH != null) {
                        eVarH.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (eVarH != null) {
                try {
                    eVarH.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // m2.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f323m) {
            return;
        }
        this.f323m = true;
        this.f318c.execute(new c());
    }

    @Override // m2.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f323m) {
            throw new IOException("closed");
        }
        H1.e eVarH = H1.c.h("AsyncSink.flush");
        try {
            synchronized (this.f316a) {
                if (this.f322l) {
                    if (eVarH != null) {
                        eVarH.close();
                    }
                } else {
                    this.f322l = true;
                    this.f318c.execute(new b());
                    if (eVarH != null) {
                        eVarH.close();
                    }
                }
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
