package c2;

/* JADX INFO: renamed from: c2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0599z {
    public static final InterfaceC0595x a(InterfaceC0600z0 interfaceC0600z0) {
        return new C0597y(interfaceC0600z0);
    }

    public static /* synthetic */ InterfaceC0595x b(InterfaceC0600z0 interfaceC0600z0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            interfaceC0600z0 = null;
        }
        return a(interfaceC0600z0);
    }

    public static final boolean c(InterfaceC0595x interfaceC0595x, Object obj) {
        Throwable thD = I1.n.d(obj);
        return thD == null ? interfaceC0595x.u(obj) : interfaceC0595x.r(thD);
    }
}
