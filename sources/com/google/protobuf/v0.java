package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f6979a = 100;

    v0() {
    }

    private final void l(Object obj, l0 l0Var, int i3) {
        while (l0Var.p() != Integer.MAX_VALUE && m(obj, l0Var, i3)) {
        }
    }

    abstract void a(Object obj, int i3, int i4);

    abstract void b(Object obj, int i3, long j3);

    abstract void c(Object obj, int i3, Object obj2);

    abstract void d(Object obj, int i3, AbstractC0791i abstractC0791i);

    abstract void e(Object obj, int i3, long j3);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, l0 l0Var, int i3) throws D {
        int iC = l0Var.c();
        int iA = B0.a(iC);
        int iB = B0.b(iC);
        if (iB == 0) {
            e(obj, iA, l0Var.E());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, l0Var.f());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, l0Var.u());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw D.e();
            }
            a(obj, iA, l0Var.n());
            return true;
        }
        Object objN = n();
        int iC2 = B0.c(iA, 4);
        int i4 = i3 + 1;
        if (i4 >= f6979a) {
            throw D.i();
        }
        l(objN, l0Var, i4);
        if (iC2 != l0Var.c()) {
            throw D.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(l0 l0Var);

    abstract Object r(Object obj);

    abstract void s(Object obj, C0 c02);

    abstract void t(Object obj, C0 c02);
}
