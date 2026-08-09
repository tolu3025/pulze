package I0;

import A0.C0215m;
import C0.EnumC0271o0;
import C0.R1;
import I0.C0373n;
import I0.Z;
import I0.a0;
import J0.AbstractC0386b;
import V0.C0428g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f2262b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f2263c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f2264d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f2265e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D0.f f2266f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2267a;

        static {
            int[] iArr = new int[a0.e.values().length];
            f2267a = iArr;
            try {
                iArr[a0.e.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2267a[a0.e.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2267a[a0.e.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2267a[a0.e.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2267a[a0.e.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        SUCCESS,
        SKIPPED,
        FALSE_POSITIVE
    }

    public interface c {
        R1 a(int i3);

        t0.e b(int i3);
    }

    public b0(D0.f fVar, c cVar) {
        this.f2266f = fVar;
        this.f2261a = cVar;
    }

    private void a(int i3, D0.s sVar) {
        if (l(i3)) {
            e(i3).a(sVar.getKey(), s(i3, sVar.getKey()) ? C0215m.a.MODIFIED : C0215m.a.ADDED);
            this.f2263c.put(sVar.getKey(), sVar);
            d(sVar.getKey()).add(Integer.valueOf(i3));
        }
    }

    private b b(C0373n c0373n, a0.c cVar, int i3) {
        return cVar.a().a() == i3 - f(c0373n, cVar.b()) ? b.SUCCESS : b.FALSE_POSITIVE;
    }

    private Set d(D0.l lVar) {
        Set set = (Set) this.f2264d.get(lVar);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f2264d.put(lVar, hashSet);
        return hashSet;
    }

    private Y e(int i3) {
        Y y2 = (Y) this.f2262b.get(Integer.valueOf(i3));
        if (y2 != null) {
            return y2;
        }
        Y y3 = new Y();
        this.f2262b.put(Integer.valueOf(i3), y3);
        return y3;
    }

    private int f(C0373n c0373n, int i3) {
        t0.e<D0.l> eVarB = this.f2261a.b(i3);
        String str = "projects/" + this.f2266f.i() + "/databases/" + this.f2266f.h() + "/documents/";
        int i4 = 0;
        for (D0.l lVar : eVarB) {
            if (!c0373n.h(str + lVar.p().n())) {
                p(i3, lVar, null);
                i4++;
            }
        }
        return i4;
    }

    private int g(int i3) {
        X xJ = e(i3).j();
        return (this.f2261a.b(i3).size() + xJ.b().size()) - xJ.d().size();
    }

    private Collection h(a0.d dVar) {
        List listD = dVar.d();
        if (!listD.isEmpty()) {
            return listD;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f2262b.keySet()) {
            if (l(num.intValue())) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    private boolean l(int i3) {
        return n(i3) != null;
    }

    private C0373n m(a0.c cVar) {
        C0428g c0428gB = cVar.a().b();
        if (c0428gB != null && c0428gB.d0()) {
            try {
                C0373n c0373nA = C0373n.a(c0428gB.a0().a0(), c0428gB.a0().c0(), c0428gB.c0());
                if (c0373nA.c() == 0) {
                    return null;
                }
                return c0373nA;
            } catch (C0373n.a e3) {
                J0.A.e("WatchChangeAggregator", "Applying bloom filter failed: (" + e3.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
            }
        }
        return null;
    }

    private R1 n(int i3) {
        Y y2 = (Y) this.f2262b.get(Integer.valueOf(i3));
        if (y2 == null || !y2.e()) {
            return this.f2261a.a(i3);
        }
        return null;
    }

    private void p(int i3, D0.l lVar, D0.s sVar) {
        if (l(i3)) {
            Y yE = e(i3);
            if (s(i3, lVar)) {
                yE.a(lVar, C0215m.a.REMOVED);
            } else {
                yE.i(lVar);
            }
            d(lVar).add(Integer.valueOf(i3));
            if (sVar != null) {
                this.f2263c.put(lVar, sVar);
            }
        }
    }

    private void r(int i3) {
        AbstractC0386b.d((this.f2262b.get(Integer.valueOf(i3)) == null || ((Y) this.f2262b.get(Integer.valueOf(i3))).e()) ? false : true, "Should only reset active targets", new Object[0]);
        this.f2262b.put(Integer.valueOf(i3), new Y());
        Iterator it = this.f2261a.b(i3).iterator();
        while (it.hasNext()) {
            p(i3, (D0.l) it.next(), null);
        }
    }

    private boolean s(int i3, D0.l lVar) {
        return this.f2261a.b(i3).contains(lVar);
    }

    public O c(D0.w wVar) {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f2262b.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            Y y2 = (Y) entry.getValue();
            R1 r1N = n(iIntValue);
            if (r1N != null) {
                D0.u uVarB = r1N.g().b();
                if (y2.d() && uVarB != null) {
                    D0.l lVarJ = D0.l.j(uVarB);
                    if (this.f2263c.get(lVarJ) == null && !s(iIntValue, lVarJ)) {
                        p(iIntValue, lVarJ, D0.s.s(lVarJ, wVar));
                    }
                }
                if (y2.c()) {
                    map.put(num, y2.j());
                    y2.b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : this.f2264d.entrySet()) {
            D0.l lVar = (D0.l) entry2.getKey();
            Iterator it = ((Set) entry2.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.add(lVar);
                    break;
                }
                R1 r1N2 = n(((Integer) it.next()).intValue());
                if (r1N2 == null || r1N2.c().equals(EnumC0271o0.LIMBO_RESOLUTION)) {
                }
            }
        }
        Iterator it2 = this.f2263c.values().iterator();
        while (it2.hasNext()) {
            ((D0.s) it2.next()).w(wVar);
        }
        O o2 = new O(wVar, Collections.unmodifiableMap(map), Collections.unmodifiableMap(this.f2265e), Collections.unmodifiableMap(this.f2263c), Collections.unmodifiableSet(hashSet));
        this.f2263c = new HashMap();
        this.f2264d = new HashMap();
        this.f2265e = new HashMap();
        return o2;
    }

    public void i(a0.b bVar) {
        D0.s sVarB = bVar.b();
        D0.l lVarA = bVar.a();
        Iterator it = bVar.d().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (sVarB == null || !sVarB.d()) {
                p(iIntValue, lVarA, sVarB);
            } else {
                a(iIntValue, sVarB);
            }
        }
        Iterator it2 = bVar.c().iterator();
        while (it2.hasNext()) {
            p(((Integer) it2.next()).intValue(), lVarA, bVar.b());
        }
    }

    public void j(a0.c cVar) {
        int iB = cVar.b();
        int iA = cVar.a().a();
        R1 r1N = n(iB);
        if (r1N != null) {
            D0.u uVarB = r1N.g().b();
            if (uVarB != null) {
                if (iA != 0) {
                    AbstractC0386b.d(iA == 1, "Single document existence filter with count: %d", Integer.valueOf(iA));
                    return;
                } else {
                    D0.l lVarJ = D0.l.j(uVarB);
                    p(iB, lVarJ, D0.s.s(lVarJ, D0.w.f1302b));
                    return;
                }
            }
            int iG = g(iB);
            if (iG != iA) {
                C0373n c0373nM = m(cVar);
                b bVarB = c0373nM != null ? b(c0373nM, cVar, iG) : b.SKIPPED;
                if (bVarB != b.SUCCESS) {
                    r(iB);
                    this.f2265e.put(Integer.valueOf(iB), bVarB == b.FALSE_POSITIVE ? EnumC0271o0.EXISTENCE_FILTER_MISMATCH_BLOOM : EnumC0271o0.EXISTENCE_FILTER_MISMATCH);
                }
                Z.a().b(Z.b.e(iG, cVar.a(), this.f2266f, c0373nM, bVarB));
            }
        }
    }

    public void k(a0.d dVar) {
        Iterator it = h(dVar).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            Y yE = e(iIntValue);
            int i3 = a.f2267a[dVar.b().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    yE.h();
                    if (!yE.e()) {
                        yE.b();
                    }
                } else if (i3 == 3) {
                    yE.h();
                    if (!yE.e()) {
                        q(iIntValue);
                    }
                    AbstractC0386b.d(dVar.a() == null, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i3 != 4) {
                    if (i3 != 5) {
                        throw AbstractC0386b.a("Unknown target watch change state: %s", dVar.b());
                    }
                    if (l(iIntValue)) {
                        r(iIntValue);
                    }
                } else if (l(iIntValue)) {
                    yE.f();
                }
                yE.k(dVar.c());
            } else if (l(iIntValue)) {
                yE.k(dVar.c());
            }
        }
    }

    void o(int i3) {
        e(i3).g();
    }

    void q(int i3) {
        this.f2262b.remove(Integer.valueOf(i3));
    }
}
