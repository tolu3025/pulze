package c2;

import M1.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    public static final Object a(long j3, M1.d dVar) {
        if (j3 <= 0) {
            return I1.u.f2419a;
        }
        C0580p c0580p = new C0580p(N1.c.c(dVar), 1);
        c0580p.F();
        if (j3 < Long.MAX_VALUE) {
            b(c0580p.getContext()).L(j3, c0580p);
        }
        Object objZ = c0580p.z();
        if (objZ == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objZ == N1.d.e() ? objZ : I1.u.f2419a;
    }

    public static final X b(M1.g gVar) {
        g.b bVar = gVar.get(M1.e.f2704g);
        X x2 = bVar instanceof X ? (X) bVar : null;
        return x2 == null ? U.a() : x2;
    }
}
