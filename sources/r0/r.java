package r0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f11158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11160c;

    private r(Class cls, int i3, int i4) {
        this(F.b(cls), i3, i4);
    }

    public static r a(Class cls) {
        return new r(cls, 0, 2);
    }

    private static String b(int i3) {
        if (i3 == 0) {
            return "direct";
        }
        if (i3 == 1) {
            return "provider";
        }
        if (i3 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i3);
    }

    public static r h(Class cls) {
        return new r(cls, 0, 0);
    }

    public static r i(Class cls) {
        return new r(cls, 0, 1);
    }

    public static r j(Class cls) {
        return new r(cls, 1, 0);
    }

    public static r k(F f3) {
        return new r(f3, 1, 0);
    }

    public static r l(Class cls) {
        return new r(cls, 1, 1);
    }

    public static r m(Class cls) {
        return new r(cls, 2, 0);
    }

    public F c() {
        return this.f11158a;
    }

    public boolean d() {
        return this.f11160c == 2;
    }

    public boolean e() {
        return this.f11160c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f11158a.equals(rVar.f11158a) && this.f11159b == rVar.f11159b && this.f11160c == rVar.f11160c;
    }

    public boolean f() {
        return this.f11159b == 1;
    }

    public boolean g() {
        return this.f11159b == 2;
    }

    public int hashCode() {
        return ((((this.f11158a.hashCode() ^ 1000003) * 1000003) ^ this.f11159b) * 1000003) ^ this.f11160c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f11158a);
        sb.append(", type=");
        int i3 = this.f11159b;
        sb.append(i3 == 1 ? "required" : i3 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f11160c));
        sb.append("}");
        return sb.toString();
    }

    private r(F f3, int i3, int i4) {
        this.f11158a = (F) E.c(f3, "Null dependency anInterface.");
        this.f11159b = i3;
        this.f11160c = i4;
    }
}
