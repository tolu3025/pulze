package s0;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import r0.E;

/* JADX INFO: loaded from: classes.dex */
class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f11246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Semaphore f11247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedBlockingQueue f11248c = new LinkedBlockingQueue();

    l(Executor executor, int i3) {
        E.a(i3 > 0, "concurrency must be positive.");
        this.f11246a = executor;
        this.f11247b = new Semaphore(i3, true);
    }

    private Runnable b(final Runnable runnable) {
        return new Runnable() { // from class: s0.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f11244a.d(runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f11247b.release();
            e();
        }
    }

    private void e() {
        while (this.f11247b.tryAcquire()) {
            Runnable runnable = (Runnable) this.f11248c.poll();
            if (runnable == null) {
                this.f11247b.release();
                return;
            }
            this.f11246a.execute(b(runnable));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f11248c.offer(runnable);
        e();
    }
}
