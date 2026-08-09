package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import io.grpc.internal.C0952k0;
import io.grpc.internal.InterfaceC0966s;
import io.grpc.internal.R0;
import j0.AbstractC0983b;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.AbstractC1295G;
import y1.AbstractC1296H;
import y1.AbstractC1304g;
import y1.AbstractC1308k;
import y1.AbstractC1315s;
import y1.C1300c;
import y1.C1312o;
import y1.C1316t;
import y1.C1318v;
import y1.InterfaceC1309l;
import y1.InterfaceC1311n;
import y1.Z;
import y1.a0;
import y1.l0;
import y1.r;

/* JADX INFO: renamed from: io.grpc.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0963q extends AbstractC1304g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Logger f9251t = Logger.getLogger(C0963q.class.getName());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte[] f9252u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final double f9253v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.a0 f9254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H1.d f9255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f9256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0957n f9258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y1.r f9259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile ScheduledFuture f9260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1300c f9262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r f9263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f9264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f9266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e f9267n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ScheduledExecutorService f9269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9270q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f f9268o = new f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C1318v f9271r = C1318v.c();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C1312o f9272s = C1312o.a();

    /* JADX INFO: renamed from: io.grpc.internal.q$b */
    class b extends AbstractRunnableC0978y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1304g.a f9273b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC1304g.a aVar) {
            super(C0963q.this.f9259f);
            this.f9273b = aVar;
        }

        @Override // io.grpc.internal.AbstractRunnableC0978y
        public void a() {
            C0963q c0963q = C0963q.this;
            c0963q.t(this.f9273b, AbstractC1315s.a(c0963q.f9259f), new y1.Z());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.q$c */
    class c extends AbstractRunnableC0978y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1304g.a f9275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9276c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC1304g.a aVar, String str) {
            super(C0963q.this.f9259f);
            this.f9275b = aVar;
            this.f9276c = str;
        }

        @Override // io.grpc.internal.AbstractRunnableC0978y
        public void a() {
            C0963q.this.t(this.f9275b, y1.l0.f11974s.q(String.format("Unable to find compressor by name %s", this.f9276c)), new y1.Z());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.q$d */
    private class d implements InterfaceC0966s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1304g.a f9278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y1.l0 f9279b;

        /* JADX INFO: renamed from: io.grpc.internal.q$d$a */
        final class a extends AbstractRunnableC0978y {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ H1.b f9281b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y1.Z f9282c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(H1.b bVar, y1.Z z2) {
                super(C0963q.this.f9259f);
                this.f9281b = bVar;
                this.f9282c = z2;
            }

            private void b() {
                if (d.this.f9279b != null) {
                    return;
                }
                try {
                    d.this.f9278a.b(this.f9282c);
                } catch (Throwable th) {
                    d.this.i(y1.l0.f11961f.p(th).q("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC0978y
            public void a() {
                H1.e eVarH = H1.c.h("ClientCall$Listener.headersRead");
                try {
                    H1.c.a(C0963q.this.f9255b);
                    H1.c.e(this.f9281b);
                    b();
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

        /* JADX INFO: renamed from: io.grpc.internal.q$d$b */
        final class b extends AbstractRunnableC0978y {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ H1.b f9284b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0.a f9285c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(H1.b bVar, R0.a aVar) {
                super(C0963q.this.f9259f);
                this.f9284b = bVar;
                this.f9285c = aVar;
            }

            private void b() {
                if (d.this.f9279b != null) {
                    S.d(this.f9285c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f9285c.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.f9278a.c(C0963q.this.f9254a.i(next));
                            next.close();
                        } catch (Throwable th) {
                            S.e(next);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        S.d(this.f9285c);
                        d.this.i(y1.l0.f11961f.p(th2).q("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC0978y
            public void a() {
                H1.e eVarH = H1.c.h("ClientCall$Listener.messagesAvailable");
                try {
                    H1.c.a(C0963q.this.f9255b);
                    H1.c.e(this.f9284b);
                    b();
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

        /* JADX INFO: renamed from: io.grpc.internal.q$d$c */
        final class c extends AbstractRunnableC0978y {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ H1.b f9287b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y1.l0 f9288c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ y1.Z f9289d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(H1.b bVar, y1.l0 l0Var, y1.Z z2) {
                super(C0963q.this.f9259f);
                this.f9287b = bVar;
                this.f9288c = l0Var;
                this.f9289d = z2;
            }

            private void b() {
                y1.l0 l0Var = this.f9288c;
                y1.Z z2 = this.f9289d;
                if (d.this.f9279b != null) {
                    l0Var = d.this.f9279b;
                    z2 = new y1.Z();
                }
                C0963q.this.f9264k = true;
                try {
                    d dVar = d.this;
                    C0963q.this.t(dVar.f9278a, l0Var, z2);
                } finally {
                    C0963q.this.A();
                    C0963q.this.f9258e.a(l0Var.o());
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC0978y
            public void a() {
                H1.e eVarH = H1.c.h("ClientCall$Listener.onClose");
                try {
                    H1.c.a(C0963q.this.f9255b);
                    H1.c.e(this.f9287b);
                    b();
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

        /* JADX INFO: renamed from: io.grpc.internal.q$d$d, reason: collision with other inner class name */
        final class C0140d extends AbstractRunnableC0978y {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ H1.b f9291b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0140d(H1.b bVar) {
                super(C0963q.this.f9259f);
                this.f9291b = bVar;
            }

            private void b() {
                if (d.this.f9279b != null) {
                    return;
                }
                try {
                    d.this.f9278a.d();
                } catch (Throwable th) {
                    d.this.i(y1.l0.f11961f.p(th).q("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC0978y
            public void a() {
                H1.e eVarH = H1.c.h("ClientCall$Listener.onReady");
                try {
                    H1.c.a(C0963q.this.f9255b);
                    H1.c.e(this.f9291b);
                    b();
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

        public d(AbstractC1304g.a aVar) {
            this.f9278a = (AbstractC1304g.a) AbstractC0829j.o(aVar, "observer");
        }

        private void h(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
            C1316t c1316tU = C0963q.this.u();
            if (l0Var.m() == l0.b.CANCELLED && c1316tU != null && c1316tU.l()) {
                Y y2 = new Y();
                C0963q.this.f9263j.l(y2);
                l0Var = y1.l0.f11964i.e("ClientCall was cancelled at or after deadline. " + y2);
                z2 = new y1.Z();
            }
            C0963q.this.f9256c.execute(new c(H1.c.f(), l0Var, z2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(y1.l0 l0Var) {
            this.f9279b = l0Var;
            C0963q.this.f9263j.d(l0Var);
        }

        @Override // io.grpc.internal.R0
        public void a(R0.a aVar) {
            H1.e eVarH = H1.c.h("ClientStreamListener.messagesAvailable");
            try {
                H1.c.a(C0963q.this.f9255b);
                C0963q.this.f9256c.execute(new b(H1.c.f(), aVar));
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

        @Override // io.grpc.internal.R0
        public void b() {
            if (C0963q.this.f9254a.e().c()) {
                return;
            }
            H1.e eVarH = H1.c.h("ClientStreamListener.onReady");
            try {
                H1.c.a(C0963q.this.f9255b);
                C0963q.this.f9256c.execute(new C0140d(H1.c.f()));
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

        @Override // io.grpc.internal.InterfaceC0966s
        public void c(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
            H1.e eVarH = H1.c.h("ClientStreamListener.closed");
            try {
                H1.c.a(C0963q.this.f9255b);
                h(l0Var, aVar, z2);
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

        @Override // io.grpc.internal.InterfaceC0966s
        public void d(y1.Z z2) {
            H1.e eVarH = H1.c.h("ClientStreamListener.headersRead");
            try {
                H1.c.a(C0963q.this.f9255b);
                C0963q.this.f9256c.execute(new a(H1.c.f(), z2));
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

    /* JADX INFO: renamed from: io.grpc.internal.q$e */
    interface e {
        r a(y1.a0 a0Var, C1300c c1300c, y1.Z z2, y1.r rVar);
    }

    /* JADX INFO: renamed from: io.grpc.internal.q$f */
    private final class f implements r.a {
        private f() {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.q$g */
    private class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f9294a;

        g(long j3) {
            this.f9294a = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            Y y2 = new Y();
            C0963q.this.f9263j.l(y2);
            long jAbs = Math.abs(this.f9294a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(this.f9294a) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f9294a < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            Locale locale = Locale.US;
            sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            Object[] objArr = new Object[1];
            objArr[0] = Double.valueOf(((Long) C0963q.this.f9262i.h(AbstractC1308k.f11950a)) == null ? 0.0d : r4.longValue() / C0963q.f9253v);
            sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", objArr));
            sb.append(y2);
            C0963q.this.f9263j.d(y1.l0.f11964i.e(sb.toString()));
        }
    }

    C0963q(y1.a0 a0Var, Executor executor, C1300c c1300c, e eVar, ScheduledExecutorService scheduledExecutorService, C0957n c0957n, AbstractC1295G abstractC1295G) {
        this.f9254a = a0Var;
        H1.d dVarC = H1.c.c(a0Var.c(), System.identityHashCode(this));
        this.f9255b = dVarC;
        boolean z2 = true;
        if (executor == AbstractC0983b.a()) {
            this.f9256c = new J0();
            this.f9257d = true;
        } else {
            this.f9256c = new K0(executor);
            this.f9257d = false;
        }
        this.f9258e = c0957n;
        this.f9259f = y1.r.e();
        if (a0Var.e() != a0.d.UNARY && a0Var.e() != a0.d.SERVER_STREAMING) {
            z2 = false;
        }
        this.f9261h = z2;
        this.f9262i = c1300c;
        this.f9267n = eVar;
        this.f9269p = scheduledExecutorService;
        H1.c.d("ClientCall.<init>", dVarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        this.f9259f.i(this.f9268o);
        ScheduledFuture scheduledFuture = this.f9260g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void B(Object obj) {
        AbstractC0829j.u(this.f9263j != null, "Not started");
        AbstractC0829j.u(!this.f9265l, "call was cancelled");
        AbstractC0829j.u(!this.f9266m, "call was half-closed");
        try {
            r rVar = this.f9263j;
            if (rVar instanceof D0) {
                ((D0) rVar).o0(obj);
            } else {
                rVar.j(this.f9254a.j(obj));
            }
            if (this.f9261h) {
                return;
            }
            this.f9263j.flush();
        } catch (Error e3) {
            this.f9263j.d(y1.l0.f11961f.q("Client sendMessage() failed with Error"));
            throw e3;
        } catch (RuntimeException e4) {
            this.f9263j.d(y1.l0.f11961f.p(e4).q("Failed to stream message"));
        }
    }

    private ScheduledFuture F(C1316t c1316t) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jN = c1316t.n(timeUnit);
        return this.f9269p.schedule(new RunnableC0940e0(new g(jN)), jN, timeUnit);
    }

    private void G(AbstractC1304g.a aVar, y1.Z z2) {
        InterfaceC1311n interfaceC1311nB;
        AbstractC0829j.u(this.f9263j == null, "Already started");
        AbstractC0829j.u(!this.f9265l, "call was cancelled");
        AbstractC0829j.o(aVar, "observer");
        AbstractC0829j.o(z2, "headers");
        if (this.f9259f.h()) {
            this.f9263j = C0962p0.f9250a;
            this.f9256c.execute(new b(aVar));
            return;
        }
        r();
        String strB = this.f9262i.b();
        if (strB != null) {
            interfaceC1311nB = this.f9272s.b(strB);
            if (interfaceC1311nB == null) {
                this.f9263j = C0962p0.f9250a;
                this.f9256c.execute(new c(aVar, strB));
                return;
            }
        } else {
            interfaceC1311nB = InterfaceC1309l.b.f11958a;
        }
        z(z2, this.f9271r, interfaceC1311nB, this.f9270q);
        C1316t c1316tU = u();
        if (c1316tU == null || !c1316tU.l()) {
            x(c1316tU, this.f9259f.g(), this.f9262i.d());
            this.f9263j = this.f9267n.a(this.f9254a, this.f9262i, z2, this.f9259f);
        } else {
            AbstractC1308k[] abstractC1308kArrF = S.f(this.f9262i, z2, 0, false);
            String str = w(this.f9262i.d(), this.f9259f.g()) ? "CallOptions" : "Context";
            Long l3 = (Long) this.f9262i.h(AbstractC1308k.f11950a);
            Object[] objArr = new Object[3];
            objArr[0] = str;
            double dN = c1316tU.n(TimeUnit.NANOSECONDS);
            double d3 = f9253v;
            objArr[1] = Double.valueOf(dN / d3);
            objArr[2] = Double.valueOf(l3 == null ? 0.0d : l3.longValue() / d3);
            this.f9263j = new G(y1.l0.f11964i.q(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", objArr)), abstractC1308kArrF);
        }
        if (this.f9257d) {
            this.f9263j.n();
        }
        if (this.f9262i.a() != null) {
            this.f9263j.k(this.f9262i.a());
        }
        if (this.f9262i.f() != null) {
            this.f9263j.c(this.f9262i.f().intValue());
        }
        if (this.f9262i.g() != null) {
            this.f9263j.e(this.f9262i.g().intValue());
        }
        if (c1316tU != null) {
            this.f9263j.m(c1316tU);
        }
        this.f9263j.a(interfaceC1311nB);
        boolean z3 = this.f9270q;
        if (z3) {
            this.f9263j.q(z3);
        }
        this.f9263j.h(this.f9271r);
        this.f9258e.b();
        this.f9263j.g(new d(aVar));
        this.f9259f.a(this.f9268o, AbstractC0983b.a());
        if (c1316tU != null && !c1316tU.equals(this.f9259f.g()) && this.f9269p != null) {
            this.f9260g = F(c1316tU);
        }
        if (this.f9264k) {
            A();
        }
    }

    private void r() {
        C0952k0.b bVar = (C0952k0.b) this.f9262i.h(C0952k0.b.f9146g);
        if (bVar == null) {
            return;
        }
        Long l3 = bVar.f9147a;
        if (l3 != null) {
            C1316t c1316tC = C1316t.c(l3.longValue(), TimeUnit.NANOSECONDS);
            C1316t c1316tD = this.f9262i.d();
            if (c1316tD == null || c1316tC.compareTo(c1316tD) < 0) {
                this.f9262i = this.f9262i.m(c1316tC);
            }
        }
        Boolean bool = bVar.f9148b;
        if (bool != null) {
            this.f9262i = bool.booleanValue() ? this.f9262i.s() : this.f9262i.t();
        }
        if (bVar.f9149c != null) {
            Integer numF = this.f9262i.f();
            this.f9262i = numF != null ? this.f9262i.o(Math.min(numF.intValue(), bVar.f9149c.intValue())) : this.f9262i.o(bVar.f9149c.intValue());
        }
        if (bVar.f9150d != null) {
            Integer numG = this.f9262i.g();
            this.f9262i = numG != null ? this.f9262i.p(Math.min(numG.intValue(), bVar.f9150d.intValue())) : this.f9262i.p(bVar.f9150d.intValue());
        }
    }

    private void s(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f9251t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f9265l) {
            return;
        }
        this.f9265l = true;
        try {
            if (this.f9263j != null) {
                y1.l0 l0Var = y1.l0.f11961f;
                if (str == null) {
                    str = "Call cancelled without message";
                }
                y1.l0 l0VarQ = l0Var.q(str);
                if (th != null) {
                    l0VarQ = l0VarQ.p(th);
                }
                this.f9263j.d(l0VarQ);
            }
            A();
        } catch (Throwable th2) {
            A();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(AbstractC1304g.a aVar, y1.l0 l0Var, y1.Z z2) {
        aVar.a(l0Var, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1316t u() {
        return y(this.f9262i.d(), this.f9259f.g());
    }

    private void v() {
        AbstractC0829j.u(this.f9263j != null, "Not started");
        AbstractC0829j.u(!this.f9265l, "call was cancelled");
        AbstractC0829j.u(!this.f9266m, "call already half-closed");
        this.f9266m = true;
        this.f9263j.o();
    }

    private static boolean w(C1316t c1316t, C1316t c1316t2) {
        if (c1316t == null) {
            return false;
        }
        if (c1316t2 == null) {
            return true;
        }
        return c1316t.k(c1316t2);
    }

    private static void x(C1316t c1316t, C1316t c1316t2, C1316t c1316t3) {
        Logger logger = f9251t;
        if (logger.isLoggable(Level.FINE) && c1316t != null && c1316t.equals(c1316t2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jMax = Math.max(0L, c1316t.n(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jMax)));
            sb.append(c1316t3 == null ? " Explicit call timeout was not set." : String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c1316t3.n(timeUnit))));
            logger.fine(sb.toString());
        }
    }

    private static C1316t y(C1316t c1316t, C1316t c1316t2) {
        return c1316t == null ? c1316t2 : c1316t2 == null ? c1316t : c1316t.m(c1316t2);
    }

    static void z(y1.Z z2, C1318v c1318v, InterfaceC1311n interfaceC1311n, boolean z3) {
        z2.e(S.f8659i);
        Z.g gVar = S.f8655e;
        z2.e(gVar);
        if (interfaceC1311n != InterfaceC1309l.b.f11958a) {
            z2.p(gVar, interfaceC1311n.a());
        }
        Z.g gVar2 = S.f8656f;
        z2.e(gVar2);
        byte[] bArrA = AbstractC1296H.a(c1318v);
        if (bArrA.length != 0) {
            z2.p(gVar2, bArrA);
        }
        z2.e(S.f8657g);
        Z.g gVar3 = S.f8658h;
        z2.e(gVar3);
        if (z3) {
            z2.p(gVar3, f9252u);
        }
    }

    C0963q C(C1312o c1312o) {
        this.f9272s = c1312o;
        return this;
    }

    C0963q D(C1318v c1318v) {
        this.f9271r = c1318v;
        return this;
    }

    C0963q E(boolean z2) {
        this.f9270q = z2;
        return this;
    }

    @Override // y1.AbstractC1304g
    public void a(String str, Throwable th) {
        H1.e eVarH = H1.c.h("ClientCall.cancel");
        try {
            H1.c.a(this.f9255b);
            s(str, th);
            if (eVarH != null) {
                eVarH.close();
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

    @Override // y1.AbstractC1304g
    public void b() {
        H1.e eVarH = H1.c.h("ClientCall.halfClose");
        try {
            H1.c.a(this.f9255b);
            v();
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

    @Override // y1.AbstractC1304g
    public void c(int i3) {
        H1.e eVarH = H1.c.h("ClientCall.request");
        try {
            H1.c.a(this.f9255b);
            AbstractC0829j.u(this.f9263j != null, "Not started");
            AbstractC0829j.e(i3 >= 0, "Number requested must be non-negative");
            this.f9263j.b(i3);
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

    @Override // y1.AbstractC1304g
    public void d(Object obj) {
        H1.e eVarH = H1.c.h("ClientCall.sendMessage");
        try {
            H1.c.a(this.f9255b);
            B(obj);
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

    @Override // y1.AbstractC1304g
    public void e(AbstractC1304g.a aVar, y1.Z z2) {
        H1.e eVarH = H1.c.h("ClientCall.start");
        try {
            H1.c.a(this.f9255b);
            G(aVar, z2);
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

    public String toString() {
        return AbstractC0825f.b(this).d("method", this.f9254a).toString();
    }
}
