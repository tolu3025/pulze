package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f6629a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f6630b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f6631c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f6632d = c(3, 2);

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
        public static final b f6633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f6634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f6635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f6636f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f6637l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f6638m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f6639n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f6640o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f6641p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f6642q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f6643r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f6644s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f6645t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f6646u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f6647v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f6648w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f6649x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f6650y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final /* synthetic */ b[] f6651z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f6652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6653b;

        enum a extends b {
            a(String str, int i3, c cVar, int i4) {
                super(str, i3, cVar, i4);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.B0$b$b, reason: collision with other inner class name */
        enum C0115b extends b {
            C0115b(String str, int i3, c cVar, int i4) {
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
            f6633c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f6634d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f6635e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f6636f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f6637l = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f6638m = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f6639n = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f6640o = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f6641p = aVar;
            c cVar3 = c.MESSAGE;
            C0115b c0115b = new C0115b("GROUP", 9, cVar3, 3);
            f6642q = c0115b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f6643r = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f6644s = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f6645t = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f6646u = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f6647v = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f6648w = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f6649x = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f6650y = bVar14;
            f6651z = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0115b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i3, c cVar, int i4) {
            this.f6652a = cVar;
            this.f6653b = i4;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f6651z.clone();
        }

        public c c() {
            return this.f6652a;
        }

        public int e() {
            return this.f6653b;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC0791i.f6770b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f6664a;

        c(Object obj) {
            this.f6664a = obj;
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
