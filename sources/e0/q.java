package E0;

import D0.s;
import J0.AbstractC0386b;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public final class q extends f {
    public q(D0.l lVar, m mVar) {
        super(lVar, mVar);
    }

    @Override // E0.f
    public d a(s sVar, d dVar, C1004r c1004r) {
        throw AbstractC0386b.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // E0.f
    public void b(s sVar, i iVar) {
        throw AbstractC0386b.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // E0.f
    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return i((q) obj);
    }

    public int hashCode() {
        return j();
    }

    public String toString() {
        return "VerifyMutation{" + k() + "}";
    }
}
