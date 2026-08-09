package A0;

import A0.AbstractC0212j;
import C0.AbstractC0262l0;
import C0.C0244f0;
import C0.C0261l;
import C0.C0268n0;
import C0.P1;
import C0.T;
import I0.U;
import com.google.firebase.firestore.C0730h0;

/* JADX INFO: loaded from: classes.dex */
public class Z extends AbstractC0212j {

    private class b implements U.c {
        private b() {
        }

        @Override // I0.U.c
        public void a(EnumC0201b0 enumC0201b0) {
            Z.this.r().a(enumC0201b0);
        }

        @Override // I0.U.c
        public t0.e b(int i3) {
            return Z.this.r().b(i3);
        }

        @Override // I0.U.c
        public void c(int i3, y1.l0 l0Var) {
            Z.this.r().c(i3, l0Var);
        }

        @Override // I0.U.c
        public void d(int i3, y1.l0 l0Var) {
            Z.this.r().d(i3, l0Var);
        }

        @Override // I0.U.c
        public void e(E0.h hVar) {
            Z.this.r().e(hVar);
        }

        @Override // I0.U.c
        public void f(I0.O o2) {
            Z.this.r().f(o2);
        }
    }

    public Z(com.google.firebase.firestore.U u2) {
        super(u2);
    }

    private boolean t(com.google.firebase.firestore.U u2) {
        if (u2.f() != null && (u2.f() instanceof C0730h0)) {
            ((C0730h0) u2.f()).a();
        }
        return false;
    }

    @Override // A0.AbstractC0212j
    protected C0217o a(AbstractC0212j.a aVar) {
        return new C0217o(r());
    }

    @Override // A0.AbstractC0212j
    protected P1 b(AbstractC0212j.a aVar) {
        return null;
    }

    @Override // A0.AbstractC0212j
    protected C0261l c(AbstractC0212j.a aVar) {
        return null;
    }

    @Override // A0.AbstractC0212j
    protected C0.M d(AbstractC0212j.a aVar) {
        return new C0.M(o(), new C0268n0(), aVar.f174d);
    }

    @Override // A0.AbstractC0212j
    protected AbstractC0262l0 e(AbstractC0212j.a aVar) {
        if (!t(this.f162a)) {
            return C0244f0.o();
        }
        return C0244f0.p(T.b.a(this.f162a.g()), new C0.r(p()));
    }

    @Override // A0.AbstractC0212j
    protected I0.U f(AbstractC0212j.a aVar) {
        return new I0.U(aVar.f173c.a(), new b(), n(), j(), aVar.f172b, i());
    }

    @Override // A0.AbstractC0212j
    protected k0 g(AbstractC0212j.a aVar) {
        return new k0(n(), q(), aVar.f174d, aVar.f175e);
    }
}
