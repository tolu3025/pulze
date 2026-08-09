package io.grpc.internal;

import e0.AbstractC0829j;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
class J0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f8616c = Logger.getLogger(J0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayDeque f8618b;

    J0() {
    }

    private void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f8618b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f8616c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    private void b(Runnable runnable) {
        if (this.f8618b == null) {
            this.f8618b = new ArrayDeque(4);
        }
        this.f8618b.add(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AbstractC0829j.o(runnable, "'task' must not be null.");
        if (this.f8617a) {
            b(runnable);
            return;
        }
        this.f8617a = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                f8616c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.f8618b != null) {
                }
            } finally {
                if (this.f8618b != null) {
                    a();
                }
                this.f8617a = false;
            }
        }
    }
}
