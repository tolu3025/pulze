package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class o implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f6163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f6164b;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f6163a = executorService;
        this.f6164b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e3) {
            bVar.a(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(final Runnable runnable, final p.b bVar) {
        this.f6163a.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                o.n(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture p(final Runnable runnable, long j3, TimeUnit timeUnit, final p.b bVar) {
        return this.f6164b.schedule(new Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f6150a.o(runnable, bVar);
            }
        }, j3, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e3) {
            bVar.a(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future s(final Callable callable, final p.b bVar) {
        return this.f6163a.submit(new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                o.r(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture t(final Callable callable, long j3, TimeUnit timeUnit, final p.b bVar) {
        return this.f6164b.schedule(new Callable() { // from class: com.google.firebase.concurrent.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6153a.s(callable, bVar);
            }
        }, j3, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(Runnable runnable, p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e3) {
            bVar.a(e3);
            throw e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(final Runnable runnable, final p.b bVar) {
        this.f6163a.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                o.u(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture w(final Runnable runnable, long j3, long j4, TimeUnit timeUnit, final p.b bVar) {
        return this.f6164b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f6147a.v(runnable, bVar);
            }
        }, j3, j4, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(final Runnable runnable, final p.b bVar) {
        this.f6163a.execute(new Runnable() { // from class: com.google.firebase.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                o.z(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture y(final Runnable runnable, long j3, long j4, TimeUnit timeUnit, final p.b bVar) {
        return this.f6164b.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f6156a.x(runnable, bVar);
            }
        }, j3, j4, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e3) {
            bVar.a(e3);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return this.f6163a.awaitTermination(j3, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6163a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f6163a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f6163a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f6163a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f6163a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j3, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f6125a.p(runnable, j3, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j3, final long j4, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f6133a.w(runnable, j3, j4, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j3, final long j4, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f6138a.y(runnable, j3, j4, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f6163a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f6163a.invokeAll(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f6163a.invokeAny(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j3, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f6143a.t(callable, j3, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f6163a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f6163a.submit(callable);
    }
}
