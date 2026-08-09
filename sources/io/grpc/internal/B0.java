package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements InterfaceC0942f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f8373b = Logger.getLogger(B0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f8374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f8375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f8376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final RuntimeException f8377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object[] f8378g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8379a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Class<?> cls;
        RuntimeException runtimeException = null;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", new Class[0]);
            } catch (Throwable th) {
                th = th;
                method2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
            method2 = null;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i3];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i3++;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            f8373b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
        }
        if (th != null || constructor == null) {
            f8374c = null;
            f8375d = null;
            f8376e = null;
            runtimeException = new RuntimeException(th);
        } else {
            f8374c = constructor;
            f8375d = method;
            f8376e = method2;
        }
        f8377f = runtimeException;
        f8378g = new Object[]{1L};
    }

    B0() {
        RuntimeException runtimeException = f8377f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f8379a = f8374c.newInstance(new Object[0]);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    static boolean b() {
        return f8377f == null;
    }

    @Override // io.grpc.internal.InterfaceC0942f0
    public void a(long j3) {
        try {
            f8375d.invoke(this.f8379a, j3 == 1 ? f8378g : new Object[]{Long.valueOf(j3)});
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
