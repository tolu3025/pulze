package A0;

/* JADX INFO: renamed from: A0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0215m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D0.i f218b;

    /* JADX INFO: renamed from: A0.m$a */
    public enum a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    private C0215m(a aVar, D0.i iVar) {
        this.f217a = aVar;
        this.f218b = iVar;
    }

    public static C0215m a(a aVar, D0.i iVar) {
        return new C0215m(aVar, iVar);
    }

    public D0.i b() {
        return this.f218b;
    }

    public a c() {
        return this.f217a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0215m)) {
            return false;
        }
        C0215m c0215m = (C0215m) obj;
        return this.f217a.equals(c0215m.f217a) && this.f218b.equals(c0215m.f218b);
    }

    public int hashCode() {
        return ((((1891 + this.f217a.hashCode()) * 31) + this.f218b.getKey().hashCode()) * 31) + this.f218b.b().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.f218b + "," + this.f217a + ")";
    }
}
