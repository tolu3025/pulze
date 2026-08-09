package E0;

import D0.s;
import D0.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public final class o extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f1408d;

    public o(D0.l lVar, t tVar, m mVar) {
        this(lVar, tVar, mVar, new ArrayList());
    }

    @Override // E0.f
    public d a(s sVar, d dVar, C1004r c1004r) {
        n(sVar);
        if (!h().e(sVar)) {
            return dVar;
        }
        Map mapL = l(c1004r, sVar);
        t tVarClone = this.f1408d.clone();
        tVarClone.m(mapL);
        sVar.a(sVar.l(), tVarClone).v();
        return null;
    }

    @Override // E0.f
    public void b(s sVar, i iVar) {
        n(sVar);
        t tVarClone = this.f1408d.clone();
        tVarClone.m(m(sVar, iVar.a()));
        sVar.a(iVar.b(), tVarClone).u();
    }

    @Override // E0.f
    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return i(oVar) && this.f1408d.equals(oVar.f1408d) && f().equals(oVar.f());
    }

    public int hashCode() {
        return (j() * 31) + this.f1408d.hashCode();
    }

    public t o() {
        return this.f1408d;
    }

    public String toString() {
        return "SetMutation{" + k() + ", value=" + this.f1408d + "}";
    }

    public o(D0.l lVar, t tVar, m mVar, List list) {
        super(lVar, mVar, list);
        this.f1408d = tVar;
    }
}
