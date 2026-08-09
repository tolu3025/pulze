package A0;

import A0.C0218p;
import J0.AbstractC0386b;

/* JADX INFO: loaded from: classes.dex */
public class T extends C0218p {
    T(D0.r rVar, V0.I i3) {
        super(rVar, C0218p.b.IN, i3);
        AbstractC0386b.d(D0.z.Q(i3), "InFilter expects an ArrayValue", new Object[0]);
    }

    @Override // A0.C0218p, A0.AbstractC0219q
    public boolean d(D0.i iVar) {
        V0.I iE = iVar.e(f());
        return iE != null && D0.z.s(h().o0(), iE);
    }
}
