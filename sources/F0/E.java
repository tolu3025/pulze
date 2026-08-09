package F0;

import com.google.firebase.firestore.V0;
import com.google.protobuf.AbstractC0806y;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1424c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0315t f1425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f1426b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final E a(AbstractC0315t expr) {
            kotlin.jvm.internal.m.e(expr, "expr");
            return new E(expr, b.f1427b);
        }

        public final E b(AbstractC0315t expr) {
            kotlin.jvm.internal.m.e(expr, "expr");
            return new E(expr, b.f1428c);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f1427b = new b("ASCENDING", 0, D0.z.G("ascending"));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f1428c = new b("DESCENDING", 1, D0.z.G("descending"));

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f1429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ O1.a f1430e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V0.I f1431a;

        static {
            b[] bVarArrC = c();
            f1429d = bVarArrC;
            f1430e = O1.b.a(bVarArrC);
        }

        private b(String str, int i3, V0.I i4) {
            this.f1431a = i4;
        }

        private static final /* synthetic */ b[] c() {
            return new b[]{f1427b, f1428c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f1429d.clone();
        }

        public final V0.I e() {
            return this.f1431a;
        }
    }

    public E(AbstractC0315t expr, b dir) {
        kotlin.jvm.internal.m.e(expr, "expr");
        kotlin.jvm.internal.m.e(dir, "dir");
        this.f1425a = expr;
        this.f1426b = dir;
    }

    public final String a() {
        return this.f1425a.x() + (this.f1426b == b.f1427b ? "asc" : "desc");
    }

    public final b b() {
        return this.f1426b;
    }

    public final AbstractC0315t c() {
        return this.f1425a;
    }

    public final V0.I d(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        AbstractC0806y abstractC0806yN = V0.I.J0().G(V0.x.j0().y("direction", this.f1426b.e()).y("expression", this.f1425a.w0(userDataReader))).n();
        kotlin.jvm.internal.m.d(abstractC0806yN, "build(...)");
        return (V0.I) abstractC0806yN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e3 = (E) obj;
        return kotlin.jvm.internal.m.a(this.f1425a, e3.f1425a) && this.f1426b == e3.f1426b;
    }

    public int hashCode() {
        return (this.f1425a.hashCode() * 31) + this.f1426b.hashCode();
    }
}
