package com.google.protobuf;

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
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f6685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f6686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final G f6687f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final G f6688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final G f6689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final G f6690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final G f6691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final G f6692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final G f6693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final G f6694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ G[] f6695s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f6696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f6697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f6698c;

    static {
        G g3 = new G("VOID", 0, Void.class, Void.class, null);
        f6685d = g3;
        Class cls = Integer.TYPE;
        G g4 = new G("INT", 1, cls, Integer.class, 0);
        f6686e = g4;
        G g5 = new G("LONG", 2, Long.TYPE, Long.class, 0L);
        f6687f = g5;
        G g6 = new G("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6688l = g6;
        G g7 = new G("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6689m = g7;
        G g8 = new G("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6690n = g8;
        G g9 = new G("STRING", 6, String.class, String.class, "");
        f6691o = g9;
        G g10 = new G("BYTE_STRING", 7, AbstractC0791i.class, AbstractC0791i.class, AbstractC0791i.f6770b);
        f6692p = g10;
        G g11 = new G("ENUM", 8, cls, Integer.class, null);
        f6693q = g11;
        G g12 = new G("MESSAGE", 9, Object.class, Object.class, null);
        f6694r = g12;
        f6695s = new G[]{g3, g4, g5, g6, g7, g8, g9, g10, g11, g12};
    }

    private G(String str, int i3, Class cls, Class cls2, Object obj) {
        this.f6696a = cls;
        this.f6697b = cls2;
        this.f6698c = obj;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f6695s.clone();
    }

    public Class c() {
        return this.f6697b;
    }
}
