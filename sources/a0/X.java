package A0;

/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f94a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D0.l f95b;

    public enum a {
        ADDED,
        REMOVED
    }

    public X(a aVar, D0.l lVar) {
        this.f94a = aVar;
        this.f95b = lVar;
    }

    public D0.l a() {
        return this.f95b;
    }

    public a b() {
        return this.f94a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof X)) {
            return false;
        }
        X x2 = (X) obj;
        return this.f94a.equals(x2.b()) && this.f95b.equals(x2.a());
    }

    public int hashCode() {
        return ((2077 + this.f94a.hashCode()) * 31) + this.f95b.hashCode();
    }
}
