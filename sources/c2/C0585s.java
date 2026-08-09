package c2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: c2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0585s extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5174c = AtomicIntegerFieldUpdater.newUpdater(C0585s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0585s(M1.d dVar, Throwable th, boolean z2) {
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th, z2);
        this._resumed$volatile = 0;
    }

    public final boolean e() {
        return f5174c.compareAndSet(this, 0, 1);
    }
}
