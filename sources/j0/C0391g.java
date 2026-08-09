package J0;

import J0.C0391g;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: J0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0391g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f2443c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f2442b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2441a = new c();

    /* JADX INFO: renamed from: J0.g$b */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f2444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f2445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f2446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ScheduledFuture f2447d;

        private b(d dVar, long j3, Runnable runnable) {
            this.f2444a = dVar;
            this.f2445b = j3;
            this.f2446c = runnable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            C0391g.this.x();
            if (this.f2447d != null) {
                e();
                this.f2446c.run();
            }
        }

        private void e() {
            AbstractC0386b.d(this.f2447d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f2447d = null;
            C0391g.this.v(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(long j3) {
            this.f2447d = C0391g.this.f2441a.schedule(new Runnable() { // from class: J0.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2470a.d();
                }
            }, j3, TimeUnit.MILLISECONDS);
        }

        public void c() {
            C0391g.this.x();
            ScheduledFuture scheduledFuture = this.f2447d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0.g$c */
    class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScheduledThreadPoolExecutor f2449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Thread f2451c;

        /* JADX INFO: renamed from: J0.g$c$a */
        class a extends ScheduledThreadPoolExecutor {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0391g f2453a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i3, ThreadFactory threadFactory, C0391g c0391g) {
                super(i3, threadFactory);
                this.f2453a = c0391g;
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e3) {
                        th = e3.getCause();
                    }
                }
                if (th != null) {
                    C0391g.this.u(th);
                }
            }
        }

        /* JADX INFO: renamed from: J0.g$c$b */
        private class b implements Runnable, ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CountDownLatch f2455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Runnable f2456b;

            private b() {
                this.f2455a = new CountDownLatch(1);
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                AbstractC0386b.d(this.f2456b == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f2456b = runnable;
                this.f2455a.countDown();
                return c.this.f2451c;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f2455a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f2456b.run();
            }
        }

        c() {
            b bVar = new b();
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(bVar);
            this.f2451c = threadNewThread;
            threadNewThread.setName("FirestoreWorker");
            threadNewThread.setDaemon(true);
            threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: J0.i
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    this.f2471a.s(thread, th);
                }
            });
            a aVar = new a(1, bVar, C0391g.this);
            this.f2449a = aVar;
            aVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.f2450b = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized Task l(final Runnable runnable) {
            if (!o()) {
                Task taskM = m(new Callable() { // from class: J0.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C0391g.c.p(runnable);
                    }
                });
                this.f2450b = true;
                return taskM;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Task m(final Callable callable) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(new Runnable() { // from class: J0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0391g.c.r(taskCompletionSource, callable);
                    }
                });
            } catch (RejectedExecutionException unused) {
                A.e(C0391g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean o() {
            return this.f2450b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void p(Runnable runnable) {
            runnable.run();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void r(TaskCompletionSource taskCompletionSource, Callable callable) {
            try {
                taskCompletionSource.setResult(callable.call());
            } catch (Exception e3) {
                taskCompletionSource.setException(e3);
                throw new RuntimeException(e3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Thread thread, Throwable th) {
            C0391g.this.u(th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
            if (this.f2450b) {
                return null;
            }
            return this.f2449a.schedule(runnable, j3, timeUnit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(int i3) {
            this.f2449a.setCorePoolSize(i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u() {
            this.f2449a.shutdownNow();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            if (!this.f2450b) {
                this.f2449a.execute(runnable);
            }
        }

        public void n(Runnable runnable) {
            try {
                this.f2449a.execute(runnable);
            } catch (RejectedExecutionException unused) {
                A.e(C0391g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: J0.g$d */
    public enum d {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public static Task g(final Executor executor, final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: J0.e
            @Override // java.lang.Runnable
            public final void run() {
                C0391g.r(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private b h(d dVar, long j3, Runnable runnable) {
        b bVar = new b(dVar, System.currentTimeMillis() + j3, runnable);
        bVar.f(j3);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void q(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: J0.f
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return C0391g.q(taskCompletionSource, task);
                }
            });
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        } catch (Throwable th) {
            taskCompletionSource.setException(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void s(Runnable runnable) {
        runnable.run();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Throwable th) {
        if (!(th instanceof OutOfMemoryError)) {
            throw new RuntimeException("Internal error in Cloud Firestore (26.2.0).", th);
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (26.2.0) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
        outOfMemoryError.initCause(th);
        throw outOfMemoryError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(b bVar) {
        AbstractC0386b.d(this.f2442b.remove(bVar), "Delayed task not found.", new Object[0]);
    }

    public Task i(final Runnable runnable) {
        return j(new Callable() { // from class: J0.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0391g.s(runnable);
            }
        });
    }

    public Task j(Callable callable) {
        return this.f2441a.m(callable);
    }

    public b k(d dVar, long j3, Runnable runnable) {
        if (this.f2443c.contains(dVar)) {
            j3 = 0;
        }
        b bVarH = h(dVar, j3, runnable);
        this.f2442b.add(bVarH);
        return bVarH;
    }

    public void l(Runnable runnable) {
        i(runnable);
    }

    public void m(Runnable runnable) {
        this.f2441a.n(runnable);
    }

    public Task n(Runnable runnable) {
        return this.f2441a.l(runnable);
    }

    public Executor o() {
        return this.f2441a;
    }

    public boolean p() {
        return this.f2441a.o();
    }

    public void u(final Throwable th) {
        this.f2441a.u();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: J0.c
            @Override // java.lang.Runnable
            public final void run() {
                C0391g.t(th);
            }
        });
    }

    public void w() {
        this.f2441a.t(0);
    }

    public void x() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.f2441a.f2451c != threadCurrentThread) {
            throw AbstractC0386b.a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f2441a.f2451c.getName(), Long.valueOf(this.f2441a.f2451c.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        }
    }
}
