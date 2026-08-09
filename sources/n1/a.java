package N1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2708a = new a("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2709b = new a("UNDECIDED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2710c = new a("RESUMED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f2711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ O1.a f2712e;

    static {
        a[] aVarArrC = c();
        f2711d = aVarArrC;
        f2712e = O1.b.a(aVarArrC);
    }

    private a(String str, int i3) {
    }

    private static final /* synthetic */ a[] c() {
        return new a[]{f2708a, f2709b, f2710c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2711d.clone();
    }
}
