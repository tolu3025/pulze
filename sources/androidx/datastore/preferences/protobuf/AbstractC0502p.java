package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0502p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC0500n f4192a = new C0501o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0500n f4193b = c();

    static AbstractC0500n a() {
        AbstractC0500n abstractC0500n = f4193b;
        if (abstractC0500n != null) {
            return abstractC0500n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC0500n b() {
        return f4192a;
    }

    private static AbstractC0500n c() {
        if (U.f4028d) {
            return null;
        }
        try {
            return (AbstractC0500n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
