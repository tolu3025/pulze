package c2;

/* JADX INFO: renamed from: c2.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0563g0 implements InterfaceC0574m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0561f0 f5145a;

    public C0563g0(InterfaceC0561f0 interfaceC0561f0) {
        this.f5145a = interfaceC0561f0;
    }

    @Override // c2.InterfaceC0574m
    public void a(Throwable th) {
        this.f5145a.e();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f5145a + ']';
    }
}
