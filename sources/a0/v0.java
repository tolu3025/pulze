package A0;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f296a;

    static {
        int[] iArr = new int[A0.values().length];
        f296a = iArr;
        try {
            iArr[A0.Set.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f296a[A0.MergeSet.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f296a[A0.Update.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f296a[A0.Argument.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f296a[A0.ArrayArgument.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
