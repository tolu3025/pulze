package c2;

import c2.AbstractC0571k0;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: c2.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0573l0 extends AbstractC0569j0 {
    protected abstract Thread k0();

    protected void l0(long j3, AbstractC0571k0.c cVar) {
        T.f5106n.z0(j3, cVar);
    }

    protected final void m0() {
        Thread threadK0 = k0();
        if (Thread.currentThread() != threadK0) {
            AbstractC0554c.a();
            LockSupport.unpark(threadK0);
        }
    }
}
