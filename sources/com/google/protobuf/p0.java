package com.google.protobuf;

import com.google.protobuf.C;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f6871a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v0 f6872b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v0 f6873c = new x0();

    private static Class A() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static v0 B() {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (v0) clsC.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(r rVar, Object obj, Object obj2) {
        C0802u c0802uC = rVar.c(obj2);
        if (c0802uC.j()) {
            return;
        }
        rVar.d(obj).p(c0802uC);
    }

    static void E(P p2, Object obj, Object obj2, long j3) {
        z0.V(obj, j3, p2.a(z0.G(obj, j3), z0.G(obj2, j3)));
    }

    static void F(v0 v0Var, Object obj, Object obj2) {
        v0Var.p(obj, v0Var.k(v0Var.g(obj), v0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!AbstractC0806y.class.isAssignableFrom(cls) && (cls2 = f6871a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean H(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object I(Object obj, int i3, int i4, Object obj2, v0 v0Var) {
        if (obj2 == null) {
            obj2 = v0Var.f(obj);
        }
        v0Var.e(obj2, i3, i4);
        return obj2;
    }

    public static v0 J() {
        return f6872b;
    }

    public static v0 K() {
        return f6873c;
    }

    public static void L(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.r(i3, list, z2);
    }

    public static void M(int i3, List list, C0 c02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.I(i3, list);
    }

    public static void N(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.G(i3, list, z2);
    }

    public static void O(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.F(i3, list, z2);
    }

    public static void P(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.p(i3, list, z2);
    }

    public static void Q(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.j(i3, list, z2);
    }

    public static void R(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.b(i3, list, z2);
    }

    public static void S(int i3, List list, C0 c02, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.K(i3, list, n0Var);
    }

    public static void T(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.a(i3, list, z2);
    }

    public static void U(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.E(i3, list, z2);
    }

    public static void V(int i3, List list, C0 c02, n0 n0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.J(i3, list, n0Var);
    }

    public static void W(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.k(i3, list, z2);
    }

    public static void X(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.o(i3, list, z2);
    }

    public static void Y(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.B(i3, list, z2);
    }

    public static void Z(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.t(i3, list, z2);
    }

    static int a(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z2 ? AbstractC0794l.Q(i3) + AbstractC0794l.A(size) : size * AbstractC0794l.e(i3, true);
    }

    public static void a0(int i3, List list, C0 c02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.y(i3, list);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.s(i3, list, z2);
    }

    static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = size * AbstractC0794l.Q(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            iQ += AbstractC0794l.i((AbstractC0791i) list.get(i4));
        }
        return iQ;
    }

    public static void c0(int i3, List list, C0 c02, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c02.q(i3, list, z2);
    }

    static int d(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        int iQ = AbstractC0794l.Q(i3);
        return z2 ? iQ + AbstractC0794l.A(iE) : iE + (size * iQ);
    }

    static int e(List list) {
        int iM;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b3 = (B) list;
            iM = 0;
            while (i3 < size) {
                iM += AbstractC0794l.m(b3.p(i3));
                i3++;
            }
        } else {
            iM = 0;
            while (i3 < size) {
                iM += AbstractC0794l.m(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return iM;
    }

    static int f(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z2 ? AbstractC0794l.Q(i3) + AbstractC0794l.A(size * 4) : size * AbstractC0794l.n(i3, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z2 ? AbstractC0794l.Q(i3) + AbstractC0794l.A(size * 8) : size * AbstractC0794l.p(i3, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i3, List list, n0 n0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iT += AbstractC0794l.t(i3, (V) list.get(i4), n0Var);
        }
        return iT;
    }

    static int k(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        int iQ = AbstractC0794l.Q(i3);
        return z2 ? iQ + AbstractC0794l.A(iL) : iL + (size * iQ);
    }

    static int l(List list) {
        int iX;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b3 = (B) list;
            iX = 0;
            while (i3 < size) {
                iX += AbstractC0794l.x(b3.p(i3));
                i3++;
            }
        } else {
            iX = 0;
            while (i3 < size) {
                iX += AbstractC0794l.x(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return iX;
    }

    static int m(int i3, List list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z2 ? AbstractC0794l.Q(i3) + AbstractC0794l.A(iN) : iN + (list.size() * AbstractC0794l.Q(i3));
    }

    static int n(List list) {
        int iZ;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L) {
            L l3 = (L) list;
            iZ = 0;
            while (i3 < size) {
                iZ += AbstractC0794l.z(l3.d(i3));
                i3++;
            }
        } else {
            iZ = 0;
            while (i3 < size) {
                iZ += AbstractC0794l.z(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return iZ;
    }

    static int o(int i3, Object obj, n0 n0Var) {
        return AbstractC0794l.B(i3, (V) obj, n0Var);
    }

    static int p(int i3, List list, n0 n0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = AbstractC0794l.Q(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            iQ += AbstractC0794l.D((V) list.get(i4), n0Var);
        }
        return iQ;
    }

    static int q(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        int iQ = AbstractC0794l.Q(i3);
        return z2 ? iQ + AbstractC0794l.A(iR) : iR + (size * iQ);
    }

    static int r(List list) {
        int iL;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b3 = (B) list;
            iL = 0;
            while (i3 < size) {
                iL += AbstractC0794l.L(b3.p(i3));
                i3++;
            }
        } else {
            iL = 0;
            while (i3 < size) {
                iL += AbstractC0794l.L(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return iL;
    }

    static int s(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        int iQ = AbstractC0794l.Q(i3);
        return z2 ? iQ + AbstractC0794l.A(iT) : iT + (size * iQ);
    }

    static int t(List list) {
        int iN;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L) {
            L l3 = (L) list;
            iN = 0;
            while (i3 < size) {
                iN += AbstractC0794l.N(l3.d(i3));
                i3++;
            }
        } else {
            iN = 0;
            while (i3 < size) {
                iN += AbstractC0794l.N(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return iN;
    }

    static int u(int i3, List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int iQ = AbstractC0794l.Q(i3) * size;
        if (list instanceof J) {
            J j3 = (J) list;
            while (i4 < size) {
                Object objJ = j3.j(i4);
                iQ += objJ instanceof AbstractC0791i ? AbstractC0794l.i((AbstractC0791i) objJ) : AbstractC0794l.P((String) objJ);
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                iQ += obj instanceof AbstractC0791i ? AbstractC0794l.i((AbstractC0791i) obj) : AbstractC0794l.P((String) obj);
                i4++;
            }
        }
        return iQ;
    }

    static int v(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        int iQ = AbstractC0794l.Q(i3);
        return z2 ? iQ + AbstractC0794l.A(iW) : iW + (size * iQ);
    }

    static int w(List list) {
        int iS;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b3 = (B) list;
            iS = 0;
            while (i3 < size) {
                iS += AbstractC0794l.S(b3.p(i3));
                i3++;
            }
        } else {
            iS = 0;
            while (i3 < size) {
                iS += AbstractC0794l.S(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return iS;
    }

    static int x(int i3, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        int iQ = AbstractC0794l.Q(i3);
        return z2 ? iQ + AbstractC0794l.A(iY) : iY + (size * iQ);
    }

    static int y(List list) {
        int iU;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L) {
            L l3 = (L) list;
            iU = 0;
            while (i3 < size) {
                iU += AbstractC0794l.U(l3.d(i3));
                i3++;
            }
        } else {
            iU = 0;
            while (i3 < size) {
                iU += AbstractC0794l.U(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return iU;
    }

    static Object z(Object obj, int i3, List list, C.c cVar, Object obj2, v0 v0Var) {
        if (cVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Integer num = (Integer) list.get(i5);
                int iIntValue = num.intValue();
                if (cVar.a(iIntValue)) {
                    if (i5 != i4) {
                        list.set(i4, num);
                    }
                    i4++;
                } else {
                    obj2 = I(obj, i3, iIntValue, obj2, v0Var);
                }
            }
            if (i4 != size) {
                list.subList(i4, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!cVar.a(iIntValue2)) {
                    obj2 = I(obj, i3, iIntValue2, obj2, v0Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
