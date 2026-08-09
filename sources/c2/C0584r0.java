package c2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c2.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0584r0 extends AbstractC0583q0 implements X {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f5173d;

    public C0584r0(Executor executor) {
        this.f5173d = executor;
        if (Y() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) Y()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void Z(M1.g gVar, RejectedExecutionException rejectedExecutionException) {
        C0.c(gVar, AbstractC0579o0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture a0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, M1.g gVar, long j3) {
        try {
            return scheduledExecutorService.schedule(runnable, j3, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e3) {
            Z(gVar, e3);
            return null;
        }
    }

    @Override // c2.X
    public void L(long j3, InterfaceC0576n interfaceC0576n) {
        Executor executorY = Y();
        ScheduledExecutorService scheduledExecutorService = executorY instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorY : null;
        ScheduledFuture scheduledFutureA0 = scheduledExecutorService != null ? a0(scheduledExecutorService, new Q0(this, interfaceC0576n), interfaceC0576n.getContext(), j3) : null;
        if (scheduledFutureA0 != null) {
            r.c(interfaceC0576n, new C0572l(scheduledFutureA0));
        } else {
            T.f5106n.L(j3, interfaceC0576n);
        }
    }

    @Override // c2.K
    public void U(M1.g gVar, Runnable runnable) {
        try {
            Executor executorY = Y();
            AbstractC0554c.a();
            executorY.execute(runnable);
        } catch (RejectedExecutionException e3) {
            AbstractC0554c.a();
            Z(gVar, e3);
            C0557d0.b().U(gVar, runnable);
        }
    }

    @Override // c2.AbstractC0583q0
    public Executor Y() {
        return this.f5173d;
    }

    @Override // c2.X
    public InterfaceC0561f0 b(long j3, Runnable runnable, M1.g gVar) {
        Executor executorY = Y();
        ScheduledExecutorService scheduledExecutorService = executorY instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorY : null;
        ScheduledFuture scheduledFutureA0 = scheduledExecutorService != null ? a0(scheduledExecutorService, runnable, gVar, j3) : null;
        return scheduledFutureA0 != null ? new C0559e0(scheduledFutureA0) : T.f5106n.b(j3, runnable, gVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorY = Y();
        ExecutorService executorService = executorY instanceof ExecutorService ? (ExecutorService) executorY : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0584r0) && ((C0584r0) obj).Y() == Y();
    }

    public int hashCode() {
        return System.identityHashCode(Y());
    }

    @Override // c2.K
    public String toString() {
        return Y().toString();
    }
}
