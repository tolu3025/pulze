package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f3995a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f3996b = new F();

    static E a() {
        return f3995a;
    }

    static E b() {
        return f3996b;
    }

    private static E c() {
        if (U.f4028d) {
            return null;
        }
        try {
            return (E) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
