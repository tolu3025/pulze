package C0;

import A0.AbstractC0207e0;
import A0.EnumC0205d0;
import A0.h0;
import D0.q;
import J0.AbstractC0386b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import k0.C1004r;

/* JADX INFO: renamed from: C0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0276q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0282s0 f1076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0253i0 f1077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0231b f1078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0264m f1079d;

    /* JADX INFO: renamed from: C0.q$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1080a;

        static {
            int[] iArr = new int[EnumC0205d0.values().length];
            f1080a = iArr;
            try {
                iArr[EnumC0205d0.f119a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1080a[EnumC0205d0.f122d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    C0276q(InterfaceC0282s0 interfaceC0282s0, InterfaceC0253i0 interfaceC0253i0, InterfaceC0231b interfaceC0231b, InterfaceC0264m interfaceC0264m) {
        this.f1076a = interfaceC0282s0;
        this.f1077b = interfaceC0253i0;
        this.f1078c = interfaceC0231b;
        this.f1079d = interfaceC0264m;
    }

    private Map a(Map map, Map map2, Set set) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (D0.s sVar : map.values()) {
            E0.k kVar = (E0.k) map2.get(sVar.getKey());
            if (set.contains(sVar.getKey()) && (kVar == null || (kVar.d() instanceof E0.l))) {
                map3.put(sVar.getKey(), sVar);
            } else if (kVar != null) {
                map4.put(sVar.getKey(), kVar.d().e());
                kVar.d().a(sVar, kVar.d().e(), C1004r.m());
            } else {
                map4.put(sVar.getKey(), E0.d.f1383b);
            }
        }
        map4.putAll(p(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map5.put((D0.l) entry.getKey(), new C0259k0((D0.i) entry.getValue(), (E0.d) map4.get(entry.getKey())));
        }
        return map5;
    }

    private D0.s b(D0.l lVar, E0.k kVar) {
        return (kVar == null || (kVar.d() instanceof E0.l)) ? this.f1076a.f(lVar) : D0.s.r(lVar);
    }

    private t0.c e(A0.f0 f0Var, q.a aVar, C0265m0 c0265m0) {
        AbstractC0386b.d(f0Var.n().isEmpty(), "Currently we only support collection group queries at the root.", new Object[0]);
        String strF = f0Var.f();
        t0.c cVarA = D0.j.a();
        Iterator it = this.f1079d.b(strF).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : f(f0Var.a((D0.u) ((D0.u) it.next()).m(strF)), aVar, c0265m0)) {
                cVarA = cVarA.m((D0.l) entry.getKey(), (D0.i) entry.getValue());
            }
        }
        return cVarA;
    }

    private t0.c f(final A0.f0 f0Var, q.a aVar, C0265m0 c0265m0) {
        Map mapC = this.f1078c.c(f0Var.n(), aVar.k());
        return r(mapC, this.f1076a.d(new h0.b(f0Var), aVar, mapC.keySet(), c0265m0), new J0.y() { // from class: C0.o
            @Override // J0.y
            public final Object c(Object obj) {
                return Boolean.valueOf(f0Var.u((D0.i) obj));
            }
        });
    }

    private t0.c g(D0.u uVar) {
        t0.c cVarA = D0.j.a();
        D0.i iVarC = c(D0.l.j(uVar));
        return iVarC.d() ? cVarA.m(iVarC.getKey(), iVarC) : cVarA;
    }

    private t0.c h(A0.h0 h0Var, q.a aVar, C0265m0 c0265m0) {
        Map mapD;
        final com.google.firebase.firestore.J0 j0G = h0Var.g();
        if (AbstractC0207e0.f(j0G) == EnumC0205d0.f120b) {
            String strD = AbstractC0207e0.d(j0G);
            AbstractC0386b.d(strD != null, "Pipeline source type is COLLECTION_GROUP but is missing", new Object[0]);
            t0.c cVarA = D0.j.a();
            Iterator it = this.f1079d.b(strD).iterator();
            while (it.hasNext()) {
                for (Map.Entry entry : h(new h0.a(AbstractC0207e0.a(j0G, (D0.u) ((D0.u) it.next()).m(strD))), aVar, c0265m0)) {
                    cVarA = cVarA.m((D0.l) entry.getKey(), (D0.i) entry.getValue());
                }
            }
            return cVarA;
        }
        Map mapN = n(j0G, aVar.k());
        int i3 = a.f1080a[AbstractC0207e0.f(j0G).ordinal()];
        if (i3 == 1) {
            mapD = this.f1076a.d(h0Var, aVar, mapN.keySet(), c0265m0);
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException("Invalid pipeline source to execute offline: " + j0G);
            }
            List listAsList = Arrays.asList(AbstractC0207e0.e(j0G));
            HashSet hashSet = new HashSet();
            Iterator it2 = listAsList.iterator();
            while (it2.hasNext()) {
                hashSet.add(D0.l.k((String) it2.next()));
            }
            mapD = this.f1076a.e(hashSet);
        }
        Objects.requireNonNull(j0G);
        return r(mapN, mapD, new J0.y() { // from class: C0.p
            @Override // J0.y
            public final Object c(Object obj) {
                return Boolean.valueOf(j0G.p((D0.i) obj));
            }
        });
    }

    private Map n(com.google.firebase.firestore.J0 j02, int i3) {
        int i4 = a.f1080a[AbstractC0207e0.f(j02).ordinal()];
        if (i4 == 1) {
            String strC = AbstractC0207e0.c(j02);
            AbstractC0386b.d(strC != null, "Pipeline source type is COLLECTION but is missing", new Object[0]);
            return this.f1078c.c(D0.u.B(strC), i3);
        }
        if (i4 != 2) {
            throw new IllegalArgumentException("GetOverlaysForPipeline: Unrecognized pipeline source type for pipeline " + j02);
        }
        List listAsList = Arrays.asList(AbstractC0207e0.e(j02));
        AbstractC0386b.d(listAsList != null, "Pipeline source type is DOCUMENTS but is missing", new Object[0]);
        TreeSet treeSet = new TreeSet();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            treeSet.add(D0.l.k((String) it.next()));
        }
        return this.f1078c.a(treeSet);
    }

    private void o(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            if (!map.containsKey(lVar)) {
                treeSet.add(lVar);
            }
        }
        map.putAll(this.f1078c.a(treeSet));
    }

    private Map p(Map map) {
        List<E0.g> listE = this.f1077b.e(map.keySet());
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (E0.g gVar : listE) {
            for (D0.l lVar : gVar.f()) {
                D0.s sVar = (D0.s) map.get(lVar);
                if (sVar != null) {
                    map2.put(lVar, gVar.b(sVar, map2.containsKey(lVar) ? (E0.d) map2.get(lVar) : E0.d.f1383b));
                    int iE = gVar.e();
                    if (!treeMap.containsKey(Integer.valueOf(iE))) {
                        treeMap.put(Integer.valueOf(iE), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(iE))).add(lVar);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap map3 = new HashMap();
            for (D0.l lVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(lVar2)) {
                    E0.f fVarC = E0.f.c((D0.s) map.get(lVar2), (E0.d) map2.get(lVar2));
                    if (fVarC != null) {
                        map3.put(lVar2, fVarC);
                    }
                    hashSet.add(lVar2);
                }
            }
            this.f1078c.e(((Integer) entry.getKey()).intValue(), map3);
        }
        return map2;
    }

    private t0.c r(Map map, Map map2, J0.y yVar) {
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                map2.put((D0.l) entry.getKey(), D0.s.r((D0.l) entry.getKey()));
            }
        }
        t0.c cVarA = D0.j.a();
        for (Map.Entry entry2 : map2.entrySet()) {
            E0.k kVar = (E0.k) map.get(entry2.getKey());
            if (kVar != null) {
                kVar.d().a((D0.s) entry2.getValue(), E0.d.f1383b, C1004r.m());
            }
            if (((Boolean) yVar.c((D0.i) entry2.getValue())).booleanValue()) {
                cVarA = cVarA.m((D0.l) entry2.getKey(), (D0.i) entry2.getValue());
            }
        }
        return cVarA;
    }

    D0.i c(D0.l lVar) {
        E0.k kVarD = this.f1078c.d(lVar);
        D0.s sVarB = b(lVar, kVarD);
        if (kVarD != null) {
            kVarD.d().a(sVarB, E0.d.f1383b, C1004r.m());
        }
        return sVarB;
    }

    t0.c d(Iterable iterable) {
        return k(this.f1076a.e(iterable), new HashSet());
    }

    t0.c i(A0.h0 h0Var, q.a aVar) {
        return j(h0Var, aVar, null);
    }

    t0.c j(A0.h0 h0Var, q.a aVar, C0265m0 c0265m0) {
        if (!h0Var.d()) {
            return h(h0Var, aVar, c0265m0);
        }
        if (h0Var.h().r()) {
            return g(h0Var.h().n());
        }
        boolean zQ = h0Var.h().q();
        A0.f0 f0VarH = h0Var.h();
        return zQ ? e(f0VarH, aVar, c0265m0) : f(f0VarH, aVar, c0265m0);
    }

    t0.c k(Map map, Set set) {
        HashMap map2 = new HashMap();
        o(map2, map.keySet());
        t0.c cVarA = D0.j.a();
        for (Map.Entry entry : a(map, map2, set).entrySet()) {
            cVarA = cVarA.m((D0.l) entry.getKey(), ((C0259k0) entry.getValue()).a());
        }
        return cVarA;
    }

    C0267n l(String str, q.a aVar, int i3) {
        Map mapC = this.f1076a.c(str, aVar, i3);
        Map mapF = i3 - mapC.size() > 0 ? this.f1078c.f(str, aVar.k(), i3 - mapC.size()) : new HashMap();
        int iMax = -1;
        for (E0.k kVar : mapF.values()) {
            if (!mapC.containsKey(kVar.b())) {
                mapC.put(kVar.b(), b(kVar.b(), kVar));
            }
            iMax = Math.max(iMax, kVar.c());
        }
        o(mapF, mapC.keySet());
        return C0267n.a(iMax, a(mapC, mapF, Collections.emptySet()));
    }

    Map m(Map map) {
        HashMap map2 = new HashMap();
        o(map2, map.keySet());
        return a(map, map2, new HashSet());
    }

    void q(Set set) {
        p(this.f1076a.e(set));
    }
}
