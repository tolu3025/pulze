package t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P f11383c = new P("PAUSED", 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P f11384d = new P("RUNNING", 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final P f11385e = new P("SUCCESS", 2, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P f11386f = new P("CANCELED", 3, 3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final P f11387l = new P("ERROR", 4, 4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ P[] f11388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ O1.a f11389n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11390a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    static {
        P[] pArrC = c();
        f11388m = pArrC;
        f11389n = O1.b.a(pArrC);
        f11382b = new a(null);
    }

    private P(String str, int i3, int i4) {
        this.f11390a = i4;
    }

    private static final /* synthetic */ P[] c() {
        return new P[]{f11383c, f11384d, f11385e, f11386f, f11387l};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f11388m.clone();
    }

    public final int e() {
        return this.f11390a;
    }
}
