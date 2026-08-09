package C0;

import A0.n0;
import C0.T;
import J0.AbstractC0386b;
import android.util.SparseArray;
import com.google.protobuf.AbstractC0791i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k0.C1004r;
import y0.C1288j;
import z0.InterfaceC1326a;

/* JADX INFO: loaded from: classes.dex */
public final class M implements InterfaceC1326a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f818o = TimeUnit.MINUTES.toSeconds(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0262l0 f819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0246g f820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0264m f821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0253i0 f822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0231b f823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0282s0 f824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0276q f825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0268n0 f826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0279r0 f827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Q1 f828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC0228a f829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SparseArray f830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final A0.m0 f832n;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        R1 f833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f834b;

        private b() {
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f836b;

        private c(Map map, Set set) {
            this.f835a = map;
            this.f836b = set;
        }
    }

    public M(AbstractC0262l0 abstractC0262l0, C0268n0 c0268n0, C1288j c1288j) {
        AbstractC0386b.d(abstractC0262l0.j(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f819a = abstractC0262l0;
        this.f826h = c0268n0;
        this.f820b = abstractC0262l0.c();
        Q1 q1I = abstractC0262l0.i();
        this.f828j = q1I;
        this.f829k = abstractC0262l0.a();
        this.f832n = A0.m0.b(q1I.i());
        this.f824f = abstractC0262l0.h();
        C0279r0 c0279r0 = new C0279r0();
        this.f827i = c0279r0;
        this.f830l = new SparseArray();
        this.f831m = new HashMap();
        abstractC0262l0.g().p(c0279r0);
        O(c1288j);
    }

    private Set F(E0.h hVar) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < hVar.e().size(); i3++) {
            if (!((E0.i) hVar.e().get(i3)).a().isEmpty()) {
                hashSet.add(((E0.f) hVar.b().h().get(i3)).g());
            }
        }
        return hashSet;
    }

    private void O(C1288j c1288j) {
        InterfaceC0264m interfaceC0264mD = this.f819a.d(c1288j);
        this.f821c = interfaceC0264mD;
        this.f822d = this.f819a.e(c1288j, interfaceC0264mD);
        InterfaceC0231b interfaceC0231bB = this.f819a.b(c1288j);
        this.f823e = interfaceC0231bB;
        this.f825g = new C0276q(this.f824f, this.f822d, interfaceC0231bB, this.f821c);
        this.f824f.a(this.f821c);
        this.f826h.f(this.f825g, this.f821c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t0.c P(E0.h hVar) {
        E0.g gVarB = hVar.b();
        this.f822d.b(gVarB, hVar.f());
        y(hVar);
        this.f822d.a();
        this.f823e.b(hVar.b().e());
        this.f825g.q(F(hVar));
        return this.f825g.d(gVarB.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(b bVar, A0.n0 n0Var) {
        int iC = this.f832n.c();
        bVar.f834b = iC;
        R1 r12 = new R1(n0Var, iC, this.f819a.g().o(), EnumC0271o0.LISTEN);
        bVar.f833a = r12;
        this.f828j.h(r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t0.c R(t0.c cVar, R1 r12) {
        t0.e eVarH = D0.l.h();
        HashMap map = new HashMap();
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            D0.l lVar = (D0.l) entry.getKey();
            D0.s sVar = (D0.s) entry.getValue();
            if (sVar.d()) {
                eVarH = eVarH.d(lVar);
            }
            map.put(lVar, sVar);
        }
        this.f828j.d(r12.h());
        this.f828j.g(eVarH, r12.h());
        c cVarJ0 = j0(map);
        return this.f825g.k(cVarJ0.f835a, cVarJ0.f836b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t0.c S(I0.O o2, D0.w wVar) {
        Map mapD = o2.d();
        long jO = this.f819a.g().o();
        for (Map.Entry entry : mapD.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            I0.X x2 = (I0.X) entry.getValue();
            R1 r12 = (R1) this.f830l.get(iIntValue);
            if (r12 != null) {
                this.f828j.e(x2.d(), iIntValue);
                this.f828j.g(x2.b(), iIntValue);
                R1 r1L = r12.l(jO);
                if (o2.e().containsKey(num)) {
                    AbstractC0791i abstractC0791i = AbstractC0791i.f6770b;
                    D0.w wVar2 = D0.w.f1302b;
                    r1L = r1L.k(abstractC0791i, wVar2).j(wVar2);
                } else if (!x2.e().isEmpty()) {
                    r1L = r1L.k(x2.e(), o2.c());
                }
                this.f830l.put(iIntValue, r1L);
                if (p0(r12, r1L, x2)) {
                    this.f828j.f(r1L);
                }
            }
        }
        Map mapA = o2.a();
        Set setB = o2.b();
        for (D0.l lVar : mapA.keySet()) {
            if (setB.contains(lVar)) {
                this.f819a.g().i(lVar);
            }
        }
        c cVarJ0 = j0(mapA);
        Map map = cVarJ0.f835a;
        D0.w wVarC = this.f828j.c();
        if (!wVar.equals(D0.w.f1302b)) {
            AbstractC0386b.d(wVar.compareTo(wVarC) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", wVar, wVarC);
            this.f828j.a(wVar);
        }
        return this.f825g.k(map, cVarJ0.f836b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ T.c T(T t2) {
        return t2.f(this.f830l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(List list) {
        Collection collectionK = this.f821c.k();
        Comparator comparator = D0.q.f1270b;
        final InterfaceC0264m interfaceC0264m = this.f821c;
        Objects.requireNonNull(interfaceC0264m);
        J0.n nVar = new J0.n() { // from class: C0.x
            @Override // J0.n
            public final void accept(Object obj) {
                interfaceC0264m.n((D0.q) obj);
            }
        };
        final InterfaceC0264m interfaceC0264m2 = this.f821c;
        Objects.requireNonNull(interfaceC0264m2);
        J0.L.l(collectionK, list, comparator, nVar, new J0.n() { // from class: C0.y
            @Override // J0.n
            public final void accept(Object obj) {
                interfaceC0264m2.a((D0.q) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        this.f821c.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ z0.j W(String str) {
        return this.f829k.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean X(z0.e eVar) {
        z0.e eVarB = this.f829k.b(eVar.a());
        return Boolean.valueOf(eVarB != null && eVarB.b().compareTo(eVar.b()) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N n3 = (N) it.next();
            int iD = n3.d();
            this.f827i.b(n3.b(), iD);
            t0.e eVarC = n3.c();
            Iterator it2 = eVarC.iterator();
            while (it2.hasNext()) {
                this.f819a.g().f((D0.l) it2.next());
            }
            this.f827i.g(eVarC, iD);
            if (!n3.e()) {
                R1 r12 = (R1) this.f830l.get(iD);
                AbstractC0386b.d(r12 != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(iD));
                R1 r1J = r12.j(r12.f());
                this.f830l.put(iD, r1J);
                if (p0(r12, r1J, null)) {
                    this.f828j.f(r1J);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t0.c Z(int i3) {
        E0.g gVarG = this.f822d.g(i3);
        AbstractC0386b.d(gVarG != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.f822d.f(gVarG);
        this.f822d.a();
        this.f823e.b(i3);
        this.f825g.q(gVarG.f());
        return this.f825g.d(gVarG.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(int i3) {
        R1 r12 = (R1) this.f830l.get(i3);
        AbstractC0386b.d(r12 != null, "Tried to release nonexistent target: %s", Integer.valueOf(i3));
        Iterator it = this.f827i.h(i3).iterator();
        while (it.hasNext()) {
            this.f819a.g().f((D0.l) it.next());
        }
        this.f819a.g().a(r12);
        this.f830l.remove(i3);
        this.f831m.remove(r12.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(z0.e eVar) {
        this.f829k.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(z0.j jVar, R1 r12, int i3, t0.e eVar) {
        if (jVar.c().compareTo(r12.f()) > 0) {
            R1 r1K = r12.k(AbstractC0791i.f6770b, jVar.c());
            this.f830l.append(i3, r1K);
            this.f828j.f(r1K);
            this.f828j.d(i3);
            this.f828j.g(eVar, i3);
        }
        this.f829k.d(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(AbstractC0791i abstractC0791i) {
        this.f822d.j(abstractC0791i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0() {
        this.f821c.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0() {
        this.f822d.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C0267n g0(Set set, List list, C1004r c1004r) {
        Map mapE = this.f824f.e(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : mapE.entrySet()) {
            if (!((D0.s) entry.getValue()).p()) {
                hashSet.add((D0.l) entry.getKey());
            }
        }
        Map mapM = this.f825g.m(mapE);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E0.f fVar = (E0.f) it.next();
            D0.t tVarD = fVar.d(((C0259k0) mapM.get(fVar.g())).a());
            if (tVarD != null) {
                arrayList.add(new E0.l(fVar.g(), tVarD, tVarD.j(), E0.m.a(true)));
            }
        }
        E0.g gVarH = this.f822d.h(c1004r, arrayList, list);
        this.f823e.e(gVarH.e(), gVarH.a(mapM, hashSet));
        return C0267n.a(gVarH.e(), mapM);
    }

    private static A0.l0 h0(String str) {
        return A0.f0.b(D0.u.B("__bundle__/docs/" + str)).D();
    }

    private c j0(Map map) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map mapE = this.f824f.e(map.keySet());
        for (Map.Entry entry : map.entrySet()) {
            D0.l lVar = (D0.l) entry.getKey();
            D0.s sVar = (D0.s) entry.getValue();
            D0.s sVar2 = (D0.s) mapE.get(lVar);
            if (sVar.d() != sVar2.d()) {
                hashSet.add(lVar);
            }
            if (sVar.j() && sVar.l().equals(D0.w.f1302b)) {
                arrayList.add(sVar.getKey());
            } else if (!sVar2.p() || sVar.l().compareTo(sVar2.l()) > 0 || (sVar.l().compareTo(sVar2.l()) == 0 && sVar2.h())) {
                AbstractC0386b.d(!D0.w.f1302b.equals(sVar.i()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.f824f.b(sVar, sVar.i());
            } else {
                J0.A.a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", lVar, sVar2.l(), sVar.l());
            }
            map2.put(lVar, sVar);
        }
        this.f824f.removeAll(arrayList);
        return new c(map2, hashSet);
    }

    private static boolean p0(R1 r12, R1 r13, I0.X x2) {
        if (r12.d().isEmpty()) {
            return true;
        }
        long jL = r13.f().e().l() - r12.f().e().l();
        long j3 = f818o;
        if (jL < j3 && r13.b().e().l() - r12.b().e().l() < j3) {
            return x2 != null && (x2.b().size() + x2.c().size()) + x2.d().size() > 0;
        }
        return true;
    }

    private void r0() {
        this.f819a.l("Start IndexManager", new Runnable() { // from class: C0.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f1088a.e0();
            }
        });
    }

    private void s0() {
        this.f819a.l("Start MutationQueue", new Runnable() { // from class: C0.D
            @Override // java.lang.Runnable
            public final void run() {
                this.f775a.f0();
            }
        });
    }

    private void y(E0.h hVar) {
        E0.g gVarB = hVar.b();
        for (D0.l lVar : gVarB.f()) {
            D0.s sVarF = this.f824f.f(lVar);
            D0.w wVar = (D0.w) hVar.d().b(lVar);
            AbstractC0386b.d(wVar != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (sVarF.l().compareTo(wVar) < 0) {
                gVarB.c(sVarF, hVar);
                if (sVarF.p()) {
                    this.f824f.b(sVarF, hVar.c());
                }
            }
        }
        this.f822d.f(gVarB);
    }

    public void A(final List list) {
        this.f819a.l("Configure indexes", new Runnable() { // from class: C0.L
            @Override // java.lang.Runnable
            public final void run() {
                this.f811a.U(list);
            }
        });
    }

    public void B() {
        this.f819a.l("Delete All Indexes", new Runnable() { // from class: C0.J
            @Override // java.lang.Runnable
            public final void run() {
                this.f802a.V();
            }
        });
    }

    public C0274p0 C(A0.h0 h0Var, boolean z2) {
        t0.e eVarB;
        D0.w wVarB;
        R1 r1L = L(h0Var.i());
        D0.w wVar = D0.w.f1302b;
        t0.e eVarH = D0.l.h();
        if (r1L != null) {
            wVarB = r1L.b();
            eVarB = this.f828j.b(r1L.h());
        } else {
            eVarB = eVarH;
            wVarB = wVar;
        }
        C0268n0 c0268n0 = this.f826h;
        if (z2) {
            wVar = wVarB;
        }
        return new C0274p0(c0268n0.e(h0Var, wVar, eVarB), eVarB);
    }

    public int D() {
        return this.f822d.d();
    }

    public InterfaceC0264m E() {
        return this.f821c;
    }

    public D0.w G() {
        return this.f828j.c();
    }

    public AbstractC0791i H() {
        return this.f822d.i();
    }

    public C0276q I() {
        return this.f825g;
    }

    public z0.j J(final String str) {
        return (z0.j) this.f819a.k("Get named query", new J0.E() { // from class: C0.t
            @Override // J0.E
            public final Object get() {
                return this.f1090a.W(str);
            }
        });
    }

    public E0.g K(int i3) {
        return this.f822d.c(i3);
    }

    R1 L(A0.n0 n0Var) {
        Integer num = (Integer) this.f831m.get(n0Var);
        return num != null ? (R1) this.f830l.get(num.intValue()) : this.f828j.j(n0Var);
    }

    public t0.c M(C1288j c1288j) {
        List listK = this.f822d.k();
        O(c1288j);
        r0();
        s0();
        List listK2 = this.f822d.k();
        t0.e eVarH = D0.l.h();
        Iterator it = Arrays.asList(listK, listK2).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((E0.g) it2.next()).h().iterator();
                while (it3.hasNext()) {
                    eVarH = eVarH.d(((E0.f) it3.next()).g());
                }
            }
        }
        return this.f825g.d(eVarH);
    }

    public boolean N(final z0.e eVar) {
        return ((Boolean) this.f819a.k("Has newer bundle", new J0.E() { // from class: C0.K
            @Override // J0.E
            public final Object get() {
                return this.f807a.X(eVar);
            }
        })).booleanValue();
    }

    @Override // z0.InterfaceC1326a
    public void a(final z0.e eVar) {
        this.f819a.l("Save bundle", new Runnable() { // from class: C0.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f1101a.b0(eVar);
            }
        });
    }

    @Override // z0.InterfaceC1326a
    public t0.c b(final t0.c cVar, String str) {
        final R1 r1W = w(new n0.b(h0(str)));
        return (t0.c) this.f819a.k("Apply bundle documents", new J0.E() { // from class: C0.I
            @Override // J0.E
            public final Object get() {
                return this.f796a.R(cVar, r1W);
            }
        });
    }

    @Override // z0.InterfaceC1326a
    public void c(final z0.j jVar, final t0.e eVar) {
        final R1 r1W = w(new n0.b(jVar.a().b()));
        final int iH = r1W.h();
        this.f819a.l("Saved named query", new Runnable() { // from class: C0.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f1094a.c0(jVar, r1W, iH, eVar);
            }
        });
    }

    public void i0(final List list) {
        this.f819a.l("notifyLocalViewChanges", new Runnable() { // from class: C0.H
            @Override // java.lang.Runnable
            public final void run() {
                this.f791a.Y(list);
            }
        });
    }

    public D0.i k0(D0.l lVar) {
        return this.f825g.c(lVar);
    }

    public t0.c l0(final int i3) {
        return (t0.c) this.f819a.k("Reject batch", new J0.E() { // from class: C0.G
            @Override // J0.E
            public final Object get() {
                return this.f786a.Z(i3);
            }
        });
    }

    public void m0(final int i3) {
        this.f819a.l("Release target", new Runnable() { // from class: C0.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f763a.a0(i3);
            }
        });
    }

    public void n0(boolean z2) {
        this.f826h.j(z2);
    }

    public void o0(final AbstractC0791i abstractC0791i) {
        this.f819a.l("Set stream token", new Runnable() { // from class: C0.F
            @Override // java.lang.Runnable
            public final void run() {
                this.f781a.d0(abstractC0791i);
            }
        });
    }

    public void q0() {
        this.f819a.f().run();
        r0();
        s0();
    }

    public C0267n t0(final List list) {
        final C1004r c1004rM = C1004r.m();
        final HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((E0.f) it.next()).g());
        }
        return (C0267n) this.f819a.k("Locally write mutations", new J0.E() { // from class: C0.w
            @Override // J0.E
            public final Object get() {
                return this.f1108a.g0(hashSet, list, c1004rM);
            }
        });
    }

    public t0.c v(final E0.h hVar) {
        return (t0.c) this.f819a.k("Acknowledge batch", new J0.E() { // from class: C0.C
            @Override // J0.E
            public final Object get() {
                return this.f769a.P(hVar);
            }
        });
    }

    public R1 w(final A0.n0 n0Var) {
        int iH;
        R1 r1M;
        R1 r1J = this.f828j.j(n0Var);
        if (r1J != null) {
            iH = r1J.h();
            r1M = r1J.m(n0Var);
        } else {
            final b bVar = new b();
            this.f819a.l("Allocate target", new Runnable() { // from class: C0.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f753a.Q(bVar, n0Var);
                }
            });
            iH = bVar.f834b;
            r1M = bVar.f833a;
        }
        if (this.f830l.get(iH) == null) {
            this.f830l.put(iH, r1M);
            this.f831m.put(n0Var, Integer.valueOf(iH));
        }
        return r1M;
    }

    public t0.c x(final I0.O o2) {
        final D0.w wVarC = o2.c();
        return (t0.c) this.f819a.k("Apply remote event", new J0.E() { // from class: C0.z
            @Override // J0.E
            public final Object get() {
                return this.f1125a.S(o2, wVarC);
            }
        });
    }

    public T.c z(final T t2) {
        return (T.c) this.f819a.k("Collect garbage", new J0.E() { // from class: C0.E
            @Override // J0.E
            public final Object get() {
                return this.f778a.T(t2);
            }
        });
    }
}
