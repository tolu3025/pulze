package r0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class q {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1200c f11153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f11154b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f11155c = new HashSet();

        b(C1200c c1200c) {
            this.f11153a = c1200c;
        }

        void a(b bVar) {
            this.f11154b.add(bVar);
        }

        void b(b bVar) {
            this.f11155c.add(bVar);
        }

        C1200c c() {
            return this.f11153a;
        }

        Set d() {
            return this.f11154b;
        }

        boolean e() {
            return this.f11154b.isEmpty();
        }

        boolean f() {
            return this.f11155c.isEmpty();
        }

        void g(b bVar) {
            this.f11155c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F f11156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f11157b;

        private c(F f3, boolean z2) {
            this.f11156a = f3;
            this.f11157b = z2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f11156a.equals(this.f11156a) && cVar.f11157b == this.f11157b;
        }

        public int hashCode() {
            return ((this.f11156a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f11157b).hashCode();
        }
    }

    static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i3 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i3++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i3 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new s(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().g()) {
                            if (rVar.e() && (set = (Set) map.get(new c(rVar.c(), rVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C1200c c1200c = (C1200c) it.next();
            b bVar3 = new b(c1200c);
            for (F f3 : c1200c.j()) {
                c cVar = new c(f3, !c1200c.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f11157b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", f3));
                }
                set2.add(bVar3);
            }
        }
    }
}
