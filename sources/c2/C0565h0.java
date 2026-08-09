package c2;

/* JADX INFO: renamed from: c2.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0565h0 extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0561f0 f5147e;

    public C0565h0(InterfaceC0561f0 interfaceC0561f0) {
        this.f5147e = interfaceC0561f0;
    }

    @Override // c2.E0
    public boolean v() {
        return false;
    }

    @Override // c2.E0
    public void w(Throwable th) {
        this.f5147e.e();
    }
}
