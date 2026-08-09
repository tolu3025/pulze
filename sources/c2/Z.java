package c2;

import h2.AbstractC0892i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends h2.z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5114e = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public Z(M1.g gVar, M1.d dVar) {
        super(gVar, dVar);
    }

    private final boolean O0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5114e;
        do {
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f5114e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean P0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5114e;
        do {
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f5114e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // h2.z, c2.AbstractC0550a
    protected void I0(Object obj) {
        if (O0()) {
            return;
        }
        AbstractC0892i.b(N1.c.c(this.f7480d), E.a(obj, this.f7480d));
    }

    public final Object M0() {
        if (P0()) {
            return N1.d.e();
        }
        Object objH = G0.h(X());
        if (objH instanceof C) {
            throw ((C) objH).f5057a;
        }
        return objH;
    }

    @Override // h2.z, c2.F0
    protected void w(Object obj) {
        I0(obj);
    }
}
