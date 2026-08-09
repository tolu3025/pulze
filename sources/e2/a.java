package e2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7117a = new a("SUSPEND", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7118b = new a("DROP_OLDEST", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7119c = new a("DROP_LATEST", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f7120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ O1.a f7121e;

    static {
        a[] aVarArrC = c();
        f7120d = aVarArrC;
        f7121e = O1.b.a(aVarArrC);
    }

    private a(String str, int i3) {
    }

    private static final /* synthetic */ a[] c() {
        return new a[]{f7117a, f7118b, f7119c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7120d.clone();
    }
}
