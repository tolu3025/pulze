package E0;

import D0.r;
import D0.s;
import D0.t;
import J0.AbstractC0386b;
import V0.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.l f1387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f1388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f1389c;

    f(D0.l lVar, m mVar) {
        this(lVar, mVar, new ArrayList());
    }

    public static f c(s sVar, d dVar) {
        if (!sVar.g()) {
            return null;
        }
        if (dVar != null && dVar.c().isEmpty()) {
            return null;
        }
        if (dVar == null) {
            return sVar.j() ? new c(sVar.getKey(), m.f1404c) : new o(sVar.getKey(), sVar.b(), m.f1404c);
        }
        t tVarB = sVar.b();
        t tVar = new t();
        HashSet hashSet = new HashSet();
        for (r rVar : dVar.c()) {
            if (!hashSet.contains(rVar)) {
                if (tVarB.i(rVar) == null && rVar.w() > 1) {
                    rVar = (r) rVar.y();
                }
                tVar.l(rVar, tVarB.i(rVar));
                hashSet.add(rVar);
            }
        }
        return new l(sVar.getKey(), tVar, d.b(hashSet), m.f1404c);
    }

    public abstract d a(s sVar, d dVar, C1004r c1004r);

    public abstract void b(s sVar, i iVar);

    public t d(D0.i iVar) {
        t tVar = null;
        for (e eVar : this.f1389c) {
            I iA = eVar.b().a(iVar.e(eVar.a()));
            if (iA != null) {
                if (tVar == null) {
                    tVar = new t();
                }
                tVar.l(eVar.a(), iA);
            }
        }
        return tVar;
    }

    public abstract d e();

    public List f() {
        return this.f1389c;
    }

    public D0.l g() {
        return this.f1387a;
    }

    public m h() {
        return this.f1388b;
    }

    boolean i(f fVar) {
        return this.f1387a.equals(fVar.f1387a) && this.f1388b.equals(fVar.f1388b);
    }

    int j() {
        return (g().hashCode() * 31) + this.f1388b.hashCode();
    }

    String k() {
        return "key=" + this.f1387a + ", precondition=" + this.f1388b;
    }

    protected Map l(C1004r c1004r, s sVar) {
        HashMap map = new HashMap(this.f1389c.size());
        for (e eVar : this.f1389c) {
            map.put(eVar.a(), eVar.b().c(sVar.e(eVar.a()), c1004r));
        }
        return map;
    }

    protected Map m(s sVar, List list) {
        HashMap map = new HashMap(this.f1389c.size());
        AbstractC0386b.d(this.f1389c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f1389c.size()));
        for (int i3 = 0; i3 < list.size(); i3++) {
            e eVar = (e) this.f1389c.get(i3);
            map.put(eVar.a(), eVar.b().b(sVar.e(eVar.a()), (I) list.get(i3)));
        }
        return map;
    }

    void n(s sVar) {
        AbstractC0386b.d(sVar.getKey().equals(g()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    f(D0.l lVar, m mVar, List list) {
        this.f1387a = lVar;
        this.f1388b = mVar;
        this.f1389c = list;
    }
}
