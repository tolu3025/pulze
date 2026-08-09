package D0;

import D0.q;

/* JADX INFO: loaded from: classes.dex */
final class d extends q.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f1255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q.c.a f1256b;

    d(r rVar, q.c.a aVar) {
        if (rVar == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.f1255a = rVar;
        if (aVar == null) {
            throw new NullPointerException("Null kind");
        }
        this.f1256b = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.c)) {
            return false;
        }
        q.c cVar = (q.c) obj;
        return this.f1255a.equals(cVar.g()) && this.f1256b.equals(cVar.h());
    }

    @Override // D0.q.c
    public r g() {
        return this.f1255a;
    }

    @Override // D0.q.c
    public q.c.a h() {
        return this.f1256b;
    }

    public int hashCode() {
        return ((this.f1255a.hashCode() ^ 1000003) * 1000003) ^ this.f1256b.hashCode();
    }

    public String toString() {
        return "Segment{fieldPath=" + this.f1255a + ", kind=" + this.f1256b + "}";
    }
}
