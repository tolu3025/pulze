package h2;

import c2.M0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends AbstractC0885b implements M0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7421d = AtomicIntegerFieldUpdater.newUpdater(A.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7422c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public A(long j3, A a3, int i3) {
        super(a3);
        this.f7422c = j3;
        this.cleanedAndPointers$volatile = i3 << 16;
    }

    @Override // h2.AbstractC0885b
    public boolean k() {
        return f7421d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f7421d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i3, Throwable th, M1.g gVar);

    public final void t() {
        if (f7421d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7421d;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
