package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.B0;
import com.google.protobuf.D;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0793k implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0792j f6834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6837d = 0;

    /* JADX INFO: renamed from: com.google.protobuf.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6838a;

        static {
            int[] iArr = new int[B0.b.values().length];
            f6838a = iArr;
            try {
                iArr[B0.b.f6640o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6838a[B0.b.f6644s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6838a[B0.b.f6633c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6838a[B0.b.f6646u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6838a[B0.b.f6639n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6838a[B0.b.f6638m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6838a[B0.b.f6634d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6838a[B0.b.f6637l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6838a[B0.b.f6635e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6838a[B0.b.f6643r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6838a[B0.b.f6647v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6838a[B0.b.f6648w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6838a[B0.b.f6649x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6838a[B0.b.f6650y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6838a[B0.b.f6641p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6838a[B0.b.f6645t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6838a[B0.b.f6636f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C0793k(AbstractC0792j abstractC0792j) {
        AbstractC0792j abstractC0792j2 = (AbstractC0792j) C.b(abstractC0792j, "input");
        this.f6834a = abstractC0792j2;
        abstractC0792j2.f6787d = this;
    }

    public static C0793k O(AbstractC0792j abstractC0792j) {
        C0793k c0793k = abstractC0792j.f6787d;
        return c0793k != null ? c0793k : new C0793k(abstractC0792j);
    }

    private void P(Object obj, n0 n0Var, C0799q c0799q) {
        int i3 = this.f6836c;
        this.f6836c = B0.c(B0.a(this.f6835b), 4);
        try {
            n0Var.i(obj, this, c0799q);
            if (this.f6835b == this.f6836c) {
            } else {
                throw D.h();
            }
        } finally {
            this.f6836c = i3;
        }
    }

    private void Q(Object obj, n0 n0Var, C0799q c0799q) throws D {
        int iF = this.f6834a.F();
        AbstractC0792j abstractC0792j = this.f6834a;
        if (abstractC0792j.f6784a >= abstractC0792j.f6785b) {
            throw D.i();
        }
        int iO = abstractC0792j.o(iF);
        this.f6834a.f6784a++;
        n0Var.i(obj, this, c0799q);
        this.f6834a.a(0);
        r5.f6784a--;
        this.f6834a.n(iO);
    }

    private Object R(B0.b bVar, Class cls, C0799q c0799q) {
        switch (a.f6838a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(o());
            case 2:
                return u();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(b());
            case 5:
                return Integer.valueOf(n());
            case 6:
                return Long.valueOf(f());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(x());
            case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return Long.valueOf(E());
            case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return U(cls, c0799q);
            case 11:
                return Integer.valueOf(z());
            case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return Long.valueOf(r());
            case 13:
                return Integer.valueOf(h());
            case 14:
                return Long.valueOf(j());
            case 15:
                return F();
            case 16:
                return Integer.valueOf(w());
            case V0.I.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return Long.valueOf(d());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object S(n0 n0Var, C0799q c0799q) {
        Object objF = n0Var.f();
        P(objF, n0Var, c0799q);
        n0Var.b(objF);
        return objF;
    }

    private Object T(n0 n0Var, C0799q c0799q) throws D {
        Object objF = n0Var.f();
        Q(objF, n0Var, c0799q);
        n0Var.b(objF);
        return objF;
    }

    private void W(int i3) throws D {
        if (this.f6834a.e() != i3) {
            throw D.m();
        }
    }

    private void X(int i3) throws D.a {
        if (B0.b(this.f6835b) != i3) {
            throw D.e();
        }
    }

    private void Y(int i3) throws D {
        if ((i3 & 3) != 0) {
            throw D.h();
        }
    }

    private void Z(int i3) throws D {
        if ((i3 & 7) != 0) {
            throw D.h();
        }
    }

    @Override // com.google.protobuf.l0
    public void A(List list) throws D.a {
        int iE;
        if (B0.b(this.f6835b) != 2) {
            throw D.e();
        }
        do {
            list.add(u());
            if (this.f6834a.f()) {
                return;
            } else {
                iE = this.f6834a.E();
            }
        } while (iE == this.f6835b);
        this.f6837d = iE;
    }

    @Override // com.google.protobuf.l0
    public void B(List list) throws D {
        int iE;
        int iE2;
        if (!(list instanceof AbstractC0796n)) {
            int iB = B0.b(this.f6835b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f6834a.r()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            int iF = this.f6834a.F();
            Z(iF);
            int iE3 = this.f6834a.e() + iF;
            do {
                list.add(Double.valueOf(this.f6834a.r()));
            } while (this.f6834a.e() < iE3);
            return;
        }
        AbstractC0796n abstractC0796n = (AbstractC0796n) list;
        int iB2 = B0.b(this.f6835b);
        if (iB2 == 1) {
            do {
                abstractC0796n.b(this.f6834a.r());
                if (this.f6834a.f()) {
                    return;
                } else {
                    iE2 = this.f6834a.E();
                }
            } while (iE2 == this.f6835b);
            this.f6837d = iE2;
            return;
        }
        if (iB2 != 2) {
            throw D.e();
        }
        int iF2 = this.f6834a.F();
        Z(iF2);
        int iE4 = this.f6834a.e() + iF2;
        do {
            abstractC0796n.b(this.f6834a.r());
        } while (this.f6834a.e() < iE4);
    }

    @Override // com.google.protobuf.l0
    public void C(List list) throws D {
        int iE;
        int iE2;
        int iE3;
        if (list instanceof L) {
            L l3 = (L) list;
            int iB = B0.b(this.f6835b);
            if (iB == 0) {
                do {
                    l3.b(this.f6834a.x());
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE3 = this.f6834a.E();
                    }
                } while (iE3 == this.f6835b);
                this.f6837d = iE3;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                l3.b(this.f6834a.x());
            } while (this.f6834a.e() < iE2);
        } else {
            int iB2 = B0.b(this.f6835b);
            if (iB2 == 0) {
                do {
                    list.add(Long.valueOf(this.f6834a.x()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB2 != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                list.add(Long.valueOf(this.f6834a.x()));
            } while (this.f6834a.e() < iE2);
        }
        W(iE2);
    }

    @Override // com.google.protobuf.l0
    public void D(List list) throws D {
        int iE;
        int iE2;
        if (!(list instanceof L)) {
            int iB = B0.b(this.f6835b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f6834a.z()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            int iF = this.f6834a.F();
            Z(iF);
            int iE3 = this.f6834a.e() + iF;
            do {
                list.add(Long.valueOf(this.f6834a.z()));
            } while (this.f6834a.e() < iE3);
            return;
        }
        L l3 = (L) list;
        int iB2 = B0.b(this.f6835b);
        if (iB2 == 1) {
            do {
                l3.b(this.f6834a.z());
                if (this.f6834a.f()) {
                    return;
                } else {
                    iE2 = this.f6834a.E();
                }
            } while (iE2 == this.f6835b);
            this.f6837d = iE2;
            return;
        }
        if (iB2 != 2) {
            throw D.e();
        }
        int iF2 = this.f6834a.F();
        Z(iF2);
        int iE4 = this.f6834a.e() + iF2;
        do {
            l3.b(this.f6834a.z());
        } while (this.f6834a.e() < iE4);
    }

    @Override // com.google.protobuf.l0
    public long E() throws D.a {
        X(0);
        return this.f6834a.x();
    }

    @Override // com.google.protobuf.l0
    public String F() throws D.a {
        X(2);
        return this.f6834a.D();
    }

    @Override // com.google.protobuf.l0
    public void G(List list) throws D {
        int iE;
        int iE2;
        if (!(list instanceof L)) {
            int iB = B0.b(this.f6835b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f6834a.u()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            int iF = this.f6834a.F();
            Z(iF);
            int iE3 = this.f6834a.e() + iF;
            do {
                list.add(Long.valueOf(this.f6834a.u()));
            } while (this.f6834a.e() < iE3);
            return;
        }
        L l3 = (L) list;
        int iB2 = B0.b(this.f6835b);
        if (iB2 == 1) {
            do {
                l3.b(this.f6834a.u());
                if (this.f6834a.f()) {
                    return;
                } else {
                    iE2 = this.f6834a.E();
                }
            } while (iE2 == this.f6835b);
            this.f6837d = iE2;
            return;
        }
        if (iB2 != 2) {
            throw D.e();
        }
        int iF2 = this.f6834a.F();
        Z(iF2);
        int iE4 = this.f6834a.e() + iF2;
        do {
            l3.b(this.f6834a.u());
        } while (this.f6834a.e() < iE4);
    }

    @Override // com.google.protobuf.l0
    public void H(List list) throws D {
        int iE;
        int iE2;
        int iE3;
        if (list instanceof B) {
            B b3 = (B) list;
            int iB = B0.b(this.f6835b);
            if (iB == 0) {
                do {
                    b3.f(this.f6834a.w());
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE3 = this.f6834a.E();
                    }
                } while (iE3 == this.f6835b);
                this.f6837d = iE3;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                b3.f(this.f6834a.w());
            } while (this.f6834a.e() < iE2);
        } else {
            int iB2 = B0.b(this.f6835b);
            if (iB2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6834a.w()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB2 != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                list.add(Integer.valueOf(this.f6834a.w()));
            } while (this.f6834a.e() < iE2);
        }
        W(iE2);
    }

    @Override // com.google.protobuf.l0
    public void I(List list) throws D {
        int iE;
        int iE2;
        int iE3;
        if (list instanceof B) {
            B b3 = (B) list;
            int iB = B0.b(this.f6835b);
            if (iB == 0) {
                do {
                    b3.f(this.f6834a.s());
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE3 = this.f6834a.E();
                    }
                } while (iE3 == this.f6835b);
                this.f6837d = iE3;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                b3.f(this.f6834a.s());
            } while (this.f6834a.e() < iE2);
        } else {
            int iB2 = B0.b(this.f6835b);
            if (iB2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6834a.s()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB2 != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                list.add(Integer.valueOf(this.f6834a.s()));
            } while (this.f6834a.e() < iE2);
        }
        W(iE2);
    }

    @Override // com.google.protobuf.l0
    public void J(List list, n0 n0Var, C0799q c0799q) throws D.a {
        int iE;
        if (B0.b(this.f6835b) != 3) {
            throw D.e();
        }
        int i3 = this.f6835b;
        do {
            list.add(S(n0Var, c0799q));
            if (this.f6834a.f() || this.f6837d != 0) {
                return;
            } else {
                iE = this.f6834a.E();
            }
        } while (iE == i3);
        this.f6837d = iE;
    }

    @Override // com.google.protobuf.l0
    public void K(Object obj, n0 n0Var, C0799q c0799q) throws D.a {
        X(3);
        P(obj, n0Var, c0799q);
    }

    @Override // com.google.protobuf.l0
    public void L(List list, n0 n0Var, C0799q c0799q) throws D.a {
        int iE;
        if (B0.b(this.f6835b) != 2) {
            throw D.e();
        }
        int i3 = this.f6835b;
        do {
            list.add(T(n0Var, c0799q));
            if (this.f6834a.f() || this.f6837d != 0) {
                return;
            } else {
                iE = this.f6834a.E();
            }
        } while (iE == i3);
        this.f6837d = iE;
    }

    @Override // com.google.protobuf.l0
    public void M(Object obj, n0 n0Var, C0799q c0799q) throws D {
        X(2);
        Q(obj, n0Var, c0799q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f6834a.n(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // com.google.protobuf.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N(java.util.Map r8, com.google.protobuf.N.a r9, com.google.protobuf.C0799q r10) throws com.google.protobuf.D.a {
        /*
            r7 = this;
            r0 = 2
            r7.X(r0)
            com.google.protobuf.j r1 = r7.f6834a
            int r1 = r1.F()
            com.google.protobuf.j r2 = r7.f6834a
            int r1 = r2.o(r1)
            java.lang.Object r2 = r9.f6714b
            java.lang.Object r3 = r9.f6716d
        L14:
            int r4 = r7.p()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.j r5 = r7.f6834a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.y()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.D r4 = new com.google.protobuf.D     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.B0$b r4 = r9.f6715c     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
            java.lang.Object r5 = r9.f6716d     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
            goto L14
        L49:
            com.google.protobuf.B0$b r4 = r9.f6713a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.D.a -> L51
            goto L14
        L51:
            boolean r4 = r7.y()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.D r8 = new com.google.protobuf.D     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.j r8 = r7.f6834a
            r8.n(r1)
            return
        L67:
            com.google.protobuf.j r9 = r7.f6834a
            r9.n(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0793k.N(java.util.Map, com.google.protobuf.N$a, com.google.protobuf.q):void");
    }

    public Object U(Class cls, C0799q c0799q) throws D.a {
        X(2);
        return T(i0.a().c(cls), c0799q);
    }

    public void V(List list, boolean z2) throws D.a {
        int iE;
        int iE2;
        if (B0.b(this.f6835b) != 2) {
            throw D.e();
        }
        if (!(list instanceof J) || z2) {
            do {
                list.add(z2 ? F() : m());
                if (this.f6834a.f()) {
                    return;
                } else {
                    iE = this.f6834a.E();
                }
            } while (iE == this.f6835b);
            this.f6837d = iE;
            return;
        }
        J j3 = (J) list;
        do {
            j3.h(u());
            if (this.f6834a.f()) {
                return;
            } else {
                iE2 = this.f6834a.E();
            }
        } while (iE2 == this.f6835b);
        this.f6837d = iE2;
    }

    @Override // com.google.protobuf.l0
    public void a(List list) throws D {
        int iE;
        int iE2;
        int iE3;
        if (list instanceof B) {
            B b3 = (B) list;
            int iB = B0.b(this.f6835b);
            if (iB == 0) {
                do {
                    b3.f(this.f6834a.A());
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE3 = this.f6834a.E();
                    }
                } while (iE3 == this.f6835b);
                this.f6837d = iE3;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                b3.f(this.f6834a.A());
            } while (this.f6834a.e() < iE2);
        } else {
            int iB2 = B0.b(this.f6835b);
            if (iB2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6834a.A()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB2 != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                list.add(Integer.valueOf(this.f6834a.A()));
            } while (this.f6834a.e() < iE2);
        }
        W(iE2);
    }

    @Override // com.google.protobuf.l0
    public int b() throws D.a {
        X(0);
        return this.f6834a.s();
    }

    @Override // com.google.protobuf.l0
    public int c() {
        return this.f6835b;
    }

    @Override // com.google.protobuf.l0
    public long d() throws D.a {
        X(0);
        return this.f6834a.G();
    }

    @Override // com.google.protobuf.l0
    public void e(List list) throws D {
        int iE;
        int iE2;
        if (!(list instanceof B)) {
            int iB = B0.b(this.f6835b);
            if (iB == 2) {
                int iF = this.f6834a.F();
                Y(iF);
                int iE3 = this.f6834a.e() + iF;
                do {
                    list.add(Integer.valueOf(this.f6834a.t()));
                } while (this.f6834a.e() < iE3);
                return;
            }
            if (iB != 5) {
                throw D.e();
            }
            do {
                list.add(Integer.valueOf(this.f6834a.t()));
                if (this.f6834a.f()) {
                    return;
                } else {
                    iE = this.f6834a.E();
                }
            } while (iE == this.f6835b);
            this.f6837d = iE;
            return;
        }
        B b3 = (B) list;
        int iB2 = B0.b(this.f6835b);
        if (iB2 == 2) {
            int iF2 = this.f6834a.F();
            Y(iF2);
            int iE4 = this.f6834a.e() + iF2;
            do {
                b3.f(this.f6834a.t());
            } while (this.f6834a.e() < iE4);
            return;
        }
        if (iB2 != 5) {
            throw D.e();
        }
        do {
            b3.f(this.f6834a.t());
            if (this.f6834a.f()) {
                return;
            } else {
                iE2 = this.f6834a.E();
            }
        } while (iE2 == this.f6835b);
        this.f6837d = iE2;
    }

    @Override // com.google.protobuf.l0
    public long f() throws D.a {
        X(1);
        return this.f6834a.u();
    }

    @Override // com.google.protobuf.l0
    public void g(List list) throws D {
        int iE;
        int iE2;
        if (!(list instanceof B)) {
            int iB = B0.b(this.f6835b);
            if (iB == 2) {
                int iF = this.f6834a.F();
                Y(iF);
                int iE3 = this.f6834a.e() + iF;
                do {
                    list.add(Integer.valueOf(this.f6834a.y()));
                } while (this.f6834a.e() < iE3);
                return;
            }
            if (iB != 5) {
                throw D.e();
            }
            do {
                list.add(Integer.valueOf(this.f6834a.y()));
                if (this.f6834a.f()) {
                    return;
                } else {
                    iE = this.f6834a.E();
                }
            } while (iE == this.f6835b);
            this.f6837d = iE;
            return;
        }
        B b3 = (B) list;
        int iB2 = B0.b(this.f6835b);
        if (iB2 == 2) {
            int iF2 = this.f6834a.F();
            Y(iF2);
            int iE4 = this.f6834a.e() + iF2;
            do {
                b3.f(this.f6834a.y());
            } while (this.f6834a.e() < iE4);
            return;
        }
        if (iB2 != 5) {
            throw D.e();
        }
        do {
            b3.f(this.f6834a.y());
            if (this.f6834a.f()) {
                return;
            } else {
                iE2 = this.f6834a.E();
            }
        } while (iE2 == this.f6835b);
        this.f6837d = iE2;
    }

    @Override // com.google.protobuf.l0
    public int h() throws D.a {
        X(0);
        return this.f6834a.A();
    }

    @Override // com.google.protobuf.l0
    public void i(List list) throws D {
        int iE;
        int iE2;
        int iE3;
        if (list instanceof L) {
            L l3 = (L) list;
            int iB = B0.b(this.f6835b);
            if (iB == 0) {
                do {
                    l3.b(this.f6834a.B());
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE3 = this.f6834a.E();
                    }
                } while (iE3 == this.f6835b);
                this.f6837d = iE3;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                l3.b(this.f6834a.B());
            } while (this.f6834a.e() < iE2);
        } else {
            int iB2 = B0.b(this.f6835b);
            if (iB2 == 0) {
                do {
                    list.add(Long.valueOf(this.f6834a.B()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB2 != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                list.add(Long.valueOf(this.f6834a.B()));
            } while (this.f6834a.e() < iE2);
        }
        W(iE2);
    }

    @Override // com.google.protobuf.l0
    public long j() throws D.a {
        X(0);
        return this.f6834a.B();
    }

    @Override // com.google.protobuf.l0
    public void k(List list) throws D {
        int iE;
        int iE2;
        int iE3;
        if (list instanceof B) {
            B b3 = (B) list;
            int iB = B0.b(this.f6835b);
            if (iB == 0) {
                do {
                    b3.f(this.f6834a.F());
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE3 = this.f6834a.E();
                    }
                } while (iE3 == this.f6835b);
                this.f6837d = iE3;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                b3.f(this.f6834a.F());
            } while (this.f6834a.e() < iE2);
        } else {
            int iB2 = B0.b(this.f6835b);
            if (iB2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6834a.F()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB2 != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                list.add(Integer.valueOf(this.f6834a.F()));
            } while (this.f6834a.e() < iE2);
        }
        W(iE2);
    }

    @Override // com.google.protobuf.l0
    public void l(List list) throws D {
        int iE;
        int iE2;
        int iE3;
        if (list instanceof AbstractC0789g) {
            AbstractC0789g abstractC0789g = (AbstractC0789g) list;
            int iB = B0.b(this.f6835b);
            if (iB == 0) {
                do {
                    abstractC0789g.b(this.f6834a.p());
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE3 = this.f6834a.E();
                    }
                } while (iE3 == this.f6835b);
                this.f6837d = iE3;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                abstractC0789g.b(this.f6834a.p());
            } while (this.f6834a.e() < iE2);
        } else {
            int iB2 = B0.b(this.f6835b);
            if (iB2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f6834a.p()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB2 != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                list.add(Boolean.valueOf(this.f6834a.p()));
            } while (this.f6834a.e() < iE2);
        }
        W(iE2);
    }

    @Override // com.google.protobuf.l0
    public String m() throws D.a {
        X(2);
        return this.f6834a.C();
    }

    @Override // com.google.protobuf.l0
    public int n() throws D.a {
        X(5);
        return this.f6834a.t();
    }

    @Override // com.google.protobuf.l0
    public boolean o() throws D.a {
        X(0);
        return this.f6834a.p();
    }

    @Override // com.google.protobuf.l0
    public int p() {
        int i3 = this.f6837d;
        if (i3 != 0) {
            this.f6835b = i3;
            this.f6837d = 0;
        } else {
            this.f6835b = this.f6834a.E();
        }
        int i4 = this.f6835b;
        return (i4 == 0 || i4 == this.f6836c) ? a.e.API_PRIORITY_OTHER : B0.a(i4);
    }

    @Override // com.google.protobuf.l0
    public void q(List list) throws D.a {
        V(list, false);
    }

    @Override // com.google.protobuf.l0
    public long r() throws D.a {
        X(1);
        return this.f6834a.z();
    }

    @Override // com.google.protobuf.l0
    public double readDouble() throws D.a {
        X(1);
        return this.f6834a.r();
    }

    @Override // com.google.protobuf.l0
    public float readFloat() throws D.a {
        X(5);
        return this.f6834a.v();
    }

    @Override // com.google.protobuf.l0
    public void s(List list) throws D {
        int iE;
        int iE2;
        int iE3;
        if (list instanceof L) {
            L l3 = (L) list;
            int iB = B0.b(this.f6835b);
            if (iB == 0) {
                do {
                    l3.b(this.f6834a.G());
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE3 = this.f6834a.E();
                    }
                } while (iE3 == this.f6835b);
                this.f6837d = iE3;
                return;
            }
            if (iB != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                l3.b(this.f6834a.G());
            } while (this.f6834a.e() < iE2);
        } else {
            int iB2 = B0.b(this.f6835b);
            if (iB2 == 0) {
                do {
                    list.add(Long.valueOf(this.f6834a.G()));
                    if (this.f6834a.f()) {
                        return;
                    } else {
                        iE = this.f6834a.E();
                    }
                } while (iE == this.f6835b);
                this.f6837d = iE;
                return;
            }
            if (iB2 != 2) {
                throw D.e();
            }
            iE2 = this.f6834a.e() + this.f6834a.F();
            do {
                list.add(Long.valueOf(this.f6834a.G()));
            } while (this.f6834a.e() < iE2);
        }
        W(iE2);
    }

    @Override // com.google.protobuf.l0
    public void t(List list) throws D.a {
        V(list, true);
    }

    @Override // com.google.protobuf.l0
    public AbstractC0791i u() throws D.a {
        X(2);
        return this.f6834a.q();
    }

    @Override // com.google.protobuf.l0
    public void v(List list) throws D {
        int iE;
        int iE2;
        if (!(list instanceof AbstractC0804w)) {
            int iB = B0.b(this.f6835b);
            if (iB == 2) {
                int iF = this.f6834a.F();
                Y(iF);
                int iE3 = this.f6834a.e() + iF;
                do {
                    list.add(Float.valueOf(this.f6834a.v()));
                } while (this.f6834a.e() < iE3);
                return;
            }
            if (iB != 5) {
                throw D.e();
            }
            do {
                list.add(Float.valueOf(this.f6834a.v()));
                if (this.f6834a.f()) {
                    return;
                } else {
                    iE = this.f6834a.E();
                }
            } while (iE == this.f6835b);
            this.f6837d = iE;
            return;
        }
        AbstractC0804w abstractC0804w = (AbstractC0804w) list;
        int iB2 = B0.b(this.f6835b);
        if (iB2 == 2) {
            int iF2 = this.f6834a.F();
            Y(iF2);
            int iE4 = this.f6834a.e() + iF2;
            do {
                abstractC0804w.b(this.f6834a.v());
            } while (this.f6834a.e() < iE4);
            return;
        }
        if (iB2 != 5) {
            throw D.e();
        }
        do {
            abstractC0804w.b(this.f6834a.v());
            if (this.f6834a.f()) {
                return;
            } else {
                iE2 = this.f6834a.E();
            }
        } while (iE2 == this.f6835b);
        this.f6837d = iE2;
    }

    @Override // com.google.protobuf.l0
    public int w() throws D.a {
        X(0);
        return this.f6834a.F();
    }

    @Override // com.google.protobuf.l0
    public int x() throws D.a {
        X(0);
        return this.f6834a.w();
    }

    @Override // com.google.protobuf.l0
    public boolean y() {
        int i3;
        if (this.f6834a.f() || (i3 = this.f6835b) == this.f6836c) {
            return false;
        }
        return this.f6834a.J(i3);
    }

    @Override // com.google.protobuf.l0
    public int z() throws D.a {
        X(5);
        return this.f6834a.y();
    }
}
