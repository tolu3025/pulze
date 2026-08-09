package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.AbstractC1304g;
import y1.C1316t;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends AbstractC1304g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f8303j = Logger.getLogger(A.class.getName());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AbstractC1304g f8304k = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledFuture f8305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f8306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y1.r f8307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f8308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC1304g.a f8309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC1304g f8310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y1.l0 f8311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f8312h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f8313i;

    class a extends AbstractRunnableC0978y {
        a(y1.r rVar) {
            super(rVar);
        }

        @Override // io.grpc.internal.AbstractRunnableC0978y
        public void a() {
            A.this.m();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f8315a;

        b(StringBuilder sb) {
            this.f8315a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            A.this.k(y1.l0.f11964i.q(this.f8315a.toString()), true);
        }
    }

    class c extends AbstractRunnableC0978y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f8317b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(A.this.f8307c);
            this.f8317b = kVar;
        }

        @Override // io.grpc.internal.AbstractRunnableC0978y
        public void a() {
            this.f8317b.g();
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1304g.a f8319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.Z f8320b;

        d(AbstractC1304g.a aVar, y1.Z z2) {
            this.f8319a = aVar;
            this.f8320b = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            A.this.f8310f.e(this.f8319a, this.f8320b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y1.l0 f8322a;

        e(y1.l0 l0Var) {
            this.f8322a = l0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            A.this.f8310f.a(this.f8322a.n(), this.f8322a.l());
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f8324a;

        f(Object obj) {
            this.f8324a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            A.this.f8310f.d(this.f8324a);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8326a;

        g(int i3) {
            this.f8326a = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            A.this.f8310f.c(this.f8326a);
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            A.this.f8310f.b();
        }
    }

    private final class j extends AbstractRunnableC0978y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AbstractC1304g.a f8329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final y1.l0 f8330c;

        j(AbstractC1304g.a aVar, y1.l0 l0Var) {
            super(A.this.f8307c);
            this.f8329b = aVar;
            this.f8330c = l0Var;
        }

        @Override // io.grpc.internal.AbstractRunnableC0978y
        public void a() {
            this.f8329b.a(this.f8330c, new y1.Z());
        }
    }

    private static final class k extends AbstractC1304g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1304g.a f8332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f8333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f8334c = new ArrayList();

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1.Z f8335a;

            a(y1.Z z2) {
                this.f8335a = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f8332a.b(this.f8335a);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f8337a;

            b(Object obj) {
                this.f8337a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f8332a.c(this.f8337a);
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1.l0 f8339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y1.Z f8340b;

            c(y1.l0 l0Var, y1.Z z2) {
                this.f8339a = l0Var;
                this.f8340b = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f8332a.a(this.f8339a, this.f8340b);
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f8332a.d();
            }
        }

        public k(AbstractC1304g.a aVar) {
            this.f8332a = aVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f8333b) {
                        runnable.run();
                    } else {
                        this.f8334c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y1.AbstractC1304g.a
        public void a(y1.l0 l0Var, y1.Z z2) {
            f(new c(l0Var, z2));
        }

        @Override // y1.AbstractC1304g.a
        public void b(y1.Z z2) {
            if (this.f8333b) {
                this.f8332a.b(z2);
            } else {
                f(new a(z2));
            }
        }

        @Override // y1.AbstractC1304g.a
        public void c(Object obj) {
            if (this.f8333b) {
                this.f8332a.c(obj);
            } else {
                f(new b(obj));
            }
        }

        @Override // y1.AbstractC1304g.a
        public void d() {
            if (this.f8333b) {
                this.f8332a.d();
            } else {
                f(new d());
            }
        }

        void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f8334c.isEmpty()) {
                            this.f8334c = null;
                            this.f8333b = true;
                            return;
                        } else {
                            list = this.f8334c;
                            this.f8334c = arrayList;
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

    protected A(Executor executor, ScheduledExecutorService scheduledExecutorService, C1316t c1316t) {
        this.f8306b = (Executor) AbstractC0829j.o(executor, "callExecutor");
        AbstractC0829j.o(scheduledExecutorService, "scheduler");
        this.f8307c = y1.r.e();
        this.f8305a = o(scheduledExecutorService, c1316t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(y1.l0 l0Var, boolean z2) {
        boolean z3;
        AbstractC1304g.a aVar;
        synchronized (this) {
            try {
                if (this.f8310f == null) {
                    q(f8304k);
                    aVar = this.f8309e;
                    this.f8311g = l0Var;
                    z3 = false;
                } else {
                    if (z2) {
                        return;
                    }
                    z3 = true;
                    aVar = null;
                }
                if (z3) {
                    l(new e(l0Var));
                } else {
                    if (aVar != null) {
                        this.f8306b.execute(new j(aVar, l0Var));
                    }
                    m();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f8308d) {
                    runnable.run();
                } else {
                    this.f8312h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f8312h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f8312h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f8308d = r0     // Catch: java.lang.Throwable -> L24
            io.grpc.internal.A$k r0 = r3.f8313i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f8306b
            io.grpc.internal.A$c r2 = new io.grpc.internal.A$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f8312h     // Catch: java.lang.Throwable -> L24
            r3.f8312h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.A.m():void");
    }

    private boolean n(C1316t c1316t, C1316t c1316t2) {
        if (c1316t2 == null) {
            return true;
        }
        if (c1316t == null) {
            return false;
        }
        return c1316t.k(c1316t2);
    }

    private ScheduledFuture o(ScheduledExecutorService scheduledExecutorService, C1316t c1316t) {
        String str;
        C1316t c1316tG = this.f8307c.g();
        if (c1316t == null && c1316tG == null) {
            return null;
        }
        long jN = c1316t != null ? c1316t.n(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (c1316tG != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (c1316tG.n(timeUnit) < jN) {
                jN = c1316tG.n(timeUnit);
                Logger logger = f8303j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jN)));
                    sb.append(c1316t == null ? " Explicit call timeout was not set." : String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c1316t.n(timeUnit))));
                    logger.fine(sb.toString());
                }
            }
        }
        long jAbs = Math.abs(jN);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit2.toNanos(1L);
        long jAbs2 = Math.abs(jN) % timeUnit2.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        String str2 = n(c1316tG, c1316t) ? "Context" : "CallOptions";
        if (jN < 0) {
            sb2.append("ClientCall started after ");
            sb2.append(str2);
            str = " deadline was exceeded. Deadline has been exceeded for ";
        } else {
            sb2.append("Deadline ");
            sb2.append(str2);
            str = " will be exceeded in ";
        }
        sb2.append(str);
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new b(sb2), jN, TimeUnit.NANOSECONDS);
    }

    private void q(AbstractC1304g abstractC1304g) {
        AbstractC1304g abstractC1304g2 = this.f8310f;
        AbstractC0829j.w(abstractC1304g2 == null, "realCall already set to %s", abstractC1304g2);
        ScheduledFuture scheduledFuture = this.f8305a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f8310f = abstractC1304g;
    }

    @Override // y1.AbstractC1304g
    public final void a(String str, Throwable th) {
        y1.l0 l0Var = y1.l0.f11961f;
        if (str == null) {
            str = "Call cancelled without message";
        }
        y1.l0 l0VarQ = l0Var.q(str);
        if (th != null) {
            l0VarQ = l0VarQ.p(th);
        }
        k(l0VarQ, false);
    }

    @Override // y1.AbstractC1304g
    public final void b() {
        l(new h());
    }

    @Override // y1.AbstractC1304g
    public final void c(int i3) {
        if (this.f8308d) {
            this.f8310f.c(i3);
        } else {
            l(new g(i3));
        }
    }

    @Override // y1.AbstractC1304g
    public final void d(Object obj) {
        if (this.f8308d) {
            this.f8310f.d(obj);
        } else {
            l(new f(obj));
        }
    }

    @Override // y1.AbstractC1304g
    public final void e(AbstractC1304g.a aVar, y1.Z z2) {
        y1.l0 l0Var;
        boolean z3;
        AbstractC0829j.u(this.f8309e == null, "already started");
        synchronized (this) {
            try {
                this.f8309e = (AbstractC1304g.a) AbstractC0829j.o(aVar, "listener");
                l0Var = this.f8311g;
                z3 = this.f8308d;
                if (!z3) {
                    k kVar = new k(aVar);
                    this.f8313i = kVar;
                    aVar = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l0Var != null) {
            this.f8306b.execute(new j(aVar, l0Var));
        } else if (z3) {
            this.f8310f.e(aVar, z2);
        } else {
            l(new d(aVar, z2));
        }
    }

    protected void j() {
    }

    public final Runnable p(AbstractC1304g abstractC1304g) {
        synchronized (this) {
            try {
                if (this.f8310f != null) {
                    return null;
                }
                q((AbstractC1304g) AbstractC0829j.o(abstractC1304g, "call"));
                return new a(this.f8307c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return AbstractC0825f.b(this).d("realCall", this.f8310f).toString();
    }

    class i extends AbstractC1304g {
        i() {
        }

        @Override // y1.AbstractC1304g
        public void a(String str, Throwable th) {
        }

        @Override // y1.AbstractC1304g
        public void b() {
        }

        @Override // y1.AbstractC1304g
        public void c(int i3) {
        }

        @Override // y1.AbstractC1304g
        public void d(Object obj) {
        }

        @Override // y1.AbstractC1304g
        public void e(AbstractC1304g.a aVar, y1.Z z2) {
        }
    }
}
