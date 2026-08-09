package I0;

import A0.EnumC0201b0;
import A0.f0;
import A0.q0;
import C0.EnumC0271o0;
import C0.R1;
import I0.InterfaceC0374o;
import I0.M;
import I0.a0;
import I0.b0;
import I0.c0;
import I0.d0;
import J0.AbstractC0386b;
import J0.C0391g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.InterfaceC0755u0;
import com.google.firebase.firestore.T;
import com.google.protobuf.AbstractC0791i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public final class U implements b0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.f f2209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f2210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0.M f2211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f2212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0374o f2213e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M f2215g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c0 f2217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d0 f2218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b0 f2219k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2216h = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f2214f = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Deque f2220l = new ArrayDeque();

    class a implements c0.a {
        a() {
        }

        @Override // I0.W
        public void a() {
            U.this.y();
        }

        @Override // I0.W
        public void b(l0 l0Var) {
            U.this.x(l0Var);
        }

        @Override // I0.c0.a
        public void d(D0.w wVar, a0 a0Var) {
            U.this.w(wVar, a0Var);
        }
    }

    class b implements d0.a {
        b() {
        }

        @Override // I0.W
        public void a() {
            U.this.f2218j.E();
        }

        @Override // I0.W
        public void b(l0 l0Var) {
            U.this.B(l0Var);
        }

        @Override // I0.d0.a
        public void c() {
            U.this.C();
        }

        @Override // I0.d0.a
        public void e(D0.w wVar, List list) {
            U.this.D(wVar, list);
        }
    }

    public interface c {
        void a(EnumC0201b0 enumC0201b0);

        t0.e b(int i3);

        void c(int i3, l0 l0Var);

        void d(int i3, l0 l0Var);

        void e(E0.h hVar);

        void f(O o2);
    }

    public U(D0.f fVar, final c cVar, C0.M m3, r rVar, final C0391g c0391g, InterfaceC0374o interfaceC0374o) {
        this.f2209a = fVar;
        this.f2210b = cVar;
        this.f2211c = m3;
        this.f2212d = rVar;
        this.f2213e = interfaceC0374o;
        Objects.requireNonNull(cVar);
        this.f2215g = new M(c0391g, new M.a() { // from class: I0.Q
            @Override // I0.M.a
            public final void a(EnumC0201b0 enumC0201b0) {
                cVar.a(enumC0201b0);
            }
        });
        this.f2217i = rVar.e(new a());
        this.f2218j = rVar.f(new b());
        interfaceC0374o.a(new J0.n() { // from class: I0.S
            @Override // J0.n
            public final void accept(Object obj) {
                this.f2205a.F(c0391g, (InterfaceC0374o.a) obj);
            }
        });
    }

    private void A(l0 l0Var) {
        AbstractC0386b.d(!l0Var.o(), "Handling write error with status OK.", new Object[0]);
        if (r.j(l0Var)) {
            J0.A.a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", J0.L.v(this.f2218j.z()), l0Var);
            d0 d0Var = this.f2218j;
            AbstractC0791i abstractC0791i = d0.f2299v;
            d0Var.D(abstractC0791i);
            this.f2211c.o0(abstractC0791i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(l0 l0Var) {
        if (l0Var.o()) {
            AbstractC0386b.d(!O(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!l0Var.o() && !this.f2220l.isEmpty()) {
            if (this.f2218j.A()) {
                z(l0Var);
            } else {
                A(l0Var);
            }
        }
        if (O()) {
            S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        this.f2211c.o0(this.f2218j.z());
        Iterator it = this.f2220l.iterator();
        while (it.hasNext()) {
            this.f2218j.F(((E0.g) it.next()).h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(D0.w wVar, List list) {
        this.f2210b.e(E0.h.a((E0.g) this.f2220l.poll(), wVar, list, this.f2218j.z()));
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(InterfaceC0374o.a aVar) {
        if (aVar.equals(InterfaceC0374o.a.REACHABLE) && this.f2215g.c().equals(EnumC0201b0.ONLINE)) {
            return;
        }
        if (!(aVar.equals(InterfaceC0374o.a.UNREACHABLE) && this.f2215g.c().equals(EnumC0201b0.OFFLINE)) && n()) {
            J0.A.a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(C0391g c0391g, final InterfaceC0374o.a aVar) {
        c0391g.l(new Runnable() { // from class: I0.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f2207a.E(aVar);
            }
        });
    }

    private void H(a0.d dVar) {
        AbstractC0386b.d(dVar.a() != null, "Processing target error without a cause", new Object[0]);
        for (Integer num : dVar.d()) {
            if (this.f2214f.containsKey(num)) {
                this.f2214f.remove(num);
                this.f2219k.q(num.intValue());
                this.f2210b.c(num.intValue(), dVar.a());
            }
        }
    }

    private void I(D0.w wVar) {
        AbstractC0386b.d(!wVar.equals(D0.w.f1302b), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        O oC = this.f2219k.c(wVar);
        for (Map.Entry entry : oC.d().entrySet()) {
            X x2 = (X) entry.getValue();
            if (!x2.e().isEmpty()) {
                Integer num = (Integer) entry.getKey();
                num.intValue();
                R1 r12 = (R1) this.f2214f.get(num);
                if (r12 != null) {
                    this.f2214f.put(num, r12.k(x2.e(), wVar));
                }
            }
        }
        for (Map.Entry entry2 : oC.e().entrySet()) {
            Integer num2 = (Integer) entry2.getKey();
            int iIntValue = num2.intValue();
            R1 r13 = (R1) this.f2214f.get(num2);
            if (r13 != null) {
                this.f2214f.put(num2, r13.k(AbstractC0791i.f6770b, r13.f()));
                L(iIntValue);
                M(new R1(r13.g(), iIntValue, r13.e(), (EnumC0271o0) entry2.getValue()));
            }
        }
        this.f2210b.f(oC);
    }

    private void J() {
        this.f2216h = false;
        r();
        this.f2215g.i(EnumC0201b0.UNKNOWN);
        this.f2218j.l();
        this.f2217i.l();
        s();
    }

    private void L(int i3) {
        this.f2219k.o(i3);
        this.f2217i.B(i3);
    }

    private void M(R1 r12) {
        this.f2219k.o(r12.h());
        if (!r12.d().isEmpty() || r12.f().compareTo(D0.w.f1302b) > 0) {
            r12 = r12.i(Integer.valueOf(b(r12.h()).size()));
        }
        this.f2217i.C(r12);
    }

    private boolean N() {
        return (!n() || this.f2217i.n() || this.f2214f.isEmpty()) ? false : true;
    }

    private boolean O() {
        return (!n() || this.f2218j.n() || this.f2220l.isEmpty()) ? false : true;
    }

    private void R() {
        AbstractC0386b.d(N(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f2219k = new b0(this.f2209a, this);
        this.f2217i.v();
        this.f2215g.e();
    }

    private void S() {
        AbstractC0386b.d(O(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.f2218j.v();
    }

    private void l(E0.g gVar) {
        AbstractC0386b.d(m(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.f2220l.add(gVar);
        if (this.f2218j.m() && this.f2218j.A()) {
            this.f2218j.F(gVar.h());
        }
    }

    private boolean m() {
        return n() && this.f2220l.size() < 10;
    }

    private void o() {
        this.f2219k = null;
    }

    private void r() {
        this.f2217i.w();
        this.f2218j.w();
        if (!this.f2220l.isEmpty()) {
            J0.A.a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.f2220l.size()));
            this.f2220l.clear();
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(D0.w wVar, a0 a0Var) {
        this.f2215g.i(EnumC0201b0.ONLINE);
        AbstractC0386b.d((this.f2217i == null || this.f2219k == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z2 = a0Var instanceof a0.d;
        a0.d dVar = z2 ? (a0.d) a0Var : null;
        if (dVar != null && dVar.b().equals(a0.e.Removed) && dVar.a() != null) {
            H(dVar);
            return;
        }
        if (a0Var instanceof a0.b) {
            this.f2219k.i((a0.b) a0Var);
        } else if (a0Var instanceof a0.c) {
            this.f2219k.j((a0.c) a0Var);
        } else {
            AbstractC0386b.d(z2, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
            this.f2219k.k((a0.d) a0Var);
        }
        if (wVar.equals(D0.w.f1302b) || wVar.compareTo(this.f2211c.G()) < 0) {
            return;
        }
        I(wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(l0 l0Var) {
        if (l0Var.o()) {
            AbstractC0386b.d(!N(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        o();
        if (!N()) {
            this.f2215g.i(EnumC0201b0.UNKNOWN);
        } else {
            this.f2215g.d(l0Var);
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Iterator it = this.f2214f.values().iterator();
        while (it.hasNext()) {
            M((R1) it.next());
        }
    }

    private void z(l0 l0Var) {
        AbstractC0386b.d(!l0Var.o(), "Handling write error with status OK.", new Object[0]);
        if (r.k(l0Var)) {
            E0.g gVar = (E0.g) this.f2220l.poll();
            this.f2218j.l();
            this.f2210b.d(gVar.e(), l0Var);
            u();
        }
    }

    public void G(R1 r12) {
        Integer numValueOf = Integer.valueOf(r12.h());
        if (this.f2214f.containsKey(numValueOf)) {
            return;
        }
        this.f2214f.put(numValueOf, r12);
        if (N()) {
            R();
        } else if (this.f2217i.m()) {
            M(r12);
        }
    }

    public Task K(f0 f0Var, List list) {
        return n() ? this.f2212d.o(f0Var, list) : Tasks.forException(new com.google.firebase.firestore.T("Failed to get result from server.", T.a.UNAVAILABLE));
    }

    public void P() {
        J0.A.a("RemoteStore", "Shutting down", new Object[0]);
        this.f2213e.shutdown();
        this.f2216h = false;
        r();
        this.f2212d.p();
        this.f2215g.i(EnumC0201b0.UNKNOWN);
    }

    public void Q() {
        s();
    }

    public void T(int i3) {
        AbstractC0386b.d(((R1) this.f2214f.remove(Integer.valueOf(i3))) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i3));
        if (this.f2217i.m()) {
            L(i3);
        }
        if (this.f2214f.isEmpty()) {
            if (this.f2217i.m()) {
                this.f2217i.q();
            } else if (n()) {
                this.f2215g.i(EnumC0201b0.UNKNOWN);
            }
        }
    }

    @Override // I0.b0.c
    public R1 a(int i3) {
        return (R1) this.f2214f.get(Integer.valueOf(i3));
    }

    @Override // I0.b0.c
    public t0.e b(int i3) {
        return this.f2210b.b(i3);
    }

    public boolean n() {
        return this.f2216h;
    }

    public q0 p() {
        return new q0(this.f2212d);
    }

    public void q() {
        this.f2216h = false;
        r();
        this.f2215g.i(EnumC0201b0.OFFLINE);
    }

    public void s() {
        this.f2216h = true;
        if (n()) {
            this.f2218j.D(this.f2211c.H());
            if (N()) {
                R();
            } else {
                this.f2215g.i(EnumC0201b0.UNKNOWN);
            }
            u();
        }
    }

    public void t(V0.q qVar, InterfaceC0755u0 interfaceC0755u0) {
        if (n()) {
            this.f2212d.g(qVar, interfaceC0755u0);
        } else {
            interfaceC0755u0.a(new com.google.firebase.firestore.T("Failed to get result from server.", T.a.UNAVAILABLE));
        }
    }

    public void u() {
        int iE = this.f2220l.isEmpty() ? -1 : ((E0.g) this.f2220l.getLast()).e();
        while (true) {
            if (!m()) {
                break;
            }
            E0.g gVarK = this.f2211c.K(iE);
            if (gVarK != null) {
                l(gVarK);
                iE = gVarK.e();
            } else if (this.f2220l.size() == 0) {
                this.f2218j.q();
            }
        }
        if (O()) {
            S();
        }
    }

    public void v() {
        if (n()) {
            J0.A.a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            J();
        }
    }
}
