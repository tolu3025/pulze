package e0;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: e0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0834o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f7088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f7089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f7090c;

    static {
        Object objB = b();
        f7088a = objB;
        f7089b = objB == null ? null : a();
        f7090c = objB != null ? d(objB) : null;
    }

    private static Method a() {
        return c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e3) {
            throw e3;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e3) {
            throw e3;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Object obj) {
        try {
            Method methodC = c("getStackTraceDepth", Throwable.class);
            if (methodC == null) {
                return null;
            }
            methodC.invoke(obj, new Throwable());
            return methodC;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void f(Throwable th) {
        AbstractC0829j.n(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
