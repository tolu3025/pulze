package h2;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: h2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0888e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection f7442a = a2.k.i(a2.i.c(ServiceLoader.load(c2.L.class, c2.L.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f7442a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
