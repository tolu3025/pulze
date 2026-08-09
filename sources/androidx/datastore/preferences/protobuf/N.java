package androidx.datastore.preferences.protobuf;

import c.AbstractC0527b;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class N implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f4017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f4018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f4019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC0500n f4020d;

    private N(f0 f0Var, AbstractC0500n abstractC0500n, J j3) {
        this.f4018b = f0Var;
        this.f4019c = abstractC0500n.e(j3);
        this.f4020d = abstractC0500n;
        this.f4017a = j3;
    }

    private int j(f0 f0Var, Object obj) {
        return f0Var.i(f0Var.g(obj));
    }

    private void k(f0 f0Var, AbstractC0500n abstractC0500n, Object obj, X x2, C0499m c0499m) {
        Object objF = f0Var.f(obj);
        C0503q c0503qD = abstractC0500n.d(obj);
        while (x2.p() != Integer.MAX_VALUE) {
            try {
                if (!m(x2, c0499m, abstractC0500n, c0503qD, f0Var, objF)) {
                    return;
                }
            } finally {
                f0Var.o(obj, objF);
            }
        }
    }

    static N l(f0 f0Var, AbstractC0500n abstractC0500n, J j3) {
        return new N(f0Var, abstractC0500n, j3);
    }

    private boolean m(X x2, C0499m c0499m, AbstractC0500n abstractC0500n, C0503q c0503q, f0 f0Var, Object obj) throws C0507v {
        int iC = x2.c();
        int iW = 0;
        if (iC != k0.f4147a) {
            if (k0.b(iC) != 2) {
                return x2.y();
            }
            Object objB = abstractC0500n.b(c0499m, this.f4017a, k0.a(iC));
            if (objB == null) {
                return f0Var.m(obj, x2, 0);
            }
            abstractC0500n.h(x2, objB, c0499m, c0503q);
            return true;
        }
        Object objB2 = null;
        AbstractC0492f abstractC0492fU = null;
        while (x2.p() != Integer.MAX_VALUE) {
            int iC2 = x2.c();
            if (iC2 == k0.f4149c) {
                iW = x2.w();
                objB2 = abstractC0500n.b(c0499m, this.f4017a, iW);
            } else if (iC2 == k0.f4150d) {
                if (objB2 != null) {
                    abstractC0500n.h(x2, objB2, c0499m, c0503q);
                } else {
                    abstractC0492fU = x2.u();
                }
            } else if (!x2.y()) {
                break;
            }
        }
        if (x2.c() != k0.f4148b) {
            throw C0507v.b();
        }
        if (abstractC0492fU != null) {
            if (objB2 != null) {
                abstractC0500n.i(abstractC0492fU, objB2, c0499m, c0503q);
            } else {
                f0Var.d(obj, iW, abstractC0492fU);
            }
        }
        return true;
    }

    private void n(f0 f0Var, Object obj, l0 l0Var) {
        f0Var.s(f0Var.g(obj), l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void a(Object obj, Object obj2) {
        a0.F(this.f4018b, obj, obj2);
        if (this.f4019c) {
            a0.D(this.f4020d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void b(Object obj) {
        this.f4018b.j(obj);
        this.f4020d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public final boolean c(Object obj) {
        return this.f4020d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean d(Object obj, Object obj2) {
        if (!this.f4018b.g(obj).equals(this.f4018b.g(obj2))) {
            return false;
        }
        if (this.f4019c) {
            return this.f4020d.c(obj).equals(this.f4020d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int e(Object obj) {
        int iJ = j(this.f4018b, obj);
        return this.f4019c ? iJ + this.f4020d.c(obj).f() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public Object f() {
        J j3 = this.f4017a;
        return j3 instanceof AbstractC0505t ? ((AbstractC0505t) j3).I() : j3.c().f();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int g(Object obj) {
        int iHashCode = this.f4018b.g(obj).hashCode();
        return this.f4019c ? (iHashCode * 53) + this.f4020d.c(obj).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void h(Object obj, X x2, C0499m c0499m) {
        k(this.f4018b, this.f4020d, obj, x2, c0499m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void i(Object obj, l0 l0Var) {
        Iterator itN = this.f4020d.c(obj).n();
        if (itN.hasNext()) {
            AbstractC0527b.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        n(this.f4018b, obj, l0Var);
    }
}
