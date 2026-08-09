package D0;

import D0.q;

/* JADX INFO: loaded from: classes.dex */
final class b extends q.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f1250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f1251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1252e;

    b(w wVar, l lVar, int i3) {
        if (wVar == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f1250c = wVar;
        if (lVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f1251d = lVar;
        this.f1252e = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.a)) {
            return false;
        }
        q.a aVar = (q.a) obj;
        return this.f1250c.equals(aVar.l()) && this.f1251d.equals(aVar.j()) && this.f1252e == aVar.k();
    }

    public int hashCode() {
        return ((((this.f1250c.hashCode() ^ 1000003) * 1000003) ^ this.f1251d.hashCode()) * 1000003) ^ this.f1252e;
    }

    @Override // D0.q.a
    public l j() {
        return this.f1251d;
    }

    @Override // D0.q.a
    public int k() {
        return this.f1252e;
    }

    @Override // D0.q.a
    public w l() {
        return this.f1250c;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.f1250c + ", documentKey=" + this.f1251d + ", largestBatchId=" + this.f1252e + "}";
    }
}
