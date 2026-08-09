package c2;

import c2.AbstractC0571k0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0571k0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final T f5106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f5107o;

    static {
        Long l3;
        T t2 = new T();
        f5106n = t2;
        AbstractC0569j0.e0(t2, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f5107o = timeUnit.toNanos(l3.longValue());
    }

    private T() {
    }

    private final synchronized void E0() {
        if (H0()) {
            debugStatus = 3;
            y0();
            kotlin.jvm.internal.m.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread F0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f5106n.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean G0() {
        return debugStatus == 4;
    }

    private final boolean H0() {
        int i3 = debugStatus;
        return i3 == 2 || i3 == 3;
    }

    private final synchronized boolean I0() {
        if (H0()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.m.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void J0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // c2.AbstractC0571k0, c2.X
    public InterfaceC0561f0 b(long j3, Runnable runnable, M1.g gVar) {
        return B0(j3, runnable);
    }

    @Override // c2.AbstractC0573l0
    protected Thread k0() {
        Thread thread = _thread;
        return thread == null ? F0() : thread;
    }

    @Override // c2.AbstractC0573l0
    protected void l0(long j3, AbstractC0571k0.c cVar) {
        J0();
    }

    @Override // c2.AbstractC0571k0
    public void q0(Runnable runnable) {
        if (G0()) {
            J0();
        }
        super.q0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zW0;
        V0.f5110a.d(this);
        AbstractC0554c.a();
        try {
            if (!I0()) {
                if (zW0) {
                    return;
                } else {
                    return;
                }
            }
            long j3 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jH0 = h0();
                if (jH0 == Long.MAX_VALUE) {
                    AbstractC0554c.a();
                    long jNanoTime = System.nanoTime();
                    if (j3 == Long.MAX_VALUE) {
                        j3 = f5107o + jNanoTime;
                    }
                    long j4 = j3 - jNanoTime;
                    if (j4 <= 0) {
                        _thread = null;
                        E0();
                        AbstractC0554c.a();
                        if (w0()) {
                            return;
                        }
                        k0();
                        return;
                    }
                    jH0 = Y1.i.d(jH0, j4);
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (jH0 > 0) {
                    if (H0()) {
                        _thread = null;
                        E0();
                        AbstractC0554c.a();
                        if (w0()) {
                            return;
                        }
                        k0();
                        return;
                    }
                    AbstractC0554c.a();
                    LockSupport.parkNanos(this, jH0);
                }
            }
        } finally {
            _thread = null;
            E0();
            AbstractC0554c.a();
            if (!w0()) {
                k0();
            }
        }
    }

    @Override // c2.AbstractC0571k0, c2.AbstractC0569j0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // c2.K
    public String toString() {
        return "DefaultExecutor";
    }
}
