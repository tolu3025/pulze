package e0;

/* JADX INFO: renamed from: e0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0829j {
    private static String a(int i3, int i4, String str) {
        if (i3 < 0) {
            return AbstractC0832m.b("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return AbstractC0832m.b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException("negative size: " + i4);
    }

    private static String b(int i3, int i4, String str) {
        if (i3 < 0) {
            return AbstractC0832m.b("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return AbstractC0832m.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException("negative size: " + i4);
    }

    private static String c(int i3, int i4, int i5) {
        return (i3 < 0 || i3 > i5) ? b(i3, i5, "start index") : (i4 < 0 || i4 > i5) ? b(i4, i5, "end index") : AbstractC0832m.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public static void d(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z2, String str, char c3) {
        if (!z2) {
            throw new IllegalArgumentException(AbstractC0832m.b(str, Character.valueOf(c3)));
        }
    }

    public static void g(boolean z2, String str, char c3, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(AbstractC0832m.b(str, Character.valueOf(c3), obj));
        }
    }

    public static void h(boolean z2, String str, int i3) {
        if (!z2) {
            throw new IllegalArgumentException(AbstractC0832m.b(str, Integer.valueOf(i3)));
        }
    }

    public static void i(boolean z2, String str, long j3) {
        if (!z2) {
            throw new IllegalArgumentException(AbstractC0832m.b(str, Long.valueOf(j3)));
        }
    }

    public static void j(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(AbstractC0832m.b(str, obj));
        }
    }

    public static void k(boolean z2, String str, Object obj, Object obj2) {
        if (!z2) {
            throw new IllegalArgumentException(AbstractC0832m.b(str, obj, obj2));
        }
    }

    public static int l(int i3, int i4) {
        return m(i3, i4, "index");
    }

    public static int m(int i3, int i4, String str) {
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(a(i3, i4, str));
        }
        return i3;
    }

    public static Object n(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object o(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static Object p(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(AbstractC0832m.b(str, obj2));
    }

    public static int q(int i3, int i4) {
        return r(i3, i4, "index");
    }

    public static int r(int i3, int i4, String str) {
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(b(i3, i4, str));
        }
        return i3;
    }

    public static void s(int i3, int i4, int i5) {
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            throw new IndexOutOfBoundsException(c(i3, i4, i5));
        }
    }

    public static void t(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void u(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void v(boolean z2, String str, int i3) {
        if (!z2) {
            throw new IllegalStateException(AbstractC0832m.b(str, Integer.valueOf(i3)));
        }
    }

    public static void w(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalStateException(AbstractC0832m.b(str, obj));
        }
    }
}
