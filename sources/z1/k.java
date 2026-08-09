package Z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f3576a = new k("PUBLIC", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f3577b = new k("PROTECTED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f3578c = new k("INTERNAL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f3579d = new k("PRIVATE", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ k[] f3580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ O1.a f3581f;

    static {
        k[] kVarArrC = c();
        f3580e = kVarArrC;
        f3581f = O1.b.a(kVarArrC);
    }

    private k(String str, int i3) {
    }

    private static final /* synthetic */ k[] c() {
        return new k[]{f3576a, f3577b, f3578c, f3579d};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f3580e.clone();
    }
}
