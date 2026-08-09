package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0490d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f4061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f4062b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f4063c;

    static {
        f4063c = (f4061a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f4062b;
    }

    static boolean c() {
        return f4061a || !(f4062b == null || f4063c);
    }
}
