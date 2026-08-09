package c2;

/* JADX INFO: loaded from: classes.dex */
public abstract class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h2.D f5082a = new h2.D("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2.D f5083b = new h2.D("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h2.D f5084c = new h2.D("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h2.D f5085d = new h2.D("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h2.D f5086e = new h2.D("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0567i0 f5087f = new C0567i0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C0567i0 f5088g = new C0567i0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC0592v0 ? new C0594w0((InterfaceC0592v0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC0592v0 interfaceC0592v0;
        C0594w0 c0594w0 = obj instanceof C0594w0 ? (C0594w0) obj : null;
        return (c0594w0 == null || (interfaceC0592v0 = c0594w0.f5179a) == null) ? obj : interfaceC0592v0;
    }
}
