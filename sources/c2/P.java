package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f5096a = new P("DEFAULT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f5097b = new P("LAZY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P f5098c = new P("ATOMIC", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P f5099d = new P("UNDISPATCHED", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ P[] f5100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ O1.a f5101f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5102a;

        static {
            int[] iArr = new int[P.values().length];
            try {
                iArr[P.f5096a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P.f5098c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P.f5099d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P.f5097b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5102a = iArr;
        }
    }

    static {
        P[] pArrC = c();
        f5100e = pArrC;
        f5101f = O1.b.a(pArrC);
    }

    private P(String str, int i3) {
    }

    private static final /* synthetic */ P[] c() {
        return new P[]{f5096a, f5097b, f5098c, f5099d};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f5100e.clone();
    }

    public final void e(U1.p pVar, Object obj, M1.d dVar) {
        int i3 = a.f5102a[ordinal()];
        if (i3 == 1) {
            i2.a.c(pVar, obj, dVar);
            return;
        }
        if (i3 == 2) {
            M1.f.a(pVar, obj, dVar);
        } else if (i3 == 3) {
            i2.b.a(pVar, obj, dVar);
        } else if (i3 != 4) {
            throw new I1.k();
        }
    }

    public final boolean g() {
        return this == f5097b;
    }
}
