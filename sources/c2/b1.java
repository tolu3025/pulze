package c2;

import M1.g;

/* JADX INFO: loaded from: classes.dex */
final class b1 implements g.b, g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f5119a = new b1();

    private b1() {
    }

    @Override // M1.g.b, M1.g
    public Object fold(Object obj, U1.p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    @Override // M1.g.b, M1.g
    public g.b get(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // M1.g.b, M1.g
    public M1.g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // M1.g
    public M1.g plus(M1.g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // M1.g.b
    public g.c getKey() {
        return this;
    }
}
