package kotlin.jvm.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            l();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            m(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) i(new NullPointerException(str + " must not be null")));
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            n(str);
        }
    }

    public static int f(int i3, int i4) {
        if (i3 < i4) {
            return -1;
        }
        return i3 == i4 ? 0 : 1;
    }

    public static int g(long j3, long j4) {
        if (j3 < j4) {
            return -1;
        }
        return j3 == j4 ? 0 : 1;
    }

    private static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = m.class.getName();
        int i3 = 0;
        while (!stackTrace[i3].getClassName().equals(name)) {
            i3++;
        }
        while (stackTrace[i3].getClassName().equals(name)) {
            i3++;
        }
        StackTraceElement stackTraceElement = stackTrace[i3];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static Throwable i(Throwable th) {
        return j(th, m.class.getName());
    }

    static Throwable j(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(stackTrace[i4].getClassName())) {
                i3 = i4;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
        return th;
    }

    public static String k(String str, Object obj) {
        return str + obj;
    }

    public static void l() {
        throw ((NullPointerException) i(new NullPointerException()));
    }

    public static void m(String str) {
        throw ((NullPointerException) i(new NullPointerException(str)));
    }

    private static void n(String str) {
        throw ((NullPointerException) i(new NullPointerException(h(str))));
    }

    public static void o(String str) {
        throw ((I1.t) i(new I1.t(str)));
    }

    public static void p(String str) {
        o("lateinit property " + str + " has not been initialized");
    }
}
