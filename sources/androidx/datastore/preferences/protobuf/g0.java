package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g0 f4100f = new g0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f4102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f4103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4105e;

    private g0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i3) {
        int[] iArr = this.f4102b;
        if (i3 > iArr.length) {
            int i4 = this.f4101a;
            int i5 = i4 + (i4 / 2);
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f4102b = Arrays.copyOf(iArr, i3);
            this.f4103c = Arrays.copyOf(this.f4103c, i3);
        }
    }

    public static g0 c() {
        return f4100f;
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

    static g0 j(g0 g0Var, g0 g0Var2) {
        int i3 = g0Var.f4101a + g0Var2.f4101a;
        int[] iArrCopyOf = Arrays.copyOf(g0Var.f4102b, i3);
        System.arraycopy(g0Var2.f4102b, 0, iArrCopyOf, g0Var.f4101a, g0Var2.f4101a);
        Object[] objArrCopyOf = Arrays.copyOf(g0Var.f4103c, i3);
        System.arraycopy(g0Var2.f4103c, 0, objArrCopyOf, g0Var.f4101a, g0Var2.f4101a);
        return new g0(i3, iArrCopyOf, objArrCopyOf, true);
    }

    static g0 k() {
        return new g0();
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

    private static void q(int i3, Object obj, l0 l0Var) {
        int iA = k0.a(i3);
        int iB = k0.b(i3);
        if (iB == 0) {
            l0Var.c(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            l0Var.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            l0Var.J(iA, (AbstractC0492f) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(C0507v.e());
            }
            l0Var.l(iA, ((Integer) obj).intValue());
        } else if (l0Var.v() == l0.a.ASCENDING) {
            l0Var.h(iA);
            ((g0) obj).r(l0Var);
            l0Var.z(iA);
        } else {
            l0Var.z(iA);
            ((g0) obj).r(l0Var);
            l0Var.h(iA);
        }
    }

    void a() {
        if (!this.f4105e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iR;
        int i3 = this.f4104d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f4101a; i5++) {
            int i6 = this.f4102b[i5];
            int iA = k0.a(i6);
            int iB = k0.b(i6);
            if (iB == 0) {
                iR = AbstractC0495i.R(iA, ((Long) this.f4103c[i5]).longValue());
            } else if (iB == 1) {
                iR = AbstractC0495i.n(iA, ((Long) this.f4103c[i5]).longValue());
            } else if (iB == 2) {
                iR = AbstractC0495i.f(iA, (AbstractC0492f) this.f4103c[i5]);
            } else if (iB == 3) {
                iR = (AbstractC0495i.O(iA) * 2) + ((g0) this.f4103c[i5]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(C0507v.e());
                }
                iR = AbstractC0495i.l(iA, ((Integer) this.f4103c[i5]).intValue());
            }
            i4 += iR;
        }
        this.f4104d = i4;
        return i4;
    }

    public int e() {
        int i3 = this.f4104d;
        if (i3 != -1) {
            return i3;
        }
        int iD = 0;
        for (int i4 = 0; i4 < this.f4101a; i4++) {
            iD += AbstractC0495i.D(k0.a(this.f4102b[i4]), (AbstractC0492f) this.f4103c[i4]);
        }
        this.f4104d = iD;
        return iD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        int i3 = this.f4101a;
        return i3 == g0Var.f4101a && o(this.f4102b, g0Var.f4102b, i3) && l(this.f4103c, g0Var.f4103c, this.f4101a);
    }

    public void h() {
        if (this.f4105e) {
            this.f4105e = false;
        }
    }

    public int hashCode() {
        int i3 = this.f4101a;
        return ((((527 + i3) * 31) + f(this.f4102b, i3)) * 31) + g(this.f4103c, this.f4101a);
    }

    g0 i(g0 g0Var) {
        if (g0Var.equals(c())) {
            return this;
        }
        a();
        int i3 = this.f4101a + g0Var.f4101a;
        b(i3);
        System.arraycopy(g0Var.f4102b, 0, this.f4102b, this.f4101a, g0Var.f4101a);
        System.arraycopy(g0Var.f4103c, 0, this.f4103c, this.f4101a, g0Var.f4101a);
        this.f4101a = i3;
        return this;
    }

    final void m(StringBuilder sb, int i3) {
        for (int i4 = 0; i4 < this.f4101a; i4++) {
            L.d(sb, i3, String.valueOf(k0.a(this.f4102b[i4])), this.f4103c[i4]);
        }
    }

    void n(int i3, Object obj) {
        a();
        b(this.f4101a + 1);
        int[] iArr = this.f4102b;
        int i4 = this.f4101a;
        iArr[i4] = i3;
        this.f4103c[i4] = obj;
        this.f4101a = i4 + 1;
    }

    void p(l0 l0Var) {
        if (l0Var.v() == l0.a.DESCENDING) {
            for (int i3 = this.f4101a - 1; i3 >= 0; i3--) {
                l0Var.f(k0.a(this.f4102b[i3]), this.f4103c[i3]);
            }
            return;
        }
        for (int i4 = 0; i4 < this.f4101a; i4++) {
            l0Var.f(k0.a(this.f4102b[i4]), this.f4103c[i4]);
        }
    }

    public void r(l0 l0Var) {
        if (this.f4101a == 0) {
            return;
        }
        if (l0Var.v() == l0.a.ASCENDING) {
            for (int i3 = 0; i3 < this.f4101a; i3++) {
                q(this.f4102b[i3], this.f4103c[i3], l0Var);
            }
            return;
        }
        for (int i4 = this.f4101a - 1; i4 >= 0; i4--) {
            q(this.f4102b[i4], this.f4103c[i4], l0Var);
        }
    }

    private g0(int i3, int[] iArr, Object[] objArr, boolean z2) {
        this.f4104d = -1;
        this.f4101a = i3;
        this.f4102b = iArr;
        this.f4103c = objArr;
        this.f4105e = z2;
    }
}
