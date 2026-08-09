package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0498l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f4183a = c();

    public static C0499m a() {
        C0499m c0499mB = b("getEmptyRegistry");
        return c0499mB != null ? c0499mB : C0499m.f4188c;
    }

    private static final C0499m b(String str) {
        Class cls = f4183a;
        if (cls == null) {
            return null;
        }
        try {
            return (C0499m) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
