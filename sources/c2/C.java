package c2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5056b = AtomicIntegerFieldUpdater.newUpdater(C.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5057a;

    public C(Throwable th, boolean z2) {
        this.f5057a = th;
        this._handled$volatile = z2 ? 1 : 0;
    }

    public final boolean a() {
        return f5056b.get(this) != 0;
    }

    public final boolean c() {
        return f5056b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return S.a(this) + '[' + this.f5057a + ']';
    }

    public /* synthetic */ C(Throwable th, boolean z2, int i3, kotlin.jvm.internal.h hVar) {
        this(th, (i3 & 2) != 0 ? false : z2);
    }
}
