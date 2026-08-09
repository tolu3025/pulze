package A0;

import A0.C0218p;
import J0.AbstractC0386b;

/* JADX INFO: renamed from: A0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0199a0 extends C0218p {
    C0199a0(D0.r rVar, V0.I i3) {
        super(rVar, C0218p.b.NOT_IN, i3);
        AbstractC0386b.d(D0.z.Q(i3), "NotInFilter expects an ArrayValue", new Object[0]);
    }

    @Override // A0.C0218p, A0.AbstractC0219q
    public boolean d(D0.i iVar) {
        V0.I iE;
        return (D0.z.s(h().o0(), D0.z.f1310c) || (iE = iVar.e(f())) == null || iE.G0() || D0.z.s(h().o0(), iE)) ? false : true;
    }
}
