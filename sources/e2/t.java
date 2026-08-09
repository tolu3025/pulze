package e2;

import c2.M;
import e2.w;

/* JADX INFO: loaded from: classes.dex */
final class t extends h implements u {
    public t(M1.g gVar, g gVar2) {
        super(gVar, gVar2, true, true);
    }

    @Override // c2.AbstractC0550a
    protected void J0(Throwable th, boolean z2) {
        if (M0().a(th) || z2) {
            return;
        }
        M.a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c2.AbstractC0550a
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public void K0(I1.u uVar) {
        w.a.a(M0(), null, 1, null);
    }

    @Override // c2.AbstractC0550a, c2.F0, c2.InterfaceC0600z0
    public boolean isActive() {
        return super.isActive();
    }
}
