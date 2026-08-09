package kotlin.jvm.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static Map a(Object obj) {
        if (obj instanceof V1.a) {
            h(obj, "kotlin.collections.MutableMap");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i3) {
        if (obj != null && !e(obj, i3)) {
            h(obj, "kotlin.jvm.functions.Function" + i3);
        }
        return obj;
    }

    public static Map c(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e3) {
            throw g(e3);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof i) {
            return ((i) obj).getArity();
        }
        if (obj instanceof U1.a) {
            return 0;
        }
        if (obj instanceof U1.l) {
            return 1;
        }
        if (obj instanceof U1.p) {
            return 2;
        }
        if (obj instanceof U1.q) {
            return 3;
        }
        return obj instanceof U1.r ? 4 : -1;
    }

    public static boolean e(Object obj, int i3) {
        return (obj instanceof I1.c) && d(obj) == i3;
    }

    private static Throwable f(Throwable th) {
        return m.j(th, D.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}
