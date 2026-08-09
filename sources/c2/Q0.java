package c2;

/* JADX INFO: loaded from: classes.dex */
final class Q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f5104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0576n f5105b;

    public Q0(K k3, InterfaceC0576n interfaceC0576n) {
        this.f5104a = k3;
        this.f5105b = interfaceC0576n;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5105b.k(this.f5104a, I1.u.f2419a);
    }
}
