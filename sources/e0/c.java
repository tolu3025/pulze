package E0;

import D0.s;
import J0.AbstractC0386b;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {
    public c(D0.l lVar, m mVar) {
        super(lVar, mVar);
    }

    @Override // E0.f
    public d a(s sVar, d dVar, C1004r c1004r) {
        n(sVar);
        if (!h().e(sVar)) {
            return dVar;
        }
        sVar.m(sVar.l()).v();
        return null;
    }

    @Override // E0.f
    public void b(s sVar, i iVar) {
        n(sVar);
        AbstractC0386b.d(iVar.a().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        sVar.m(iVar.b()).u();
    }

    @Override // E0.f
    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return i((c) obj);
    }

    public int hashCode() {
        return j();
    }

    public String toString() {
        return "DeleteMutation{" + k() + "}";
    }
}
