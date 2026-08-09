package c2;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: c2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0562g extends AbstractC0550a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Thread f5143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC0569j0 f5144e;

    public C0562g(M1.g gVar, Thread thread, AbstractC0569j0 abstractC0569j0) {
        super(gVar, true, true);
        this.f5143d = thread;
        this.f5144e = abstractC0569j0;
    }

    public final Object M0() throws Throwable {
        AbstractC0554c.a();
        try {
            AbstractC0569j0 abstractC0569j0 = this.f5144e;
            if (abstractC0569j0 != null) {
                AbstractC0569j0.e0(abstractC0569j0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC0569j0 abstractC0569j02 = this.f5144e;
                    long jH0 = abstractC0569j02 != null ? abstractC0569j02.h0() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        AbstractC0569j0 abstractC0569j03 = this.f5144e;
                        if (abstractC0569j03 != null) {
                            AbstractC0569j0.Z(abstractC0569j03, false, 1, null);
                        }
                        AbstractC0554c.a();
                        Object objH = G0.h(X());
                        C c3 = objH instanceof C ? (C) objH : null;
                        if (c3 == null) {
                            return objH;
                        }
                        throw c3.f5057a;
                    }
                    AbstractC0554c.a();
                    LockSupport.parkNanos(this, jH0);
                } catch (Throwable th) {
                    AbstractC0569j0 abstractC0569j04 = this.f5144e;
                    if (abstractC0569j04 != null) {
                        AbstractC0569j0.Z(abstractC0569j04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            A(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC0554c.a();
            throw th2;
        }
    }

    @Override // c2.F0
    protected boolean e0() {
        return true;
    }

    @Override // c2.F0
    protected void w(Object obj) {
        if (kotlin.jvm.internal.m.a(Thread.currentThread(), this.f5143d)) {
            return;
        }
        Thread thread = this.f5143d;
        AbstractC0554c.a();
        LockSupport.unpark(thread);
    }
}
