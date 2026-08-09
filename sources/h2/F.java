package h2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f7427a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f7427a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
