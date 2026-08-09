package C0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class W implements InterfaceC0231b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TreeMap f916a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f917b = new HashMap();

    private void g(int i3, E0.f fVar) {
        E0.k kVar = (E0.k) this.f916a.get(fVar.g());
        if (kVar != null) {
            ((Set) this.f917b.get(Integer.valueOf(kVar.c()))).remove(fVar.g());
        }
        this.f916a.put(fVar.g(), E0.k.a(i3, fVar));
        if (this.f917b.get(Integer.valueOf(i3)) == null) {
            this.f917b.put(Integer.valueOf(i3), new HashSet());
        }
        ((Set) this.f917b.get(Integer.valueOf(i3))).add(fVar.g());
    }

    @Override // C0.InterfaceC0231b
    public Map a(SortedSet sortedSet) {
        HashMap map = new HashMap();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            E0.k kVar = (E0.k) this.f916a.get(lVar);
            if (kVar != null) {
                map.put(lVar, kVar);
            }
        }
        return map;
    }

    @Override // C0.InterfaceC0231b
    public void b(int i3) {
        if (this.f917b.containsKey(Integer.valueOf(i3))) {
            Set set = (Set) this.f917b.get(Integer.valueOf(i3));
            this.f917b.remove(Integer.valueOf(i3));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f916a.remove((D0.l) it.next());
            }
        }
    }

    @Override // C0.InterfaceC0231b
    public Map c(D0.u uVar, int i3) {
        HashMap map = new HashMap();
        int iW = uVar.w() + 1;
        for (E0.k kVar : this.f916a.tailMap(D0.l.j((D0.u) uVar.m(""))).values()) {
            D0.l lVarB = kVar.b();
            if (!uVar.v(lVarB.p())) {
                break;
            }
            if (lVarB.p().w() == iW && kVar.c() > i3) {
                map.put(kVar.b(), kVar);
            }
        }
        return map;
    }

    @Override // C0.InterfaceC0231b
    public E0.k d(D0.l lVar) {
        return (E0.k) this.f916a.get(lVar);
    }

    @Override // C0.InterfaceC0231b
    public void e(int i3, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            g(i3, (E0.f) J0.C.d((E0.f) entry.getValue(), "null value for key: %s", entry.getKey()));
        }
    }

    @Override // C0.InterfaceC0231b
    public Map f(String str, int i3, int i4) {
        TreeMap treeMap = new TreeMap();
        for (E0.k kVar : this.f916a.values()) {
            if (kVar.b().m().equals(str) && kVar.c() > i3) {
                Map map = (Map) treeMap.get(Integer.valueOf(kVar.c()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(kVar.c()), map);
                }
                map.put(kVar.b(), kVar);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            map2.putAll((Map) it.next());
            if (map2.size() >= i4) {
                break;
            }
        }
        return map2;
    }
}
