package E0;

import C0.C0259k0;
import D0.s;
import D0.w;
import J0.AbstractC0386b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1004r f1391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f1392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f1393d;

    public g(int i3, C1004r c1004r, List list, List list2) {
        AbstractC0386b.d(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f1390a = i3;
        this.f1391b = c1004r;
        this.f1392c = list;
        this.f1393d = list2;
    }

    public Map a(Map map, Set set) {
        HashMap map2 = new HashMap();
        for (D0.l lVar : f()) {
            s sVar = (s) ((C0259k0) map.get(lVar)).a();
            d dVarB = b(sVar, ((C0259k0) map.get(lVar)).b());
            if (set.contains(lVar)) {
                dVarB = null;
            }
            f fVarC = f.c(sVar, dVarB);
            if (fVarC != null) {
                map2.put(lVar, fVarC);
            }
            if (!sVar.p()) {
                sVar.m(w.f1302b);
            }
        }
        return map2;
    }

    public d b(s sVar, d dVar) {
        for (int i3 = 0; i3 < this.f1392c.size(); i3++) {
            f fVar = (f) this.f1392c.get(i3);
            if (fVar.g().equals(sVar.getKey())) {
                dVar = fVar.a(sVar, dVar, this.f1391b);
            }
        }
        for (int i4 = 0; i4 < this.f1393d.size(); i4++) {
            f fVar2 = (f) this.f1393d.get(i4);
            if (fVar2.g().equals(sVar.getKey())) {
                dVar = fVar2.a(sVar, dVar, this.f1391b);
            }
        }
        return dVar;
    }

    public void c(s sVar, h hVar) {
        int size = this.f1393d.size();
        List listE = hVar.e();
        AbstractC0386b.d(listE.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(listE.size()));
        for (int i3 = 0; i3 < size; i3++) {
            f fVar = (f) this.f1393d.get(i3);
            if (fVar.g().equals(sVar.getKey())) {
                fVar.b(sVar, (i) listE.get(i3));
            }
        }
    }

    public List d() {
        return this.f1392c;
    }

    public int e() {
        return this.f1390a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1390a == gVar.f1390a && this.f1391b.equals(gVar.f1391b) && this.f1392c.equals(gVar.f1392c) && this.f1393d.equals(gVar.f1393d);
    }

    public Set f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1393d.iterator();
        while (it.hasNext()) {
            hashSet.add(((f) it.next()).g());
        }
        return hashSet;
    }

    public C1004r g() {
        return this.f1391b;
    }

    public List h() {
        return this.f1393d;
    }

    public int hashCode() {
        return (((((this.f1390a * 31) + this.f1391b.hashCode()) * 31) + this.f1392c.hashCode()) * 31) + this.f1393d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f1390a + ", localWriteTime=" + this.f1391b + ", baseMutations=" + this.f1392c + ", mutations=" + this.f1393d + ')';
    }
}
