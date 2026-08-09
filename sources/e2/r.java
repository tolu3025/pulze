package e2;

import e2.k;
import h2.P;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes.dex */
public class r extends e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f7171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a f7172s;

    public r(int i3, a aVar, U1.l lVar) {
        super(i3, lVar);
        this.f7171r = i3;
        this.f7172s = aVar;
        if (aVar == a.f7117a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + z.b(e.class).b() + " instead").toString());
        }
        if (i3 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i3 + " was specified").toString());
    }

    static /* synthetic */ Object b1(r rVar, Object obj, M1.d dVar) throws Throwable {
        P pC;
        Object objD1 = rVar.d1(obj, true);
        if (!(objD1 instanceof k.a)) {
            return I1.u.f2419a;
        }
        k.c(objD1);
        U1.l lVar = rVar.f7137b;
        if (lVar == null || (pC = h2.w.c(lVar, obj, null, 2, null)) == null) {
            throw rVar.Z();
        }
        I1.b.a(pC, rVar.Z());
        throw pC;
    }

    private final Object c1(Object obj, boolean z2) {
        U1.l lVar;
        P pC;
        Object objJ = super.j(obj);
        if (k.f(objJ) || k.e(objJ)) {
            return objJ;
        }
        if (!z2 || (lVar = this.f7137b) == null || (pC = h2.w.c(lVar, obj, null, 2, null)) == null) {
            return k.f7166a.c(I1.u.f2419a);
        }
        throw pC;
    }

    private final Object d1(Object obj, boolean z2) {
        return this.f7172s == a.f7119c ? c1(obj, z2) : R0(obj);
    }

    @Override // e2.e, e2.w
    public Object h(Object obj, M1.d dVar) {
        return b1(this, obj, dVar);
    }

    @Override // e2.e, e2.w
    public Object j(Object obj) {
        return d1(obj, false);
    }

    @Override // e2.e
    protected boolean o0() {
        return this.f7172s == a.f7118b;
    }
}
