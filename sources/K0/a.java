package K0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f2578b;

    a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f2577a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f2578b = list;
    }

    @Override // K0.x
    public List b() {
        return this.f2578b;
    }

    @Override // K0.x
    public String c() {
        return this.f2577a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f2577a.equals(xVar.c()) && this.f2578b.equals(xVar.b());
    }

    public int hashCode() {
        return ((this.f2577a.hashCode() ^ 1000003) * 1000003) ^ this.f2578b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f2577a + ", usedDates=" + this.f2578b + "}";
    }
}
