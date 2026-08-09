package c2;

/* JADX INFO: loaded from: classes.dex */
public class B0 extends F0 implements A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5055c;

    public B0(InterfaceC0600z0 interfaceC0600z0) {
        super(true);
        c0(interfaceC0600z0);
        this.f5055c = I0();
    }

    private final boolean I0() {
        F0 f0U;
        InterfaceC0589u interfaceC0589uW = W();
        C0591v c0591v = interfaceC0589uW instanceof C0591v ? (C0591v) interfaceC0589uW : null;
        if (c0591v != null && (f0U = c0591v.u()) != null) {
            while (!f0U.S()) {
                InterfaceC0589u interfaceC0589uW2 = f0U.W();
                C0591v c0591v2 = interfaceC0589uW2 instanceof C0591v ? (C0591v) interfaceC0589uW2 : null;
                if (c0591v2 == null || (f0U = c0591v2.u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // c2.F0
    public boolean S() {
        return this.f5055c;
    }

    @Override // c2.F0
    public boolean U() {
        return true;
    }
}
