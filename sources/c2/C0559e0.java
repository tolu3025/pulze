package c2;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: c2.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0559e0 implements InterfaceC0561f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f5134a;

    public C0559e0(Future future) {
        this.f5134a = future;
    }

    @Override // c2.InterfaceC0561f0
    public void e() {
        this.f5134a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f5134a + ']';
    }
}
