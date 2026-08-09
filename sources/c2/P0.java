package c2;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
final class P0 extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M1.d f5103e;

    public P0(M1.d dVar) {
        this.f5103e = dVar;
    }

    @Override // c2.E0
    public boolean v() {
        return false;
    }

    @Override // c2.E0
    public void w(Throwable th) {
        M1.d dVar = this.f5103e;
        n.a aVar = I1.n.f2411b;
        dVar.resumeWith(I1.n.b(I1.u.f2419a));
    }
}
