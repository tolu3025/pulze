package io.grpc.internal;

import e0.AbstractC0829j;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements Executor, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f8619d = Logger.getLogger(K0.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f8620e = d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Executor f8621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f8622b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f8623c = 0;

    private static abstract class b {
        private b() {
        }

        public abstract boolean a(K0 k02, int i3, int i4);

        public abstract void b(K0 k02, int i3);
    }

    private static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicIntegerFieldUpdater f8624a;

        private c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f8624a = atomicIntegerFieldUpdater;
        }

        @Override // io.grpc.internal.K0.b
        public boolean a(K0 k02, int i3, int i4) {
            return this.f8624a.compareAndSet(k02, i3, i4);
        }

        @Override // io.grpc.internal.K0.b
        public void b(K0 k02, int i3) {
            this.f8624a.set(k02, i3);
        }
    }

    private static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.K0.b
        public boolean a(K0 k02, int i3, int i4) {
            synchronized (k02) {
                try {
                    if (k02.f8623c != i3) {
                        return false;
                    }
                    k02.f8623c = i4;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.K0.b
        public void b(K0 k02, int i3) {
            synchronized (k02) {
                k02.f8623c = i3;
            }
        }
    }

    public K0(Executor executor) {
        AbstractC0829j.o(executor, "'executor' must not be null.");
        this.f8621a = executor;
    }

    private static b d() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(K0.class, "c"));
        } catch (Throwable th) {
            f8619d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new d();
        }
    }

    private void e(Runnable runnable) {
        if (f8620e.a(this, 0, -1)) {
            try {
                this.f8621a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f8622b.remove(runnable);
                }
                f8620e.b(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f8622b.add((Runnable) AbstractC0829j.o(runnable, "'r' must not be null."));
        e(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        try {
            Executor executor = this.f8621a;
            while (executor == this.f8621a && (runnable = (Runnable) this.f8622b.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e3) {
                    f8619d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e3);
                }
            }
            f8620e.b(this, 0);
            if (this.f8622b.isEmpty()) {
                return;
            }
            e(null);
        } catch (Throwable th) {
            f8620e.b(this, 0);
            throw th;
        }
    }
}
