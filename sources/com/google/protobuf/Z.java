package com.google.protobuf;

import c.AbstractC0527b;
import com.google.protobuf.AbstractC0788f;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class Z implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f6742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f6743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f6745d;

    private Z(v0 v0Var, r rVar, V v2) {
        this.f6743b = v0Var;
        this.f6744c = rVar.e(v2);
        this.f6745d = rVar;
        this.f6742a = v2;
    }

    private int k(v0 v0Var, Object obj) {
        return v0Var.i(v0Var.g(obj));
    }

    private void l(v0 v0Var, r rVar, Object obj, l0 l0Var, C0799q c0799q) {
        Object objF = v0Var.f(obj);
        C0802u c0802uD = rVar.d(obj);
        while (l0Var.p() != Integer.MAX_VALUE) {
            try {
                if (!n(l0Var, c0799q, rVar, c0802uD, v0Var, objF)) {
                    return;
                }
            } finally {
                v0Var.o(obj, objF);
            }
        }
    }

    static Z m(v0 v0Var, r rVar, V v2) {
        return new Z(v0Var, rVar, v2);
    }

    private boolean n(l0 l0Var, C0799q c0799q, r rVar, C0802u c0802u, v0 v0Var, Object obj) throws D {
        int iC = l0Var.c();
        int iW = 0;
        if (iC != B0.f6629a) {
            if (B0.b(iC) != 2) {
                return l0Var.y();
            }
            Object objB = rVar.b(c0799q, this.f6742a, B0.a(iC));
            if (objB == null) {
                return v0Var.m(obj, l0Var, 0);
            }
            rVar.h(l0Var, objB, c0799q, c0802u);
            return true;
        }
        Object objB2 = null;
        AbstractC0791i abstractC0791iU = null;
        while (l0Var.p() != Integer.MAX_VALUE) {
            int iC2 = l0Var.c();
            if (iC2 == B0.f6631c) {
                iW = l0Var.w();
                objB2 = rVar.b(c0799q, this.f6742a, iW);
            } else if (iC2 == B0.f6632d) {
                if (objB2 != null) {
                    rVar.h(l0Var, objB2, c0799q, c0802u);
                } else {
                    abstractC0791iU = l0Var.u();
                }
            } else if (!l0Var.y()) {
                break;
            }
        }
        if (l0Var.c() != B0.f6630b) {
            throw D.b();
        }
        if (abstractC0791iU != null) {
            if (objB2 != null) {
                rVar.i(abstractC0791iU, objB2, c0799q, c0802u);
            } else {
                v0Var.d(obj, iW, abstractC0791iU);
            }
        }
        return true;
    }

    private void o(v0 v0Var, Object obj, C0 c02) {
        v0Var.s(v0Var.g(obj), c02);
    }

    @Override // com.google.protobuf.n0
    public void a(Object obj, Object obj2) {
        p0.F(this.f6743b, obj, obj2);
        if (this.f6744c) {
            p0.D(this.f6745d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.n0
    public void b(Object obj) {
        this.f6743b.j(obj);
        this.f6745d.f(obj);
    }

    @Override // com.google.protobuf.n0
    public final boolean c(Object obj) {
        return this.f6745d.c(obj).k();
    }

    @Override // com.google.protobuf.n0
    public boolean d(Object obj, Object obj2) {
        if (!this.f6743b.g(obj).equals(this.f6743b.g(obj2))) {
            return false;
        }
        if (this.f6744c) {
            return this.f6745d.c(obj).equals(this.f6745d.c(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.n0
    public int e(Object obj) {
        int iK = k(this.f6743b, obj);
        return this.f6744c ? iK + this.f6745d.c(obj).f() : iK;
    }

    @Override // com.google.protobuf.n0
    public Object f() {
        V v2 = this.f6742a;
        return v2 instanceof AbstractC0806y ? ((AbstractC0806y) v2).O() : v2.c().f();
    }

    @Override // com.google.protobuf.n0
    public int g(Object obj) {
        int iHashCode = this.f6743b.g(obj).hashCode();
        return this.f6744c ? (iHashCode * 53) + this.f6745d.c(obj).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.n0
    public void h(Object obj, C0 c02) {
        Iterator itN = this.f6745d.c(obj).n();
        if (itN.hasNext()) {
            AbstractC0527b.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        o(this.f6743b, obj, c02);
    }

    @Override // com.google.protobuf.n0
    public void i(Object obj, l0 l0Var, C0799q c0799q) {
        l(this.f6743b, this.f6745d, obj, l0Var, c0799q);
    }

    @Override // com.google.protobuf.n0
    public void j(Object obj, byte[] bArr, int i3, int i4, AbstractC0788f.a aVar) {
        AbstractC0806y abstractC0806y = (AbstractC0806y) obj;
        if (abstractC0806y.unknownFields == w0.c()) {
            abstractC0806y.unknownFields = w0.k();
        }
        AbstractC0527b.a(obj);
        throw null;
    }
}
