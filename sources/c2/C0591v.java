package c2;

/* JADX INFO: renamed from: c2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0591v extends E0 implements InterfaceC0589u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0593w f5178e;

    public C0591v(InterfaceC0593w interfaceC0593w) {
        this.f5178e = interfaceC0593w;
    }

    @Override // c2.InterfaceC0589u
    public InterfaceC0600z0 getParent() {
        return u();
    }

    @Override // c2.InterfaceC0589u
    public boolean h(Throwable th) {
        return u().H(th);
    }

    @Override // c2.E0
    public boolean v() {
        return true;
    }

    @Override // c2.E0
    public void w(Throwable th) {
        this.f5178e.f(u());
    }
}
