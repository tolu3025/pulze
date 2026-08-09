package t1;

/* JADX INFO: renamed from: t1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1247v extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f11457c;

    public C1247v(String code, String str, Object obj) {
        kotlin.jvm.internal.m.e(code, "code");
        this.f11455a = code;
        this.f11456b = str;
        this.f11457c = obj;
    }

    public final String a() {
        return this.f11455a;
    }

    public final Object b() {
        return this.f11457c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f11456b;
    }
}
