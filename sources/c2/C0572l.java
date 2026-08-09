package c2;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: c2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0572l implements InterfaceC0574m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f5161a;

    public C0572l(Future future) {
        this.f5161a = future;
    }

    @Override // c2.InterfaceC0574m
    public void a(Throwable th) {
        this.f5161a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f5161a + ']';
    }
}
