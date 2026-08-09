package A;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f0a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f1b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f2c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f3d;

    public static void a(String str, int i3) {
        try {
            if (f2c == null) {
                d.a(str, i3);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i3);
    }

    private static void b(String str, int i3) {
        try {
            if (f2c == null) {
                f2c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f2c.invoke(null, Long.valueOf(f0a), str, Integer.valueOf(i3));
        } catch (Exception e3) {
            g("asyncTraceBegin", e3);
        }
    }

    public static void c(String str) {
        c.a(str);
    }

    public static void d(String str, int i3) {
        try {
            if (f3d == null) {
                d.b(str, i3);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i3);
    }

    private static void e(String str, int i3) {
        try {
            if (f3d == null) {
                f3d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f3d.invoke(null, Long.valueOf(f0a), str, Integer.valueOf(i3));
        } catch (Exception e3) {
            g("asyncTraceEnd", e3);
        }
    }

    public static void f() {
        c.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        try {
            if (f1b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        try {
            if (f1b == null) {
                f0a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1b.invoke(null, Long.valueOf(f0a))).booleanValue();
        } catch (Exception e3) {
            g("isTagEnabled", e3);
            return false;
        }
    }
}
