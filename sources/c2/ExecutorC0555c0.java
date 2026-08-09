package c2;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c2.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class ExecutorC0555c0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f5120a;

    public ExecutorC0555c0(K k3) {
        this.f5120a = k3;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        K k3 = this.f5120a;
        M1.h hVar = M1.h.f2707a;
        if (k3.V(hVar)) {
            this.f5120a.U(hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f5120a.toString();
    }
}
