package A0;

import A0.AbstractC0212j;
import C0.AbstractC0262l0;
import C0.C0254i1;
import C0.C0261l;
import C0.P1;
import C0.T;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends Z {
    public j0(com.google.firebase.firestore.U u2) {
        super(u2);
    }

    @Override // A0.Z, A0.AbstractC0212j
    protected P1 b(AbstractC0212j.a aVar) {
        return ((C0254i1) o()).g().j().j(aVar.f172b, n());
    }

    @Override // A0.Z, A0.AbstractC0212j
    protected C0261l c(AbstractC0212j.a aVar) {
        return new C0261l(o(), aVar.f172b, n());
    }

    @Override // A0.Z, A0.AbstractC0212j
    protected AbstractC0262l0 e(AbstractC0212j.a aVar) {
        return new C0254i1(aVar.f171a, aVar.f173c.c(), aVar.f173c.a(), new C0.r(p()), T.b.a(this.f162a.g()));
    }
}
