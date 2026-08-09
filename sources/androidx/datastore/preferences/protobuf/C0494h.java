package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0507v;
import androidx.datastore.preferences.protobuf.k0;
import com.google.android.gms.common.api.a;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0494h implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0493g f4106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4109d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4110a;

        static {
            int[] iArr = new int[k0.b.values().length];
            f4110a = iArr;
            try {
                iArr[k0.b.f4158o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4110a[k0.b.f4162s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4110a[k0.b.f4151c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4110a[k0.b.f4164u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4110a[k0.b.f4157n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4110a[k0.b.f4156m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4110a[k0.b.f4152d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4110a[k0.b.f4155l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4110a[k0.b.f4153e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4110a[k0.b.f4161r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4110a[k0.b.f4165v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4110a[k0.b.f4166w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4110a[k0.b.f4167x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4110a[k0.b.f4168y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4110a[k0.b.f4159p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4110a[k0.b.f4163t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4110a[k0.b.f4154f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C0494h(AbstractC0493g abstractC0493g) {
        AbstractC0493g abstractC0493g2 = (AbstractC0493g) AbstractC0506u.b(abstractC0493g, "input");
        this.f4106a = abstractC0493g2;
        abstractC0493g2.f4081d = this;
    }

    public static C0494h O(AbstractC0493g abstractC0493g) {
        C0494h c0494h = abstractC0493g.f4081d;
        return c0494h != null ? c0494h : new C0494h(abstractC0493g);
    }

    private void P(Object obj, Y y2, C0499m c0499m) {
        int i3 = this.f4108c;
        this.f4108c = k0.c(k0.a(this.f4107b), 4);
        try {
            y2.h(obj, this, c0499m);
            if (this.f4107b == this.f4108c) {
            } else {
                throw C0507v.h();
            }
        } finally {
            this.f4108c = i3;
        }
    }

    private void Q(Object obj, Y y2, C0499m c0499m) throws C0507v {
        int iD = this.f4106a.D();
        AbstractC0493g abstractC0493g = this.f4106a;
        if (abstractC0493g.f4078a >= abstractC0493g.f4079b) {
            throw C0507v.i();
        }
        int iM = abstractC0493g.m(iD);
        this.f4106a.f4078a++;
        y2.h(obj, this, c0499m);
        this.f4106a.a(0);
        r5.f4078a--;
        this.f4106a.l(iM);
    }

    private Object R(k0.b bVar, Class cls, C0499m c0499m) {
        switch (a.f4110a[bVar.ordinal()]) {
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
                return U(cls, c0499m);
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

    private Object S(Y y2, C0499m c0499m) {
        Object objF = y2.f();
        P(objF, y2, c0499m);
        y2.b(objF);
        return objF;
    }

    private Object T(Y y2, C0499m c0499m) throws C0507v {
        Object objF = y2.f();
        Q(objF, y2, c0499m);
        y2.b(objF);
        return objF;
    }

    private void W(int i3) throws C0507v {
        if (this.f4106a.e() != i3) {
            throw C0507v.m();
        }
    }

    private void X(int i3) throws C0507v.a {
        if (k0.b(this.f4107b) != i3) {
            throw C0507v.e();
        }
    }

    private void Y(int i3) throws C0507v {
        if ((i3 & 3) != 0) {
            throw C0507v.h();
        }
    }

    private void Z(int i3) throws C0507v {
        if ((i3 & 7) != 0) {
            throw C0507v.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void A(List list) throws C0507v.a {
        int iC;
        if (k0.b(this.f4107b) != 2) {
            throw C0507v.e();
        }
        do {
            list.add(u());
            if (this.f4106a.f()) {
                return;
            } else {
                iC = this.f4106a.C();
            }
        } while (iC == this.f4107b);
        this.f4109d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void B(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 1) {
            do {
                list.add(Double.valueOf(this.f4106a.p()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iD = this.f4106a.D();
        Z(iD);
        int iE = this.f4106a.e() + iD;
        do {
            list.add(Double.valueOf(this.f4106a.p()));
        } while (this.f4106a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void C(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f4106a.v()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iE = this.f4106a.e() + this.f4106a.D();
        do {
            list.add(Long.valueOf(this.f4106a.v()));
        } while (this.f4106a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void D(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f4106a.x()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iD = this.f4106a.D();
        Z(iD);
        int iE = this.f4106a.e() + iD;
        do {
            list.add(Long.valueOf(this.f4106a.x()));
        } while (this.f4106a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long E() throws C0507v.a {
        X(0);
        return this.f4106a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String F() throws C0507v.a {
        X(2);
        return this.f4106a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void G(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f4106a.s()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iD = this.f4106a.D();
        Z(iD);
        int iE = this.f4106a.e() + iD;
        do {
            list.add(Long.valueOf(this.f4106a.s()));
        } while (this.f4106a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void H(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f4106a.u()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iE = this.f4106a.e() + this.f4106a.D();
        do {
            list.add(Integer.valueOf(this.f4106a.u()));
        } while (this.f4106a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void I(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f4106a.q()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iE = this.f4106a.e() + this.f4106a.D();
        do {
            list.add(Integer.valueOf(this.f4106a.q()));
        } while (this.f4106a.e() < iE);
        W(iE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f4106a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J(java.util.Map r8, androidx.datastore.preferences.protobuf.C.a r9, androidx.datastore.preferences.protobuf.C0499m r10) throws androidx.datastore.preferences.protobuf.C0507v.a {
        /*
            r7 = this;
            r0 = 2
            r7.X(r0)
            androidx.datastore.preferences.protobuf.g r1 = r7.f4106a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.g r2 = r7.f4106a
            int r1 = r2.m(r1)
            java.lang.Object r2 = r9.f3990b
            java.lang.Object r3 = r9.f3992d
        L14:
            int r4 = r7.p()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.g r5 = r7.f4106a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.y()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.v r4 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.k0$b r4 = r9.f3991c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
            java.lang.Object r5 = r9.f3992d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.k0$b r4 = r9.f3989a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0507v.a -> L51
            goto L14
        L51:
            boolean r4 = r7.y()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.v r8 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.g r8 = r7.f4106a
            r8.l(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.g r9 = r7.f4106a
            r9.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0494h.J(java.util.Map, androidx.datastore.preferences.protobuf.C$a, androidx.datastore.preferences.protobuf.m):void");
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void K(Object obj, Y y2, C0499m c0499m) throws C0507v.a {
        X(3);
        P(obj, y2, c0499m);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void L(List list, Y y2, C0499m c0499m) throws C0507v.a {
        int iC;
        if (k0.b(this.f4107b) != 3) {
            throw C0507v.e();
        }
        int i3 = this.f4107b;
        do {
            list.add(S(y2, c0499m));
            if (this.f4106a.f() || this.f4109d != 0) {
                return;
            } else {
                iC = this.f4106a.C();
            }
        } while (iC == i3);
        this.f4109d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void M(List list, Y y2, C0499m c0499m) throws C0507v.a {
        int iC;
        if (k0.b(this.f4107b) != 2) {
            throw C0507v.e();
        }
        int i3 = this.f4107b;
        do {
            list.add(T(y2, c0499m));
            if (this.f4106a.f() || this.f4109d != 0) {
                return;
            } else {
                iC = this.f4106a.C();
            }
        } while (iC == i3);
        this.f4109d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void N(Object obj, Y y2, C0499m c0499m) throws C0507v {
        X(2);
        Q(obj, y2, c0499m);
    }

    public Object U(Class cls, C0499m c0499m) throws C0507v.a {
        X(2);
        return T(U.a().c(cls), c0499m);
    }

    public void V(List list, boolean z2) throws C0507v.a {
        int iC;
        if (k0.b(this.f4107b) != 2) {
            throw C0507v.e();
        }
        do {
            list.add(z2 ? F() : m());
            if (this.f4106a.f()) {
                return;
            } else {
                iC = this.f4106a.C();
            }
        } while (iC == this.f4107b);
        this.f4109d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void a(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f4106a.y()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iE = this.f4106a.e() + this.f4106a.D();
        do {
            list.add(Integer.valueOf(this.f4106a.y()));
        } while (this.f4106a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int b() throws C0507v.a {
        X(0);
        return this.f4106a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int c() {
        return this.f4107b;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long d() throws C0507v.a {
        X(0);
        return this.f4106a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void e(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 2) {
            int iD = this.f4106a.D();
            Y(iD);
            int iE = this.f4106a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f4106a.r()));
            } while (this.f4106a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C0507v.e();
        }
        do {
            list.add(Integer.valueOf(this.f4106a.r()));
            if (this.f4106a.f()) {
                return;
            } else {
                iC = this.f4106a.C();
            }
        } while (iC == this.f4107b);
        this.f4109d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long f() throws C0507v.a {
        X(1);
        return this.f4106a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void g(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 2) {
            int iD = this.f4106a.D();
            Y(iD);
            int iE = this.f4106a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f4106a.w()));
            } while (this.f4106a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C0507v.e();
        }
        do {
            list.add(Integer.valueOf(this.f4106a.w()));
            if (this.f4106a.f()) {
                return;
            } else {
                iC = this.f4106a.C();
            }
        } while (iC == this.f4107b);
        this.f4109d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int h() throws C0507v.a {
        X(0);
        return this.f4106a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void i(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f4106a.z()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iE = this.f4106a.e() + this.f4106a.D();
        do {
            list.add(Long.valueOf(this.f4106a.z()));
        } while (this.f4106a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long j() throws C0507v.a {
        X(0);
        return this.f4106a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void k(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f4106a.D()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iE = this.f4106a.e() + this.f4106a.D();
        do {
            list.add(Integer.valueOf(this.f4106a.D()));
        } while (this.f4106a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void l(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 0) {
            do {
                list.add(Boolean.valueOf(this.f4106a.n()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iE = this.f4106a.e() + this.f4106a.D();
        do {
            list.add(Boolean.valueOf(this.f4106a.n()));
        } while (this.f4106a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String m() throws C0507v.a {
        X(2);
        return this.f4106a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int n() throws C0507v.a {
        X(5);
        return this.f4106a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean o() throws C0507v.a {
        X(0);
        return this.f4106a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int p() {
        int i3 = this.f4109d;
        if (i3 != 0) {
            this.f4107b = i3;
            this.f4109d = 0;
        } else {
            this.f4107b = this.f4106a.C();
        }
        int i4 = this.f4107b;
        return (i4 == 0 || i4 == this.f4108c) ? a.e.API_PRIORITY_OTHER : k0.a(i4);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void q(List list) throws C0507v.a {
        V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long r() throws C0507v.a {
        X(1);
        return this.f4106a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public double readDouble() throws C0507v.a {
        X(1);
        return this.f4106a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public float readFloat() throws C0507v.a {
        X(5);
        return this.f4106a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void s(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f4106a.E()));
                if (this.f4106a.f()) {
                    return;
                } else {
                    iC = this.f4106a.C();
                }
            } while (iC == this.f4107b);
            this.f4109d = iC;
            return;
        }
        if (iB != 2) {
            throw C0507v.e();
        }
        int iE = this.f4106a.e() + this.f4106a.D();
        do {
            list.add(Long.valueOf(this.f4106a.E()));
        } while (this.f4106a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void t(List list) throws C0507v.a {
        V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public AbstractC0492f u() throws C0507v.a {
        X(2);
        return this.f4106a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void v(List list) throws C0507v {
        int iC;
        int iB = k0.b(this.f4107b);
        if (iB == 2) {
            int iD = this.f4106a.D();
            Y(iD);
            int iE = this.f4106a.e() + iD;
            do {
                list.add(Float.valueOf(this.f4106a.t()));
            } while (this.f4106a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C0507v.e();
        }
        do {
            list.add(Float.valueOf(this.f4106a.t()));
            if (this.f4106a.f()) {
                return;
            } else {
                iC = this.f4106a.C();
            }
        } while (iC == this.f4107b);
        this.f4109d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int w() throws C0507v.a {
        X(0);
        return this.f4106a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int x() throws C0507v.a {
        X(0);
        return this.f4106a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean y() {
        int i3;
        if (this.f4106a.f() || (i3 = this.f4107b) == this.f4108c) {
            return false;
        }
        return this.f4106a.F(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int z() throws C0507v.a {
        X(5);
        return this.f4106a.w();
    }
}
