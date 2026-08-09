package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import f0.AbstractC0851j;
import f0.AbstractC0855n;
import f0.AbstractC0867z;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import y1.C1314q;
import y1.C1320x;
import y1.EnumC1313p;
import y1.S;
import y1.p0;

/* JADX INFO: renamed from: io.grpc.internal.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0967s0 extends y1.S {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Logger f9303p = Logger.getLogger(C0967s0.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final S.e f9304g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f9306i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p0.d f9309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private EnumC1313p f9310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private EnumC1313p f9311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f9312o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f9305h = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f9307j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f9308k = true;

    /* JADX INFO: renamed from: io.grpc.internal.s0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9313a;

        static {
            int[] iArr = new int[EnumC1313p.values().length];
            f9313a = iArr;
            try {
                iArr[EnumC1313p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9313a[EnumC1313p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9313a[EnumC1313p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9313a[EnumC1313p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9313a[EnumC1313p.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0967s0.this.f9309l = null;
            if (C0967s0.this.f9306i.b()) {
                C0967s0.this.e();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$c */
    private final class c implements S.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C1314q f9315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f9316b;

        private c() {
            this.f9315a = C1314q.a(EnumC1313p.IDLE);
        }

        @Override // y1.S.k
        public void a(C1314q c1314q) {
            C0967s0.f9303p.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c1314q, this.f9316b.f9325a});
            this.f9315a = c1314q;
            if (C0967s0.this.f9306i.c() && ((g) C0967s0.this.f9305h.get(C0967s0.this.f9306i.a())).f9327c == this) {
                C0967s0.this.w(this.f9316b);
            }
        }

        /* synthetic */ c(C0967s0 c0967s0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$d */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f9318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9320c;

        public d(List list) {
            this.f9318a = list == null ? Collections.emptyList() : list;
        }

        public SocketAddress a() {
            if (c()) {
                return (SocketAddress) ((C1320x) this.f9318a.get(this.f9319b)).a().get(this.f9320c);
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        public boolean b() {
            if (!c()) {
                return false;
            }
            C1320x c1320x = (C1320x) this.f9318a.get(this.f9319b);
            int i3 = this.f9320c + 1;
            this.f9320c = i3;
            if (i3 < c1320x.a().size()) {
                return true;
            }
            int i4 = this.f9319b + 1;
            this.f9319b = i4;
            this.f9320c = 0;
            return i4 < this.f9318a.size();
        }

        public boolean c() {
            return this.f9319b < this.f9318a.size();
        }

        public void d() {
            this.f9319b = 0;
            this.f9320c = 0;
        }

        public boolean e(SocketAddress socketAddress) {
            for (int i3 = 0; i3 < this.f9318a.size(); i3++) {
                int iIndexOf = ((C1320x) this.f9318a.get(i3)).a().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f9319b = i3;
                    this.f9320c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public int f() {
            List list = this.f9318a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void g(AbstractC0851j abstractC0851j) {
            List listEmptyList = abstractC0851j;
            if (abstractC0851j == null) {
                listEmptyList = Collections.emptyList();
            }
            this.f9318a = listEmptyList;
            d();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$e */
    private static final class e extends S.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.f f9321a;

        e(S.f fVar) {
            this.f9321a = (S.f) AbstractC0829j.o(fVar, "result");
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            return this.f9321a;
        }

        public String toString() {
            return AbstractC0825f.a(e.class).d("result", this.f9321a).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$f */
    private final class f extends S.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0967s0 f9322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f9323b = new AtomicBoolean(false);

        f(C0967s0 c0967s0) {
            this.f9322a = (C0967s0) AbstractC0829j.o(c0967s0, "pickFirstLeafLoadBalancer");
        }

        @Override // y1.S.j
        public S.f a(S.g gVar) {
            if (this.f9323b.compareAndSet(false, true)) {
                y1.p0 p0VarD = C0967s0.this.f9304g.d();
                final C0967s0 c0967s0 = this.f9322a;
                Objects.requireNonNull(c0967s0);
                p0VarD.execute(new Runnable() { // from class: io.grpc.internal.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0967s0.e();
                    }
                });
            }
            return S.f.g();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$g */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S.i f9325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EnumC1313p f9326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f9327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9328d = false;

        public g(S.i iVar, EnumC1313p enumC1313p, c cVar) {
            this.f9325a = iVar;
            this.f9326b = enumC1313p;
            this.f9327c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EnumC1313p f() {
            return this.f9327c.f9315a.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(EnumC1313p enumC1313p) {
            boolean z2;
            this.f9326b = enumC1313p;
            if (enumC1313p == EnumC1313p.READY || enumC1313p == EnumC1313p.TRANSIENT_FAILURE) {
                z2 = true;
            } else if (enumC1313p != EnumC1313p.IDLE) {
                return;
            } else {
                z2 = false;
            }
            this.f9328d = z2;
        }

        public EnumC1313p g() {
            return this.f9326b;
        }

        public S.i h() {
            return this.f9325a;
        }

        public boolean i() {
            return this.f9328d;
        }
    }

    C0967s0(S.e eVar) {
        EnumC1313p enumC1313p = EnumC1313p.IDLE;
        this.f9310m = enumC1313p;
        this.f9311n = enumC1313p;
        this.f9312o = S.g("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS", false);
        this.f9304g = (S.e) AbstractC0829j.o(eVar, "helper");
    }

    private void n() {
        p0.d dVar = this.f9309l;
        if (dVar != null) {
            dVar.a();
            this.f9309l = null;
        }
    }

    private S.i o(SocketAddress socketAddress) {
        c cVar = new c(this, null);
        final S.i iVarA = this.f9304g.a(S.b.d().e(AbstractC0855n.g(new C1320x(socketAddress))).b(y1.S.f11804c, cVar).c());
        if (iVarA == null) {
            f9303p.warning("Was not able to create subchannel for " + socketAddress);
            throw new IllegalStateException("Can't create subchannel");
        }
        g gVar = new g(iVarA, EnumC1313p.IDLE, cVar);
        cVar.f9316b = gVar;
        this.f9305h.put(socketAddress, gVar);
        if (iVarA.c().b(y1.S.f11805d) == null) {
            cVar.f9315a = C1314q.a(EnumC1313p.READY);
        }
        iVarA.h(new S.k() { // from class: io.grpc.internal.r0
            @Override // y1.S.k
            public final void a(C1314q c1314q) {
                this.f9296a.r(iVarA, c1314q);
            }
        });
        return iVarA;
    }

    private SocketAddress p(S.i iVar) {
        return (SocketAddress) iVar.a().a().get(0);
    }

    private boolean q() {
        d dVar = this.f9306i;
        if (dVar == null || dVar.c() || this.f9305h.size() < this.f9306i.f()) {
            return false;
        }
        Iterator it = this.f9305h.values().iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).i()) {
                return false;
            }
        }
        return true;
    }

    private void t() {
        if (this.f9312o) {
            p0.d dVar = this.f9309l;
            if (dVar == null || !dVar.b()) {
                this.f9309l = this.f9304g.d().d(new b(), 250L, TimeUnit.MILLISECONDS, this.f9304g.c());
            }
        }
    }

    private void u(g gVar) {
        n();
        for (g gVar2 : this.f9305h.values()) {
            if (!gVar2.h().equals(gVar.f9325a)) {
                gVar2.h().g();
            }
        }
        this.f9305h.clear();
        gVar.j(EnumC1313p.READY);
        this.f9305h.put(p(gVar.f9325a), gVar);
    }

    private void v(EnumC1313p enumC1313p, S.j jVar) {
        if (enumC1313p == this.f9311n && (enumC1313p == EnumC1313p.IDLE || enumC1313p == EnumC1313p.CONNECTING)) {
            return;
        }
        this.f9311n = enumC1313p;
        this.f9304g.f(enumC1313p, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(g gVar) {
        S.j eVar;
        EnumC1313p enumC1313p = gVar.f9326b;
        EnumC1313p enumC1313p2 = EnumC1313p.READY;
        if (enumC1313p != enumC1313p2) {
            return;
        }
        if (gVar.f() == enumC1313p2) {
            eVar = new S.d(S.f.h(gVar.f9325a));
        } else {
            EnumC1313p enumC1313pF = gVar.f();
            enumC1313p2 = EnumC1313p.TRANSIENT_FAILURE;
            if (enumC1313pF != enumC1313p2) {
                if (this.f9311n != enumC1313p2) {
                    v(gVar.f(), new e(S.f.g()));
                    return;
                }
                return;
            }
            eVar = new e(S.f.f(gVar.f9327c.f9315a.d()));
        }
        v(enumC1313p2, eVar);
    }

    @Override // y1.S
    public y1.l0 a(S.h hVar) {
        EnumC1313p enumC1313p;
        if (this.f9310m == EnumC1313p.SHUTDOWN) {
            return y1.l0.f11970o.q("Already shut down");
        }
        List listA = hVar.a();
        if (listA.isEmpty()) {
            y1.l0 l0VarQ = y1.l0.f11975t.q("NameResolver returned no usable address. addrs=" + hVar.a() + ", attrs=" + hVar.b());
            c(l0VarQ);
            return l0VarQ;
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            if (((C1320x) it.next()) == null) {
                y1.l0 l0VarQ2 = y1.l0.f11975t.q("NameResolver returned address list with null endpoint. addrs=" + hVar.a() + ", attrs=" + hVar.b());
                c(l0VarQ2);
                return l0VarQ2;
            }
        }
        this.f9308k = true;
        hVar.c();
        AbstractC0851j abstractC0851jH = AbstractC0851j.p().g(listA).h();
        d dVar = this.f9306i;
        if (dVar == null) {
            this.f9306i = new d(abstractC0851jH);
        } else if (this.f9310m == EnumC1313p.READY) {
            SocketAddress socketAddressA = dVar.a();
            this.f9306i.g(abstractC0851jH);
            if (this.f9306i.e(socketAddressA)) {
                return y1.l0.f11960e;
            }
            this.f9306i.d();
        } else {
            dVar.g(abstractC0851jH);
        }
        HashSet<SocketAddress> hashSet = new HashSet(this.f9305h.keySet());
        HashSet hashSet2 = new HashSet();
        AbstractC0867z it2 = abstractC0851jH.iterator();
        while (it2.hasNext()) {
            hashSet2.addAll(((C1320x) it2.next()).a());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((g) this.f9305h.remove(socketAddress)).h().g();
            }
        }
        if (hashSet.size() != 0 && (enumC1313p = this.f9310m) != EnumC1313p.CONNECTING && enumC1313p != EnumC1313p.READY) {
            EnumC1313p enumC1313p2 = EnumC1313p.IDLE;
            if (enumC1313p == enumC1313p2) {
                v(enumC1313p2, new f(this));
            } else if (enumC1313p == EnumC1313p.TRANSIENT_FAILURE) {
            }
            return y1.l0.f11960e;
        }
        EnumC1313p enumC1313p3 = EnumC1313p.CONNECTING;
        this.f9310m = enumC1313p3;
        v(enumC1313p3, new e(S.f.g()));
        n();
        e();
        return y1.l0.f11960e;
    }

    @Override // y1.S
    public void c(y1.l0 l0Var) {
        Iterator it = this.f9305h.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).h().g();
        }
        this.f9305h.clear();
        v(EnumC1313p.TRANSIENT_FAILURE, new e(S.f.f(l0Var)));
    }

    @Override // y1.S
    public void e() {
        d dVar = this.f9306i;
        if (dVar == null || !dVar.c() || this.f9310m == EnumC1313p.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressA = this.f9306i.a();
        S.i iVarH = this.f9305h.containsKey(socketAddressA) ? ((g) this.f9305h.get(socketAddressA)).h() : o(socketAddressA);
        int i3 = a.f9313a[((g) this.f9305h.get(socketAddressA)).g().ordinal()];
        if (i3 == 1) {
            iVarH.f();
            ((g) this.f9305h.get(socketAddressA)).j(EnumC1313p.CONNECTING);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    f9303p.warning("Requesting a connection even though we have a READY subchannel");
                    return;
                } else {
                    if (i3 != 4) {
                        return;
                    }
                    this.f9306i.b();
                    e();
                    return;
                }
            }
            if (!this.f9312o) {
                iVarH.f();
                return;
            }
        }
        t();
    }

    @Override // y1.S
    public void f() {
        f9303p.log(Level.FINE, "Shutting down, currently have {} subchannels created", Integer.valueOf(this.f9305h.size()));
        EnumC1313p enumC1313p = EnumC1313p.SHUTDOWN;
        this.f9310m = enumC1313p;
        this.f9311n = enumC1313p;
        n();
        Iterator it = this.f9305h.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).h().g();
        }
        this.f9305h.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void r(S.i iVar, C1314q c1314q) {
        EnumC1313p enumC1313pC = c1314q.c();
        g gVar = (g) this.f9305h.get(p(iVar));
        if (gVar == null || gVar.h() != iVar || enumC1313pC == EnumC1313p.SHUTDOWN) {
            return;
        }
        EnumC1313p enumC1313p = EnumC1313p.IDLE;
        if (enumC1313pC == enumC1313p) {
            this.f9304g.e();
        }
        gVar.j(enumC1313pC);
        EnumC1313p enumC1313p2 = this.f9310m;
        EnumC1313p enumC1313p3 = EnumC1313p.TRANSIENT_FAILURE;
        if (enumC1313p2 == enumC1313p3 || this.f9311n == enumC1313p3) {
            if (enumC1313pC == EnumC1313p.CONNECTING) {
                return;
            }
            if (enumC1313pC == enumC1313p) {
                e();
                return;
            }
        }
        int i3 = a.f9313a[enumC1313pC.ordinal()];
        if (i3 == 1) {
            this.f9306i.d();
            this.f9310m = enumC1313p;
            v(enumC1313p, new f(this));
            return;
        }
        if (i3 == 2) {
            EnumC1313p enumC1313p4 = EnumC1313p.CONNECTING;
            this.f9310m = enumC1313p4;
            v(enumC1313p4, new e(S.f.g()));
            return;
        }
        if (i3 == 3) {
            u(gVar);
            this.f9306i.e(p(iVar));
            this.f9310m = EnumC1313p.READY;
            w(gVar);
            return;
        }
        if (i3 != 4) {
            throw new IllegalArgumentException("Unsupported state:" + enumC1313pC);
        }
        if (this.f9306i.c() && ((g) this.f9305h.get(this.f9306i.a())).h() == iVar && this.f9306i.b()) {
            n();
            e();
        }
        if (q()) {
            this.f9310m = enumC1313p3;
            v(enumC1313p3, new e(S.f.f(c1314q.d())));
            int i4 = this.f9307j + 1;
            this.f9307j = i4;
            if (i4 >= this.f9306i.f() || this.f9308k) {
                this.f9308k = false;
                this.f9307j = 0;
                this.f9304g.e();
            }
        }
    }
}
