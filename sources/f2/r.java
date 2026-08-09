package f2;

import h2.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f7313a = new D("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f7314b = new D("PENDING");

    public static final l a(Object obj) {
        if (obj == null) {
            obj = g2.m.f7367a;
        }
        return new q(obj);
    }

    public static final b d(p pVar, M1.g gVar, int i3, e2.a aVar) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || aVar != e2.a.f7118b) ? o.a(pVar, gVar, i3, aVar) : pVar;
    }
}
