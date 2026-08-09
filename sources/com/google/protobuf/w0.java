package com.google.protobuf;

import com.google.protobuf.C0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final w0 f6980f = new w0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f6982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f6983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6985e;

    private w0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i3) {
        int[] iArr = this.f6982b;
        if (i3 > iArr.length) {
            int i4 = this.f6981a;
            int i5 = i4 + (i4 / 2);
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f6982b = Arrays.copyOf(iArr, i3);
            this.f6983c = Arrays.copyOf(this.f6983c, i3);
        }
    }

    public static w0 c() {
        return f6980f;
    }

    private static int f(int[] iArr, int i3) {
        int i4 = 17;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        return i4;
    }

    private static int g(Object[] objArr, int i3) {
        int iHashCode = 17;
        for (int i4 = 0; i4 < i3; i4++) {
            iHashCode = (iHashCode * 31) + objArr[i4].hashCode();
        }
        return iHashCode;
    }

    static w0 j(w0 w0Var, w0 w0Var2) {
        int i3 = w0Var.f6981a + w0Var2.f6981a;
        int[] iArrCopyOf = Arrays.copyOf(w0Var.f6982b, i3);
        System.arraycopy(w0Var2.f6982b, 0, iArrCopyOf, w0Var.f6981a, w0Var2.f6981a);
        Object[] objArrCopyOf = Arrays.copyOf(w0Var.f6983c, i3);
        System.arraycopy(w0Var2.f6983c, 0, objArrCopyOf, w0Var.f6981a, w0Var2.f6981a);
        return new w0(i3, iArrCopyOf, objArrCopyOf, true);
    }

    static w0 k() {
        return new w0();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (!objArr[i4].equals(objArr2[i4])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i3, Object obj, C0 c02) {
        int iA = B0.a(i3);
        int iB = B0.b(i3);
        if (iB == 0) {
            c02.c(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            c02.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            c02.M(iA, (AbstractC0791i) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(D.e());
            }
            c02.l(iA, ((Integer) obj).intValue());
        } else if (c02.v() == C0.a.ASCENDING) {
            c02.h(iA);
            ((w0) obj).r(c02);
            c02.z(iA);
        } else {
            c02.z(iA);
            ((w0) obj).r(c02);
            c02.h(iA);
        }
    }

    void a() {
        if (!this.f6985e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iT;
        int i3 = this.f6984d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f6981a; i5++) {
            int i6 = this.f6982b[i5];
            int iA = B0.a(i6);
            int iB = B0.b(i6);
            if (iB == 0) {
                iT = AbstractC0794l.T(iA, ((Long) this.f6983c[i5]).longValue());
            } else if (iB == 1) {
                iT = AbstractC0794l.p(iA, ((Long) this.f6983c[i5]).longValue());
            } else if (iB == 2) {
                iT = AbstractC0794l.h(iA, (AbstractC0791i) this.f6983c[i5]);
            } else if (iB == 3) {
                iT = (AbstractC0794l.Q(iA) * 2) + ((w0) this.f6983c[i5]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(D.e());
                }
                iT = AbstractC0794l.n(iA, ((Integer) this.f6983c[i5]).intValue());
            }
            i4 += iT;
        }
        this.f6984d = i4;
        return i4;
    }

    public int e() {
        int i3 = this.f6984d;
        if (i3 != -1) {
            return i3;
        }
        int iF = 0;
        for (int i4 = 0; i4 < this.f6981a; i4++) {
            iF += AbstractC0794l.F(B0.a(this.f6982b[i4]), (AbstractC0791i) this.f6983c[i4]);
        }
        this.f6984d = iF;
        return iF;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        int i3 = this.f6981a;
        return i3 == w0Var.f6981a && o(this.f6982b, w0Var.f6982b, i3) && l(this.f6983c, w0Var.f6983c, this.f6981a);
    }

    public void h() {
        if (this.f6985e) {
            this.f6985e = false;
        }
    }

    public int hashCode() {
        int i3 = this.f6981a;
        return ((((527 + i3) * 31) + f(this.f6982b, i3)) * 31) + g(this.f6983c, this.f6981a);
    }

    w0 i(w0 w0Var) {
        if (w0Var.equals(c())) {
            return this;
        }
        a();
        int i3 = this.f6981a + w0Var.f6981a;
        b(i3);
        System.arraycopy(w0Var.f6982b, 0, this.f6982b, this.f6981a, w0Var.f6981a);
        System.arraycopy(w0Var.f6983c, 0, this.f6983c, this.f6981a, w0Var.f6981a);
        this.f6981a = i3;
        return this;
    }

    final void m(StringBuilder sb, int i3) {
        for (int i4 = 0; i4 < this.f6981a; i4++) {
            X.d(sb, i3, String.valueOf(B0.a(this.f6982b[i4])), this.f6983c[i4]);
        }
    }

    void n(int i3, Object obj) {
        a();
        b(this.f6981a + 1);
        int[] iArr = this.f6982b;
        int i4 = this.f6981a;
        iArr[i4] = i3;
        this.f6983c[i4] = obj;
        this.f6981a = i4 + 1;
    }

    void p(C0 c02) {
        if (c02.v() == C0.a.DESCENDING) {
            for (int i3 = this.f6981a - 1; i3 >= 0; i3--) {
                c02.f(B0.a(this.f6982b[i3]), this.f6983c[i3]);
            }
            return;
        }
        for (int i4 = 0; i4 < this.f6981a; i4++) {
            c02.f(B0.a(this.f6982b[i4]), this.f6983c[i4]);
        }
    }

    public void r(C0 c02) {
        if (this.f6981a == 0) {
            return;
        }
        if (c02.v() == C0.a.ASCENDING) {
            for (int i3 = 0; i3 < this.f6981a; i3++) {
                q(this.f6982b[i3], this.f6983c[i3], c02);
            }
            return;
        }
        for (int i4 = this.f6981a - 1; i4 >= 0; i4--) {
            q(this.f6982b[i4], this.f6983c[i4], c02);
        }
    }

    private w0(int i3, int[] iArr, Object[] objArr, boolean z2) {
        this.f6984d = -1;
        this.f6981a = i3;
        this.f6982b = iArr;
        this.f6983c = objArr;
        this.f6985e = z2;
    }
}
