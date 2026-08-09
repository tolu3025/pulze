package c2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: c2.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0596x0 extends E0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5180f = AtomicIntegerFieldUpdater.newUpdater(C0596x0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U1.l f5181e;

    public C0596x0(U1.l lVar) {
        this.f5181e = lVar;
    }

    @Override // c2.E0
    public boolean v() {
        return true;
    }

    @Override // c2.E0
    public void w(Throwable th) {
        if (f5180f.compareAndSet(this, 0, 1)) {
            this.f5181e.invoke(th);
        }
    }
}
