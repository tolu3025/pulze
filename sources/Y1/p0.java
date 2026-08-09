package y1;

import e0.AbstractC0829j;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f12027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f12028b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f12029c = new AtomicReference();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f12030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f12031b;

        a(c cVar, Runnable runnable) {
            this.f12030a = cVar;
            this.f12031b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.execute(this.f12030a);
        }

        public String toString() {
            return this.f12031b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f12033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f12034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12035c;

        b(c cVar, Runnable runnable, long j3) {
            this.f12033a = cVar;
            this.f12034b = runnable;
            this.f12035c = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.execute(this.f12033a);
        }

        public String toString() {
            return this.f12034b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f12035c + ")";
        }
    }

    private static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f12037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f12038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12039c;

        c(Runnable runnable) {
            this.f12037a = (Runnable) AbstractC0829j.o(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12038b) {
                return;
            }
            this.f12039c = true;
            this.f12037a.run();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f12040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ScheduledFuture f12041b;

        private d(c cVar, ScheduledFuture scheduledFuture) {
            this.f12040a = (c) AbstractC0829j.o(cVar, "runnable");
            this.f12041b = (ScheduledFuture) AbstractC0829j.o(scheduledFuture, "future");
        }

        public void a() {
            this.f12040a.f12038b = true;
            this.f12041b.cancel(false);
        }

        public boolean b() {
            c cVar = this.f12040a;
            return (cVar.f12039c || cVar.f12038b) ? false : true;
        }

        /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }
    }

    public p0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f12027a = (Thread.UncaughtExceptionHandler) AbstractC0829j.o(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (com.google.android.gms.common.api.internal.m0.a(this.f12029c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f12028b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f12027a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f12029c.set(null);
                    throw th2;
                }
            }
            this.f12029c.set(null);
            if (this.f12028b.isEmpty()) {
                return;
            }
        }
    }

    public final void b(Runnable runnable) {
        this.f12028b.add((Runnable) AbstractC0829j.o(runnable, "runnable is null"));
    }

    public final d d(Runnable runnable, long j3, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j3, timeUnit), null);
    }

    public final d e(Runnable runnable, long j3, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j4), j3, j4, timeUnit), null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }

    public void f() {
        AbstractC0829j.u(Thread.currentThread() == this.f12029c.get(), "Not called from the SynchronizationContext");
    }
}
