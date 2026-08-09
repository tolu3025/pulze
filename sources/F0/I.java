package F0;

import com.google.firebase.firestore.V0;

/* JADX INFO: loaded from: classes.dex */
public final class I extends O {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f1443f = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Number f1444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f1445e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final I a(int i3) {
            return new I(Integer.valueOf(i3), b.f1446b.a(), null, 4, null);
        }

        public final I b(double d3) {
            return new I(Double.valueOf(d3), b.f1446b.b(), null, 4, null);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f1446b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f1447c = new b("documents");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final b f1448d = new b("percent");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V0.I f1449a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final b a() {
                return b.f1447c;
            }

            public final b b() {
                return b.f1448d;
            }
        }

        private b(V0.I i3) {
            this.f1449a = i3;
        }

        public final V0.I c() {
            return this.f1449a;
        }

        private b(String str) {
            this(D0.z.G(str));
        }
    }

    private I(Number number, b bVar, B b3) {
        super("sample", b3, null);
        this.f1444d = number;
        this.f1445e = bVar;
    }

    public static final I g(int i3) {
        return f1443f.a(i3);
    }

    public static final I h(double d3) {
        return f1443f.b(d3);
    }

    @Override // F0.O
    public a2.c a(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return a2.i.f(D0.z.F(this.f1444d), this.f1445e.c());
    }

    @Override // F0.O
    public String b() {
        throw new I1.l("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return kotlin.jvm.internal.m.a(this.f1444d, i3.f1444d) && kotlin.jvm.internal.m.a(this.f1445e, i3.f1445e) && kotlin.jvm.internal.m.a(e(), i3.e());
    }

    public int hashCode() {
        return (((this.f1444d.hashCode() * 31) + this.f1445e.hashCode()) * 31) + e().hashCode();
    }

    /* synthetic */ I(Number number, b bVar, B b3, int i3, kotlin.jvm.internal.h hVar) {
        this(number, bVar, (i3 & 4) != 0 ? B.f1420c : b3);
    }
}
