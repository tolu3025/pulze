package io.grpc.internal;

import c.AbstractC0527b;
import e0.AbstractC0825f;
import e0.AbstractC0829j;
import e0.C0831l;
import e0.InterfaceC0833n;
import io.grpc.internal.InterfaceC0949j;
import io.grpc.internal.InterfaceC0954l0;
import io.grpc.internal.InterfaceC0966s;
import io.grpc.internal.InterfaceC0970u;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import y1.AbstractC1303f;
import y1.AbstractC1308k;
import y1.C1292D;
import y1.C1293E;
import y1.C1298a;
import y1.C1300c;
import y1.C1314q;
import y1.C1320x;
import y1.EnumC1313p;
import y1.p0;

/* JADX INFO: loaded from: classes.dex */
final class Z implements y1.J, U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.K f8760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0949j.a f8763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f8764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0970u f8765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f8766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1293E f8767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0957n f8768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C0961p f8769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC1303f f8770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f8771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final y1.p0 f8772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f8773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile List f8774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceC0949j f8775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C0831l f8776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p0.d f8777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p0.d f8778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC0954l0 f8779t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private InterfaceC0974w f8782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile InterfaceC0954l0 f8783x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private y1.l0 f8785z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Collection f8780u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final X f8781v = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile C1314q f8784y = C1314q.a(EnumC1313p.IDLE);

    class a extends X {
        a() {
        }

        @Override // io.grpc.internal.X
        protected void b() {
            Z.this.f8764e.a(Z.this);
        }

        @Override // io.grpc.internal.X
        protected void c() {
            Z.this.f8764e.b(Z.this);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f8777r = null;
            Z.this.f8770k.a(AbstractC1303f.a.INFO, "CONNECTING after backoff");
            Z.this.O(EnumC1313p.CONNECTING);
            Z.this.U();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Z.this.f8784y.c() == EnumC1313p.IDLE) {
                Z.this.f8770k.a(AbstractC1303f.a.INFO, "CONNECTING as requested");
                Z.this.O(EnumC1313p.CONNECTING);
                Z.this.U();
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f8789a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0954l0 interfaceC0954l0 = Z.this.f8779t;
                Z.this.f8778s = null;
                Z.this.f8779t = null;
                interfaceC0954l0.d(y1.l0.f11975t.q("InternalSubchannel closed transport due to address change"));
            }
        }

        d(List list) {
            this.f8789a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0954l0 interfaceC0954l0;
            SocketAddress socketAddressA = Z.this.f8773n.a();
            Z.this.f8773n.h(this.f8789a);
            Z.this.f8774o = this.f8789a;
            EnumC1313p enumC1313pC = Z.this.f8784y.c();
            EnumC1313p enumC1313p = EnumC1313p.READY;
            if ((enumC1313pC != enumC1313p && Z.this.f8784y.c() != EnumC1313p.CONNECTING) || Z.this.f8773n.g(socketAddressA)) {
                interfaceC0954l0 = null;
            } else if (Z.this.f8784y.c() == enumC1313p) {
                interfaceC0954l0 = Z.this.f8783x;
                Z.this.f8783x = null;
                Z.this.f8773n.f();
                Z.this.O(EnumC1313p.IDLE);
            } else {
                Z.this.f8782w.d(y1.l0.f11975t.q("InternalSubchannel closed pending transport due to address change"));
                Z.this.f8782w = null;
                Z.this.f8773n.f();
                Z.this.U();
                interfaceC0954l0 = null;
            }
            if (interfaceC0954l0 != null) {
                if (Z.this.f8778s != null) {
                    Z.this.f8779t.d(y1.l0.f11975t.q("InternalSubchannel closed transport early due to address change"));
                    Z.this.f8778s.a();
                    Z.this.f8778s = null;
                    Z.this.f8779t = null;
                }
                Z.this.f8779t = interfaceC0954l0;
                Z z2 = Z.this;
                z2.f8778s = z2.f8772m.d(new a(), 5L, TimeUnit.SECONDS, Z.this.f8766g);
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y1.l0 f8792a;

        e(y1.l0 l0Var) {
            this.f8792a = l0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            EnumC1313p enumC1313pC = Z.this.f8784y.c();
            EnumC1313p enumC1313p = EnumC1313p.SHUTDOWN;
            if (enumC1313pC == enumC1313p) {
                return;
            }
            Z.this.f8785z = this.f8792a;
            InterfaceC0954l0 interfaceC0954l0 = Z.this.f8783x;
            InterfaceC0974w interfaceC0974w = Z.this.f8782w;
            Z.this.f8783x = null;
            Z.this.f8782w = null;
            Z.this.O(enumC1313p);
            Z.this.f8773n.f();
            if (Z.this.f8780u.isEmpty()) {
                Z.this.Q();
            }
            Z.this.M();
            if (Z.this.f8778s != null) {
                Z.this.f8778s.a();
                Z.this.f8779t.d(this.f8792a);
                Z.this.f8778s = null;
                Z.this.f8779t = null;
            }
            if (interfaceC0954l0 != null) {
                interfaceC0954l0.d(this.f8792a);
            }
            if (interfaceC0974w != null) {
                interfaceC0974w.d(this.f8792a);
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f8770k.a(AbstractC1303f.a.INFO, "Terminated");
            Z.this.f8764e.d(Z.this);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0974w f8795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8796b;

        g(InterfaceC0974w interfaceC0974w, boolean z2) {
            this.f8795a = interfaceC0974w;
            this.f8796b = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f8781v.e(this.f8795a, this.f8796b);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y1.l0 f8798a;

        h(y1.l0 l0Var) {
            this.f8798a = l0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(Z.this.f8780u).iterator();
            while (it.hasNext()) {
                ((InterfaceC0954l0) it.next()).i(this.f8798a);
            }
        }
    }

    static final class i extends K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0974w f8800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0957n f8801b;

        class a extends I {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f8802a;

            /* JADX INFO: renamed from: io.grpc.internal.Z$i$a$a, reason: collision with other inner class name */
            class C0134a extends J {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC0966s f8804a;

                C0134a(InterfaceC0966s interfaceC0966s) {
                    this.f8804a = interfaceC0966s;
                }

                @Override // io.grpc.internal.J, io.grpc.internal.InterfaceC0966s
                public void c(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
                    i.this.f8801b.a(l0Var.o());
                    super.c(l0Var, aVar, z2);
                }

                @Override // io.grpc.internal.J
                protected InterfaceC0966s e() {
                    return this.f8804a;
                }
            }

            a(r rVar) {
                this.f8802a = rVar;
            }

            @Override // io.grpc.internal.I, io.grpc.internal.r
            public void g(InterfaceC0966s interfaceC0966s) {
                i.this.f8801b.b();
                super.g(new C0134a(interfaceC0966s));
            }

            @Override // io.grpc.internal.I
            protected r p() {
                return this.f8802a;
            }
        }

        private i(InterfaceC0974w interfaceC0974w, C0957n c0957n) {
            this.f8800a = interfaceC0974w;
            this.f8801b = c0957n;
        }

        @Override // io.grpc.internal.K
        protected InterfaceC0974w a() {
            return this.f8800a;
        }

        @Override // io.grpc.internal.K, io.grpc.internal.InterfaceC0968t
        public r b(y1.a0 a0Var, y1.Z z2, C1300c c1300c, AbstractC1308k[] abstractC1308kArr) {
            return new a(super.b(a0Var, z2, c1300c, abstractC1308kArr));
        }

        /* synthetic */ i(InterfaceC0974w interfaceC0974w, C0957n c0957n, a aVar) {
            this(interfaceC0974w, c0957n);
        }
    }

    static abstract class j {
        j() {
        }

        abstract void a(Z z2);

        abstract void b(Z z2);

        abstract void c(Z z2, C1314q c1314q);

        abstract void d(Z z2);
    }

    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f8806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8808c;

        public k(List list) {
            this.f8806a = list;
        }

        public SocketAddress a() {
            return (SocketAddress) ((C1320x) this.f8806a.get(this.f8807b)).a().get(this.f8808c);
        }

        public C1298a b() {
            return ((C1320x) this.f8806a.get(this.f8807b)).b();
        }

        public void c() {
            C1320x c1320x = (C1320x) this.f8806a.get(this.f8807b);
            int i3 = this.f8808c + 1;
            this.f8808c = i3;
            if (i3 >= c1320x.a().size()) {
                this.f8807b++;
                this.f8808c = 0;
            }
        }

        public boolean d() {
            return this.f8807b == 0 && this.f8808c == 0;
        }

        public boolean e() {
            return this.f8807b < this.f8806a.size();
        }

        public void f() {
            this.f8807b = 0;
            this.f8808c = 0;
        }

        public boolean g(SocketAddress socketAddress) {
            for (int i3 = 0; i3 < this.f8806a.size(); i3++) {
                int iIndexOf = ((C1320x) this.f8806a.get(i3)).a().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f8807b = i3;
                    this.f8808c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public void h(List list) {
            this.f8806a = list;
            f();
        }
    }

    private class l implements InterfaceC0954l0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InterfaceC0974w f8809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f8810b = false;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Z.this.f8775p = null;
                if (Z.this.f8785z != null) {
                    AbstractC0829j.u(Z.this.f8783x == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.f8809a.d(Z.this.f8785z);
                    return;
                }
                InterfaceC0974w interfaceC0974w = Z.this.f8782w;
                l lVar2 = l.this;
                InterfaceC0974w interfaceC0974w2 = lVar2.f8809a;
                if (interfaceC0974w == interfaceC0974w2) {
                    Z.this.f8783x = interfaceC0974w2;
                    Z.this.f8782w = null;
                    Z.this.O(EnumC1313p.READY);
                }
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1.l0 f8813a;

            b(y1.l0 l0Var) {
                this.f8813a = l0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (Z.this.f8784y.c() == EnumC1313p.SHUTDOWN) {
                    return;
                }
                InterfaceC0954l0 interfaceC0954l0 = Z.this.f8783x;
                l lVar = l.this;
                if (interfaceC0954l0 == lVar.f8809a) {
                    Z.this.f8783x = null;
                    Z.this.f8773n.f();
                    Z.this.O(EnumC1313p.IDLE);
                    return;
                }
                InterfaceC0974w interfaceC0974w = Z.this.f8782w;
                l lVar2 = l.this;
                if (interfaceC0974w == lVar2.f8809a) {
                    AbstractC0829j.w(Z.this.f8784y.c() == EnumC1313p.CONNECTING, "Expected state is CONNECTING, actual state is %s", Z.this.f8784y.c());
                    Z.this.f8773n.c();
                    if (Z.this.f8773n.e()) {
                        Z.this.U();
                        return;
                    }
                    Z.this.f8782w = null;
                    Z.this.f8773n.f();
                    Z.this.T(this.f8813a);
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Z.this.f8780u.remove(l.this.f8809a);
                if (Z.this.f8784y.c() == EnumC1313p.SHUTDOWN && Z.this.f8780u.isEmpty()) {
                    Z.this.Q();
                }
            }
        }

        l(InterfaceC0974w interfaceC0974w) {
            this.f8809a = interfaceC0974w;
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public void a() {
            AbstractC0829j.u(this.f8810b, "transportShutdown() must be called before transportTerminated().");
            Z.this.f8770k.b(AbstractC1303f.a.INFO, "{0} Terminated", this.f8809a.g());
            Z.this.f8767h.i(this.f8809a);
            Z.this.R(this.f8809a, false);
            Iterator it = Z.this.f8771l.iterator();
            if (!it.hasNext()) {
                Z.this.f8772m.execute(new c());
            } else {
                AbstractC0527b.a(it.next());
                this.f8809a.f();
                throw null;
            }
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public void b(boolean z2) {
            Z.this.R(this.f8809a, z2);
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public void c(y1.l0 l0Var) {
            Z.this.f8770k.b(AbstractC1303f.a.INFO, "{0} SHUTDOWN with {1}", this.f8809a.g(), Z.this.S(l0Var));
            this.f8810b = true;
            Z.this.f8772m.execute(new b(l0Var));
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public void d() {
            Z.this.f8770k.a(AbstractC1303f.a.INFO, "READY");
            Z.this.f8772m.execute(new a());
        }

        @Override // io.grpc.internal.InterfaceC0954l0.a
        public C1298a e(C1298a c1298a) {
            Iterator it = Z.this.f8771l.iterator();
            if (!it.hasNext()) {
                return c1298a;
            }
            AbstractC0527b.a(it.next());
            throw null;
        }
    }

    static final class m extends AbstractC1303f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        y1.K f8816a;

        m() {
        }

        @Override // y1.AbstractC1303f
        public void a(AbstractC1303f.a aVar, String str) {
            C0959o.d(this.f8816a, aVar, str);
        }

        @Override // y1.AbstractC1303f
        public void b(AbstractC1303f.a aVar, String str, Object... objArr) {
            C0959o.e(this.f8816a, aVar, str, objArr);
        }
    }

    Z(List list, String str, String str2, InterfaceC0949j.a aVar, InterfaceC0970u interfaceC0970u, ScheduledExecutorService scheduledExecutorService, InterfaceC0833n interfaceC0833n, y1.p0 p0Var, j jVar, C1293E c1293e, C0957n c0957n, C0961p c0961p, y1.K k3, AbstractC1303f abstractC1303f, List list2) {
        AbstractC0829j.o(list, "addressGroups");
        AbstractC0829j.e(!list.isEmpty(), "addressGroups is empty");
        N(list, "addressGroups contains null entry");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f8774o = listUnmodifiableList;
        this.f8773n = new k(listUnmodifiableList);
        this.f8761b = str;
        this.f8762c = str2;
        this.f8763d = aVar;
        this.f8765f = interfaceC0970u;
        this.f8766g = scheduledExecutorService;
        this.f8776q = (C0831l) interfaceC0833n.get();
        this.f8772m = p0Var;
        this.f8764e = jVar;
        this.f8767h = c1293e;
        this.f8768i = c0957n;
        this.f8769j = (C0961p) AbstractC0829j.o(c0961p, "channelTracer");
        this.f8760a = (y1.K) AbstractC0829j.o(k3, "logId");
        this.f8770k = (AbstractC1303f) AbstractC0829j.o(abstractC1303f, "channelLogger");
        this.f8771l = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        this.f8772m.f();
        p0.d dVar = this.f8777r;
        if (dVar != null) {
            dVar.a();
            this.f8777r = null;
            this.f8775p = null;
        }
    }

    private static void N(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0829j.o(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(EnumC1313p enumC1313p) {
        this.f8772m.f();
        P(C1314q.a(enumC1313p));
    }

    private void P(C1314q c1314q) {
        this.f8772m.f();
        if (this.f8784y.c() != c1314q.c()) {
            AbstractC0829j.u(this.f8784y.c() != EnumC1313p.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + c1314q);
            this.f8784y = c1314q;
            this.f8764e.c(this, c1314q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        this.f8772m.execute(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(InterfaceC0974w interfaceC0974w, boolean z2) {
        this.f8772m.execute(new g(interfaceC0974w, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String S(y1.l0 l0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(l0Var.m());
        if (l0Var.n() != null) {
            sb.append("(");
            sb.append(l0Var.n());
            sb.append(")");
        }
        if (l0Var.l() != null) {
            sb.append("[");
            sb.append(l0Var.l());
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(y1.l0 l0Var) {
        this.f8772m.f();
        P(C1314q.b(l0Var));
        if (this.f8775p == null) {
            this.f8775p = this.f8763d.get();
        }
        long jA = this.f8775p.a();
        C0831l c0831l = this.f8776q;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jD = jA - c0831l.d(timeUnit);
        this.f8770k.b(AbstractC1303f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", S(l0Var), Long.valueOf(jD));
        AbstractC0829j.u(this.f8777r == null, "previous reconnectTask is not done");
        this.f8777r = this.f8772m.d(new b(), jD, timeUnit, this.f8766g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        SocketAddress socketAddressC;
        C1292D c1292d;
        this.f8772m.f();
        AbstractC0829j.u(this.f8777r == null, "Should have no reconnectTask scheduled");
        if (this.f8773n.d()) {
            this.f8776q.f().g();
        }
        SocketAddress socketAddressA = this.f8773n.a();
        a aVar = null;
        if (socketAddressA instanceof C1292D) {
            c1292d = (C1292D) socketAddressA;
            socketAddressC = c1292d.c();
        } else {
            socketAddressC = socketAddressA;
            c1292d = null;
        }
        C1298a c1298aB = this.f8773n.b();
        String str = (String) c1298aB.b(C1320x.f12067d);
        InterfaceC0970u.a aVar2 = new InterfaceC0970u.a();
        if (str == null) {
            str = this.f8761b;
        }
        InterfaceC0970u.a aVarG = aVar2.e(str).f(c1298aB).h(this.f8762c).g(c1292d);
        m mVar = new m();
        mVar.f8816a = g();
        i iVar = new i(this.f8765f.H(socketAddressC, aVarG, mVar), this.f8768i, aVar);
        mVar.f8816a = iVar.g();
        this.f8767h.c(iVar);
        this.f8782w = iVar;
        this.f8780u.add(iVar);
        Runnable runnableC = iVar.c(new l(iVar));
        if (runnableC != null) {
            this.f8772m.b(runnableC);
        }
        this.f8770k.b(AbstractC1303f.a.INFO, "Started transport {0}", mVar.f8816a);
    }

    public void V(List list) {
        AbstractC0829j.o(list, "newAddressGroups");
        N(list, "newAddressGroups contains null entry");
        AbstractC0829j.e(!list.isEmpty(), "newAddressGroups is empty");
        this.f8772m.execute(new d(Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // io.grpc.internal.U0
    public InterfaceC0968t a() {
        InterfaceC0954l0 interfaceC0954l0 = this.f8783x;
        if (interfaceC0954l0 != null) {
            return interfaceC0954l0;
        }
        this.f8772m.execute(new c());
        return null;
    }

    public void d(y1.l0 l0Var) {
        this.f8772m.execute(new e(l0Var));
    }

    @Override // y1.P
    public y1.K g() {
        return this.f8760a;
    }

    void i(y1.l0 l0Var) {
        d(l0Var);
        this.f8772m.execute(new h(l0Var));
    }

    public String toString() {
        return AbstractC0825f.b(this).c("logId", this.f8760a.d()).d("addressGroups", this.f8774o).toString();
    }
}
