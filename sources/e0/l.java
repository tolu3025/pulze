package E0;

import D0.r;
import D0.s;
import D0.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public final class l extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f1402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f1403e;

    public l(D0.l lVar, t tVar, d dVar, m mVar) {
        this(lVar, tVar, dVar, mVar, new ArrayList());
    }

    private List o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = f().iterator();
        while (it.hasNext()) {
            arrayList.add(((e) it.next()).a());
        }
        return arrayList;
    }

    private Map p() {
        HashMap map = new HashMap();
        for (r rVar : this.f1403e.c()) {
            if (!rVar.isEmpty()) {
                map.put(rVar, this.f1402d.i(rVar));
            }
        }
        return map;
    }

    @Override // E0.f
    public d a(s sVar, d dVar, C1004r c1004r) {
        n(sVar);
        if (!h().e(sVar)) {
            return dVar;
        }
        Map mapL = l(c1004r, sVar);
        Map mapP = p();
        t tVarB = sVar.b();
        tVarB.m(mapP);
        tVarB.m(mapL);
        sVar.a(sVar.l(), sVar.b()).v();
        if (dVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(dVar.c());
        hashSet.addAll(this.f1403e.c());
        hashSet.addAll(o());
        return d.b(hashSet);
    }

    @Override // E0.f
    public void b(s sVar, i iVar) {
        n(sVar);
        if (!h().e(sVar)) {
            sVar.n(iVar.b());
            return;
        }
        Map mapM = m(sVar, iVar.a());
        t tVarB = sVar.b();
        tVarB.m(p());
        tVarB.m(mapM);
        sVar.a(iVar.b(), sVar.b()).u();
    }

    @Override // E0.f
    public d e() {
        return this.f1403e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return i(lVar) && this.f1402d.equals(lVar.f1402d) && f().equals(lVar.f());
    }

    public int hashCode() {
        return (j() * 31) + this.f1402d.hashCode();
    }

    public t q() {
        return this.f1402d;
    }

    public String toString() {
        return "PatchMutation{" + k() + ", mask=" + this.f1403e + ", value=" + this.f1402d + "}";
    }

    public l(D0.l lVar, t tVar, d dVar, m mVar, List list) {
        super(lVar, mVar, list);
        this.f1402d = tVar;
        this.f1403e = dVar;
    }
}
