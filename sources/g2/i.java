package g2;

import M1.g;

/* JADX INFO: loaded from: classes.dex */
public final class i implements M1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M1.g f7363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f7364b;

    public i(Throwable th, M1.g gVar) {
        this.f7363a = gVar;
        this.f7364b = th;
    }

    @Override // M1.g
    public Object fold(Object obj, U1.p pVar) {
        return this.f7363a.fold(obj, pVar);
    }

    @Override // M1.g
    public g.b get(g.c cVar) {
        return this.f7363a.get(cVar);
    }

    @Override // M1.g
    public M1.g minusKey(g.c cVar) {
        return this.f7363a.minusKey(cVar);
    }

    @Override // M1.g
    public M1.g plus(M1.g gVar) {
        return this.f7363a.plus(gVar);
    }
}
