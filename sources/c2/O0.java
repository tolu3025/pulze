package c2;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
final class O0 extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0580p f5095e;

    public O0(C0580p c0580p) {
        this.f5095e = c0580p;
    }

    @Override // c2.E0
    public boolean v() {
        return false;
    }

    @Override // c2.E0
    public void w(Throwable th) {
        C0580p c0580p;
        Object objH;
        Object objX = u().X();
        if (objX instanceof C) {
            c0580p = this.f5095e;
            n.a aVar = I1.n.f2411b;
            objH = I1.o.a(((C) objX).f5057a);
        } else {
            c0580p = this.f5095e;
            n.a aVar2 = I1.n.f2411b;
            objH = G0.h(objX);
        }
        c0580p.resumeWith(I1.n.b(objH));
    }
}
