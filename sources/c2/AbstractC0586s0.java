package c2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: c2.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0586s0 {
    public static final Executor a(K k3) {
        Executor executorY;
        AbstractC0583q0 abstractC0583q0 = k3 instanceof AbstractC0583q0 ? (AbstractC0583q0) k3 : null;
        return (abstractC0583q0 == null || (executorY = abstractC0583q0.Y()) == null) ? new ExecutorC0555c0(k3) : executorY;
    }

    public static final K b(Executor executor) {
        K k3;
        ExecutorC0555c0 executorC0555c0 = executor instanceof ExecutorC0555c0 ? (ExecutorC0555c0) executor : null;
        return (executorC0555c0 == null || (k3 = executorC0555c0.f5120a) == null) ? new C0584r0(executor) : k3;
    }

    public static final AbstractC0583q0 c(ExecutorService executorService) {
        return new C0584r0(executorService);
    }
}
