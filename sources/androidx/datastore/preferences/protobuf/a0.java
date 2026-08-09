package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0506u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f4038a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f0 f4039b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f0 f4040c = new h0();

    private static Class A() {
        if (U.f4028d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static f0 B() {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (f0) clsC.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        if (U.f4028d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC0500n abstractC0500n, Object obj, Object obj2) {
        C0503q c0503qC = abstractC0500n.c(obj2);
        if (c0503qC.j()) {
            return;
        }
        abstractC0500n.d(obj).p(c0503qC);
    }

    static void E(E e3, Object obj, Object obj2, long j3) {
        i0.O(obj, j3, e3.a(i0.z(obj, j3), i0.z(obj2, j3)));
    }

    static void F(f0 f0Var, Object obj, Object obj2) {
        f0Var.p(obj, f0Var.k(f0Var.g(obj), f0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!AbstractC0505t.class.isAssignableFrom(cls) && !U.f4028d && (cls2 = f4038a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean H(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object I(Object obj, int i3, int i4, Object obj2, f0 f0Var) {
        if (obj2 == null) {
            obj2 = f0Var.f(obj);
        }
        f0Var.e(obj2, i3, i4);
        return obj2;
    }

    public static f0 J() {
        return f4039b;
    }

    public static f0 K() {
        return f4040c;
    }

    public static void L(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.r(i3, list, z2);
    }

    public static void M(int i3, List list, l0 l0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.I(i3, list);
    }

    public static void N(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.G(i3, list, z2);
    }

    public static void O(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.F(i3, list, z2);
    }

    public static void P(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.p(i3, list, z2);
    }

    public static void Q(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.j(i3, list, z2);
    }

    public static void R(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.b(i3, list, z2);
    }

    public static void S(int i3, List list, l0 l0Var, Y y2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.M(i3, list, y2);
    }

    public static void T(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.a(i3, list, z2);
    }

    public static void U(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.E(i3, list, z2);
    }

    public static void V(int i3, List list, l0 l0Var, Y y2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.L(i3, list, y2);
    }

    public static void W(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.k(i3, list, z2);
    }

    public static void X(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.o(i3, list, z2);
    }

    public static void Y(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.B(i3, list, z2);
    }

    public static void Z(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.t(i3, list, z2);
    }

    static int a(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z2 ? AbstractC0495i.O(i3) + AbstractC0495i.y(size) : size * AbstractC0495i.c(i3, true);
    }

    public static void a0(int i3, List list, l0 l0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.y(i3, list);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.s(i3, list, z2);
    }

    static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = size * AbstractC0495i.O(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            iO += AbstractC0495i.g((AbstractC0492f) list.get(i4));
        }
        return iO;
    }

    public static void c0(int i3, List list, l0 l0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.q(i3, list, z2);
    }

    static int d(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        int iO = AbstractC0495i.O(i3);
        return z2 ? iO + AbstractC0495i.y(iE) : iE + (size * iO);
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iK += AbstractC0495i.k(((Integer) list.get(i3)).intValue());
        }
        return iK;
    }

    static int f(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z2 ? AbstractC0495i.O(i3) + AbstractC0495i.y(size * 4) : size * AbstractC0495i.l(i3, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z2 ? AbstractC0495i.O(i3) + AbstractC0495i.y(size * 8) : size * AbstractC0495i.n(i3, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i3, List list, Y y2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iR += AbstractC0495i.r(i3, (J) list.get(i4), y2);
        }
        return iR;
    }

    static int k(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        int iO = AbstractC0495i.O(i3);
        return z2 ? iO + AbstractC0495i.y(iL) : iL + (size * iO);
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iV += AbstractC0495i.v(((Integer) list.get(i3)).intValue());
        }
        return iV;
    }

    static int m(int i3, List list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z2 ? AbstractC0495i.O(i3) + AbstractC0495i.y(iN) : iN + (list.size() * AbstractC0495i.O(i3));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iX += AbstractC0495i.x(((Long) list.get(i3)).longValue());
        }
        return iX;
    }

    static int o(int i3, Object obj, Y y2) {
        return AbstractC0495i.z(i3, (J) obj, y2);
    }

    static int p(int i3, List list, Y y2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC0495i.O(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            iO += AbstractC0495i.B((J) list.get(i4), y2);
        }
        return iO;
    }

    static int q(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        int iO = AbstractC0495i.O(i3);
        return z2 ? iO + AbstractC0495i.y(iR) : iR + (size * iO);
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iJ += AbstractC0495i.J(((Integer) list.get(i3)).intValue());
        }
        return iJ;
    }

    static int s(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        int iO = AbstractC0495i.O(i3);
        return z2 ? iO + AbstractC0495i.y(iT) : iT + (size * iO);
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iL += AbstractC0495i.L(((Long) list.get(i3)).longValue());
        }
        return iL;
    }

    static int u(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC0495i.O(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            iO += obj instanceof AbstractC0492f ? AbstractC0495i.g((AbstractC0492f) obj) : AbstractC0495i.N((String) obj);
        }
        return iO;
    }

    static int v(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        int iO = AbstractC0495i.O(i3);
        return z2 ? iO + AbstractC0495i.y(iW) : iW + (size * iO);
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iQ += AbstractC0495i.Q(((Integer) list.get(i3)).intValue());
        }
        return iQ;
    }

    static int x(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        int iO = AbstractC0495i.O(i3);
        return z2 ? iO + AbstractC0495i.y(iY) : iY + (size * iO);
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iS += AbstractC0495i.S(((Long) list.get(i3)).longValue());
        }
        return iS;
    }

    static Object z(Object obj, int i3, List list, AbstractC0506u.a aVar, Object obj2, f0 f0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Integer num = (Integer) list.get(i5);
                int iIntValue = num.intValue();
                if (aVar.a(iIntValue)) {
                    if (i5 != i4) {
                        list.set(i4, num);
                    }
                    i4++;
                } else {
                    obj2 = I(obj, i3, iIntValue, obj2, f0Var);
                }
            }
            if (i4 != size) {
                list.subList(i4, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!aVar.a(iIntValue2)) {
                    obj2 = I(obj, i3, iIntValue2, obj2, f0Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
