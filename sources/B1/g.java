package B1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class[] f684c;

    public g(Class cls, String str, Class... clsArr) {
        this.f682a = cls;
        this.f683b = str;
        this.f684c = clsArr;
    }

    private Method a(Class cls) {
        Class cls2;
        String str = this.f683b;
        if (str == null) {
            return null;
        }
        Method methodB = b(cls, str, this.f684c);
        if (methodB == null || (cls2 = this.f682a) == null || cls2.isAssignableFrom(methodB.getReturnType())) {
            return methodB;
        }
        return null;
    }

    private static Method b(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public Object c(Object obj, Object... objArr) {
        Method methodA = a(obj.getClass());
        if (methodA == null) {
            throw new AssertionError("Method " + this.f683b + " not supported for object " + obj);
        }
        try {
            return methodA.invoke(obj, objArr);
        } catch (IllegalAccessException e3) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodA);
            assertionError.initCause(e3);
            throw assertionError;
        }
    }

    public Object d(Object obj, Object... objArr) {
        Method methodA = a(obj.getClass());
        if (methodA == null) {
            return null;
        }
        try {
            return methodA.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object e(Object obj, Object... objArr) {
        try {
            return d(obj, objArr);
        } catch (InvocationTargetException e3) {
            Throwable targetException = e3.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object f(Object obj, Object... objArr) {
        try {
            return c(obj, objArr);
        } catch (InvocationTargetException e3) {
            Throwable targetException = e3.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean g(Object obj) {
        return a(obj.getClass()) != null;
    }
}
