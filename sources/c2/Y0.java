package c2;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y0 {
    public static final W0 a(long j3, X x2, InterfaceC0600z0 interfaceC0600z0) {
        return new W0("Timed out waiting for " + j3 + " ms", interfaceC0600z0);
    }

    private static final Object b(X0 x02, U1.p pVar) {
        C0.g(x02, Y.b(x02.f7480d.getContext()).b(x02.f5113e, x02, x02.getContext()));
        return i2.b.c(x02, x02, pVar);
    }

    public static final Object c(long j3, U1.p pVar, M1.d dVar) {
        if (j3 <= 0) {
            throw new W0("Timed out immediately");
        }
        Object objB = b(new X0(j3, dVar), pVar);
        if (objB == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objB;
    }
}
