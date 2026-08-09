package F0;

/* JADX INFO: renamed from: F0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0297a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f1466a;

    public AbstractC0297a(B options) {
        kotlin.jvm.internal.m.e(options, "options");
        this.f1466a = options;
    }

    public final B a() {
        return this.f1466a;
    }

    public abstract AbstractC0297a b(B b3);

    public final AbstractC0297a c(String key, long j3) {
        kotlin.jvm.internal.m.e(key, "key");
        return d(key, D0.z.x(j3));
    }

    protected final AbstractC0297a d(String key, V0.I value) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        return b(this.f1466a.b(key, value));
    }

    public final AbstractC0297a e(String key, String value) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        return d(key, D0.z.G(value));
    }
}
