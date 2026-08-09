package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f4076a = 100;

    f0() {
    }

    private final void l(Object obj, X x2, int i3) {
        while (x2.p() != Integer.MAX_VALUE && m(obj, x2, i3)) {
        }
    }

    abstract void a(Object obj, int i3, int i4);

    abstract void b(Object obj, int i3, long j3);

    abstract void c(Object obj, int i3, Object obj2);

    abstract void d(Object obj, int i3, AbstractC0492f abstractC0492f);

    abstract void e(Object obj, int i3, long j3);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, X x2, int i3) throws C0507v {
        int iC = x2.c();
        int iA = k0.a(iC);
        int iB = k0.b(iC);
        if (iB == 0) {
            e(obj, iA, x2.E());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, x2.f());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, x2.u());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C0507v.e();
            }
            a(obj, iA, x2.n());
            return true;
        }
        Object objN = n();
        int iC2 = k0.c(iA, 4);
        int i4 = i3 + 1;
        if (i4 >= f4076a) {
            throw C0507v.i();
        }
        l(objN, x2, i4);
        if (iC2 != x2.c()) {
            throw C0507v.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(X x2);

    abstract Object r(Object obj);

    abstract void s(Object obj, l0 l0Var);

    abstract void t(Object obj, l0 l0Var);
}
