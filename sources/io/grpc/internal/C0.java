package io.grpc.internal;

import e0.C0831l;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f8425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f8426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f8427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0831l f8428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledFuture f8431g;

    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C0.this.f8430f) {
                C0.this.f8431g = null;
                return;
            }
            long j3 = C0.this.j();
            if (C0.this.f8429e - j3 > 0) {
                C0 c02 = C0.this;
                c02.f8431g = c02.f8425a.schedule(new c(), C0.this.f8429e - j3, TimeUnit.NANOSECONDS);
            } else {
                C0.this.f8430f = false;
                C0.this.f8431g = null;
                C0.this.f8427c.run();
            }
        }
    }

    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0.this.f8426b.execute(new b());
        }
    }

    C0(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C0831l c0831l) {
        this.f8427c = runnable;
        this.f8426b = executor;
        this.f8425a = scheduledExecutorService;
        this.f8428d = c0831l;
        c0831l.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        return this.f8428d.d(TimeUnit.NANOSECONDS);
    }

    void i(boolean z2) {
        ScheduledFuture scheduledFuture;
        this.f8430f = false;
        if (!z2 || (scheduledFuture = this.f8431g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f8431g = null;
    }

    void k(long j3, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j3);
        long j4 = j() + nanos;
        this.f8430f = true;
        if (j4 - this.f8429e < 0 || this.f8431g == null) {
            ScheduledFuture scheduledFuture = this.f8431g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f8431g = this.f8425a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f8429e = j4;
    }
}
