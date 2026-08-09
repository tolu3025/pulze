package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC0510y f3980a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC0510y f3981b = new C0511z();

    static InterfaceC0510y a() {
        return f3980a;
    }

    static InterfaceC0510y b() {
        return f3981b;
    }

    private static InterfaceC0510y c() {
        if (U.f4028d) {
            return null;
        }
        try {
            return (InterfaceC0510y) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
