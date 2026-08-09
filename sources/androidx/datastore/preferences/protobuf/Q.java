package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final O f4021a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final O f4022b = new P();

    static O a() {
        return f4021a;
    }

    static O b() {
        return f4022b;
    }

    private static O c() {
        if (U.f4028d) {
            return null;
        }
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
