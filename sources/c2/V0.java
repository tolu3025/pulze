package c2;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V0 f5110a = new V0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f5111b = h2.L.a(new h2.D("ThreadLocalEventLoop"));

    private V0() {
    }

    public final AbstractC0569j0 a() {
        return (AbstractC0569j0) f5111b.get();
    }

    public final AbstractC0569j0 b() {
        ThreadLocal threadLocal = f5111b;
        AbstractC0569j0 abstractC0569j0 = (AbstractC0569j0) threadLocal.get();
        if (abstractC0569j0 != null) {
            return abstractC0569j0;
        }
        AbstractC0569j0 abstractC0569j0A = AbstractC0575m0.a();
        threadLocal.set(abstractC0569j0A);
        return abstractC0569j0A;
    }

    public final void c() {
        f5111b.set(null);
    }

    public final void d(AbstractC0569j0 abstractC0569j0) {
        f5111b.set(abstractC0569j0);
    }
}
