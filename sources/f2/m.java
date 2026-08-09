package f2;

import I1.u;

/* JADX INFO: loaded from: classes.dex */
final class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U1.p f7301a;

    public m(U1.p pVar) {
        this.f7301a = pVar;
    }

    @Override // f2.a
    public Object c(c cVar, M1.d dVar) {
        Object objInvoke = this.f7301a.invoke(cVar, dVar);
        return objInvoke == N1.d.e() ? objInvoke : u.f2419a;
    }
}
