package C1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m2.g f1156d = m2.g.g(":status");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m2.g f1157e = m2.g.g(":method");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m2.g f1158f = m2.g.g(":path");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m2.g f1159g = m2.g.g(":scheme");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m2.g f1160h = m2.g.g(":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m2.g f1161i = m2.g.g(":host");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m2.g f1162j = m2.g.g(":version");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.g f1163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2.g f1164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f1165c;

    public d(String str, String str2) {
        this(m2.g.g(str), m2.g.g(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1163a.equals(dVar.f1163a) && this.f1164b.equals(dVar.f1164b);
    }

    public int hashCode() {
        return ((527 + this.f1163a.hashCode()) * 31) + this.f1164b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f1163a.y(), this.f1164b.y());
    }

    public d(m2.g gVar, String str) {
        this(gVar, m2.g.g(str));
    }

    public d(m2.g gVar, m2.g gVar2) {
        this.f1163a = gVar;
        this.f1164b = gVar2;
        this.f1165c = gVar.u() + 32 + gVar2.u();
    }
}
