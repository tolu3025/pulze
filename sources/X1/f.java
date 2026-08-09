package x1;

/* JADX INFO: loaded from: classes.dex */
public final class f implements AutoCloseable {
    private f(String str) {
        b(str);
    }

    public static void b(String str) {
        A.b.c(f(str));
    }

    public static void c(String str, int i3) {
        A.b.a(f(str), i3);
    }

    private static String f(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void l() {
        A.b.f();
    }

    public static void q(String str, int i3) {
        A.b.d(f(str), i3);
    }

    public static f r(String str) {
        return new f(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        l();
    }
}
