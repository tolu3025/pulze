package M1;

import M1.g;
import U1.p;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f2698a;

    public a(g.c key) {
        m.e(key, "key");
        this.f2698a = key;
    }

    @Override // M1.g.b, M1.g
    public Object fold(Object obj, p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    @Override // M1.g.b, M1.g
    public g.b get(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // M1.g.b
    public g.c getKey() {
        return this.f2698a;
    }

    @Override // M1.g.b, M1.g
    public g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // M1.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
