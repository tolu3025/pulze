package A0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0205d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0205d0 f119a = new EnumC0205d0("COLLECTION", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0205d0 f120b = new EnumC0205d0("COLLECTION_GROUP", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0205d0 f121c = new EnumC0205d0("DATABASE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0205d0 f122d = new EnumC0205d0("DOCUMENTS", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC0205d0 f123e = new EnumC0205d0("UNKNOWN", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC0205d0[] f124f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ O1.a f125l;

    static {
        EnumC0205d0[] enumC0205d0ArrC = c();
        f124f = enumC0205d0ArrC;
        f125l = O1.b.a(enumC0205d0ArrC);
    }

    private EnumC0205d0(String str, int i3) {
    }

    private static final /* synthetic */ EnumC0205d0[] c() {
        return new EnumC0205d0[]{f119a, f120b, f121c, f122d, f123e};
    }

    public static EnumC0205d0 valueOf(String str) {
        return (EnumC0205d0) Enum.valueOf(EnumC0205d0.class, str);
    }

    public static EnumC0205d0[] values() {
        return (EnumC0205d0[]) f124f.clone();
    }
}
