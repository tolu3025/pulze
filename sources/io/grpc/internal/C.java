package io.grpc.internal;

import e0.AbstractC0829j;
import io.grpc.internal.InterfaceC0966s;
import io.grpc.internal.R0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y1.C1316t;
import y1.C1318v;
import y1.InterfaceC1311n;

/* JADX INFO: loaded from: classes.dex */
class C implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f8380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0966s f8381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f8382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y1.l0 f8383d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o f8385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f8386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8387h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f8384e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f8388i = new ArrayList();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8389a;

        a(int i3) {
            this.f8389a = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.b(this.f8389a);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.n();
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1311n f8392a;

        c(InterfaceC1311n interfaceC1311n) {
            this.f8392a = interfaceC1311n;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.a(this.f8392a);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8394a;

        d(boolean z2) {
            this.f8394a = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.q(this.f8394a);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1318v f8396a;

        e(C1318v c1318v) {
            this.f8396a = c1318v;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.h(this.f8396a);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8398a;

        f(int i3) {
            this.f8398a = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.c(this.f8398a);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8400a;

        g(int i3) {
            this.f8400a = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.e(this.f8400a);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1316t f8402a;

        h(C1316t c1316t) {
            this.f8402a = c1316t;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.m(this.f8402a);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.t();
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8405a;

        j(String str) {
            this.f8405a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.k(this.f8405a);
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f8407a;

        k(InputStream inputStream) {
            this.f8407a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.j(this.f8407a);
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.flush();
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y1.l0 f8410a;

        m(y1.l0 l0Var) {
            this.f8410a = l0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.d(this.f8410a);
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C.this.f8382c.o();
        }
    }

    private static class o implements InterfaceC0966s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0966s f8413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f8414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f8415c = new ArrayList();

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ R0.a f8416a;

            a(R0.a aVar) {
                this.f8416a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f8413a.a(this.f8416a);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f8413a.b();
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1.Z f8419a;

            c(y1.Z z2) {
                this.f8419a = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f8413a.d(this.f8419a);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1.l0 f8421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0966s.a f8422b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y1.Z f8423c;

            d(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
                this.f8421a = l0Var;
                this.f8422b = aVar;
                this.f8423c = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f8413a.c(this.f8421a, this.f8422b, this.f8423c);
            }
        }

        public o(InterfaceC0966s interfaceC0966s) {
            this.f8413a = interfaceC0966s;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f8414b) {
                        runnable.run();
                    } else {
                        this.f8415c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.R0
        public void a(R0.a aVar) {
            if (this.f8414b) {
                this.f8413a.a(aVar);
            } else {
                f(new a(aVar));
            }
        }

        @Override // io.grpc.internal.R0
        public void b() {
            if (this.f8414b) {
                this.f8413a.b();
            } else {
                f(new b());
            }
        }

        @Override // io.grpc.internal.InterfaceC0966s
        public void c(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
            f(new d(l0Var, aVar, z2));
        }

        @Override // io.grpc.internal.InterfaceC0966s
        public void d(y1.Z z2) {
            f(new c(z2));
        }

        public void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f8415c.isEmpty()) {
                            this.f8415c = null;
                            this.f8414b = true;
                            return;
                        } else {
                            list = this.f8415c;
                            this.f8415c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    C() {
    }

    private void s(Runnable runnable) {
        AbstractC0829j.u(this.f8381b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f8380a) {
                    runnable.run();
                } else {
                    this.f8384e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f8384e     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.f8384e = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.f8380a = r0     // Catch: java.lang.Throwable -> L1d
            io.grpc.internal.C$o r0 = r3.f8385f     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.g()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.f8384e     // Catch: java.lang.Throwable -> L1d
            r3.f8384e = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C.t():void");
    }

    private void u(InterfaceC0966s interfaceC0966s) {
        Iterator it = this.f8388i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f8388i = null;
        this.f8382c.g(interfaceC0966s);
    }

    private void w(r rVar) {
        r rVar2 = this.f8382c;
        AbstractC0829j.w(rVar2 == null, "realStream already set to %s", rVar2);
        this.f8382c = rVar;
        this.f8387h = System.nanoTime();
    }

    @Override // io.grpc.internal.Q0
    public void a(InterfaceC1311n interfaceC1311n) {
        AbstractC0829j.u(this.f8381b == null, "May only be called before start");
        AbstractC0829j.o(interfaceC1311n, "compressor");
        this.f8388i.add(new c(interfaceC1311n));
    }

    @Override // io.grpc.internal.Q0
    public void b(int i3) {
        AbstractC0829j.u(this.f8381b != null, "May only be called after start");
        if (this.f8380a) {
            this.f8382c.b(i3);
        } else {
            s(new a(i3));
        }
    }

    @Override // io.grpc.internal.r
    public void c(int i3) {
        AbstractC0829j.u(this.f8381b == null, "May only be called before start");
        this.f8388i.add(new f(i3));
    }

    @Override // io.grpc.internal.r
    public void d(y1.l0 l0Var) {
        boolean z2 = false;
        AbstractC0829j.u(this.f8381b != null, "May only be called after start");
        AbstractC0829j.o(l0Var, "reason");
        synchronized (this) {
            try {
                if (this.f8382c == null) {
                    w(C0962p0.f9250a);
                    this.f8383d = l0Var;
                } else {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            s(new m(l0Var));
            return;
        }
        t();
        v(l0Var);
        this.f8381b.c(l0Var, InterfaceC0966s.a.PROCESSED, new y1.Z());
    }

    @Override // io.grpc.internal.r
    public void e(int i3) {
        AbstractC0829j.u(this.f8381b == null, "May only be called before start");
        this.f8388i.add(new g(i3));
    }

    @Override // io.grpc.internal.Q0
    public void flush() {
        AbstractC0829j.u(this.f8381b != null, "May only be called after start");
        if (this.f8380a) {
            this.f8382c.flush();
        } else {
            s(new l());
        }
    }

    @Override // io.grpc.internal.r
    public void g(InterfaceC0966s interfaceC0966s) {
        y1.l0 l0Var;
        boolean z2;
        AbstractC0829j.o(interfaceC0966s, "listener");
        AbstractC0829j.u(this.f8381b == null, "already started");
        synchronized (this) {
            try {
                l0Var = this.f8383d;
                z2 = this.f8380a;
                if (!z2) {
                    o oVar = new o(interfaceC0966s);
                    this.f8385f = oVar;
                    interfaceC0966s = oVar;
                }
                this.f8381b = interfaceC0966s;
                this.f8386g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l0Var != null) {
            interfaceC0966s.c(l0Var, InterfaceC0966s.a.PROCESSED, new y1.Z());
        } else if (z2) {
            u(interfaceC0966s);
        }
    }

    @Override // io.grpc.internal.r
    public void h(C1318v c1318v) {
        AbstractC0829j.u(this.f8381b == null, "May only be called before start");
        AbstractC0829j.o(c1318v, "decompressorRegistry");
        this.f8388i.add(new e(c1318v));
    }

    @Override // io.grpc.internal.Q0
    public boolean i() {
        if (this.f8380a) {
            return this.f8382c.i();
        }
        return false;
    }

    @Override // io.grpc.internal.Q0
    public void j(InputStream inputStream) {
        AbstractC0829j.u(this.f8381b != null, "May only be called after start");
        AbstractC0829j.o(inputStream, "message");
        if (this.f8380a) {
            this.f8382c.j(inputStream);
        } else {
            s(new k(inputStream));
        }
    }

    @Override // io.grpc.internal.r
    public void k(String str) {
        AbstractC0829j.u(this.f8381b == null, "May only be called before start");
        AbstractC0829j.o(str, "authority");
        this.f8388i.add(new j(str));
    }

    @Override // io.grpc.internal.r
    public void l(Y y2) {
        synchronized (this) {
            try {
                if (this.f8381b == null) {
                    return;
                }
                if (this.f8382c != null) {
                    y2.b("buffered_nanos", Long.valueOf(this.f8387h - this.f8386g));
                    this.f8382c.l(y2);
                } else {
                    y2.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f8386g));
                    y2.a("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.r
    public void m(C1316t c1316t) {
        AbstractC0829j.u(this.f8381b == null, "May only be called before start");
        this.f8388i.add(new h(c1316t));
    }

    @Override // io.grpc.internal.Q0
    public void n() {
        AbstractC0829j.u(this.f8381b == null, "May only be called before start");
        this.f8388i.add(new b());
    }

    @Override // io.grpc.internal.r
    public void o() {
        AbstractC0829j.u(this.f8381b != null, "May only be called after start");
        s(new n());
    }

    @Override // io.grpc.internal.r
    public void q(boolean z2) {
        AbstractC0829j.u(this.f8381b == null, "May only be called before start");
        this.f8388i.add(new d(z2));
    }

    final Runnable x(r rVar) {
        synchronized (this) {
            try {
                if (this.f8382c != null) {
                    return null;
                }
                w((r) AbstractC0829j.o(rVar, "stream"));
                InterfaceC0966s interfaceC0966s = this.f8381b;
                if (interfaceC0966s == null) {
                    this.f8384e = null;
                    this.f8380a = true;
                }
                if (interfaceC0966s == null) {
                    return null;
                }
                u(interfaceC0966s);
                return new i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void v(y1.l0 l0Var) {
    }
}
