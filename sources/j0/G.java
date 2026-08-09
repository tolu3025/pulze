package J0;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
class G implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Semaphore f2430b;

    G(int i3, Executor executor) {
        this.f2430b = new Semaphore(i3);
        this.f2429a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        runnable.run();
        this.f2430b.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (this.f2430b.tryAcquire()) {
            try {
                this.f2429a.execute(new Runnable() { // from class: J0.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2427a.b(runnable);
                    }
                });
                return;
            } catch (RejectedExecutionException unused) {
            }
        }
        runnable.run();
    }
}
