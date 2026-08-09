package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f4147a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f4148b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f4149c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f4150d = c(3, 2);

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
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f4151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f4152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f4153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f4154f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f4155l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f4156m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f4157n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f4158o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f4159p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f4160q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f4161r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f4162s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f4163t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f4164u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f4165v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f4166w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f4167x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f4168y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final /* synthetic */ b[] f4169z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f4170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4171b;

        enum a extends b {
            a(String str, int i3, c cVar, int i4) {
                super(str, i3, cVar, i4);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b$b, reason: collision with other inner class name */
        enum C0087b extends b {
            C0087b(String str, int i3, c cVar, int i4) {
                super(str, i3, cVar, i4);
            }
        }

        enum c extends b {
            c(String str, int i3, c cVar, int i4) {
                super(str, i3, cVar, i4);
            }
        }

        enum d extends b {
            d(String str, int i3, c cVar, int i4) {
                super(str, i3, cVar, i4);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f4151c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f4152d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f4153e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f4154f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f4155l = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f4156m = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f4157n = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f4158o = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f4159p = aVar;
            c cVar3 = c.MESSAGE;
            C0087b c0087b = new C0087b("GROUP", 9, cVar3, 3);
            f4160q = c0087b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f4161r = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f4162s = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f4163t = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f4164u = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f4165v = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f4166w = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f4167x = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f4168y = bVar14;
            f4169z = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0087b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i3, c cVar, int i4) {
            this.f4170a = cVar;
            this.f4171b = i4;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f4169z.clone();
        }

        public c c() {
            return this.f4170a;
        }

        public int e() {
            return this.f4171b;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC0492f.f4066b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f4182a;

        c(Object obj) {
            this.f4182a = obj;
        }
    }

    public static int a(int i3) {
        return i3 >>> 3;
    }

    public static int b(int i3) {
        return i3 & 7;
    }

    static int c(int i3, int i4) {
        return (i3 << 3) | i4;
    }
}
