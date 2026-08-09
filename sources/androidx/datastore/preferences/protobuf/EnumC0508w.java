package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0508w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0508w f4287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC0508w f4288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC0508w f4289f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0508w f4290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC0508w f4291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC0508w f4292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0508w f4293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0508w f4294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0508w f4295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0508w f4296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ EnumC0508w[] f4297s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f4298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f4299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f4300c;

    static {
        EnumC0508w enumC0508w = new EnumC0508w("VOID", 0, Void.class, Void.class, null);
        f4287d = enumC0508w;
        Class cls = Integer.TYPE;
        EnumC0508w enumC0508w2 = new EnumC0508w("INT", 1, cls, Integer.class, 0);
        f4288e = enumC0508w2;
        EnumC0508w enumC0508w3 = new EnumC0508w("LONG", 2, Long.TYPE, Long.class, 0L);
        f4289f = enumC0508w3;
        EnumC0508w enumC0508w4 = new EnumC0508w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f4290l = enumC0508w4;
        EnumC0508w enumC0508w5 = new EnumC0508w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f4291m = enumC0508w5;
        EnumC0508w enumC0508w6 = new EnumC0508w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f4292n = enumC0508w6;
        EnumC0508w enumC0508w7 = new EnumC0508w("STRING", 6, String.class, String.class, "");
        f4293o = enumC0508w7;
        EnumC0508w enumC0508w8 = new EnumC0508w("BYTE_STRING", 7, AbstractC0492f.class, AbstractC0492f.class, AbstractC0492f.f4066b);
        f4294p = enumC0508w8;
        EnumC0508w enumC0508w9 = new EnumC0508w("ENUM", 8, cls, Integer.class, null);
        f4295q = enumC0508w9;
        EnumC0508w enumC0508w10 = new EnumC0508w("MESSAGE", 9, Object.class, Object.class, null);
        f4296r = enumC0508w10;
        f4297s = new EnumC0508w[]{enumC0508w, enumC0508w2, enumC0508w3, enumC0508w4, enumC0508w5, enumC0508w6, enumC0508w7, enumC0508w8, enumC0508w9, enumC0508w10};
    }

    private EnumC0508w(String str, int i3, Class cls, Class cls2, Object obj) {
        this.f4298a = cls;
        this.f4299b = cls2;
        this.f4300c = obj;
    }

    public static EnumC0508w valueOf(String str) {
        return (EnumC0508w) Enum.valueOf(EnumC0508w.class, str);
    }

    public static EnumC0508w[] values() {
        return (EnumC0508w[]) f4297s.clone();
    }

    public Class c() {
        return this.f4299b;
    }
}
