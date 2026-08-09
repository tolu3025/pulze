package D0;

import D0.q;

/* JADX INFO: loaded from: classes.dex */
final class c extends q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q.a f1254b;

    c(long j3, q.a aVar) {
        this.f1253a = j3;
        if (aVar == null) {
            throw new NullPointerException("Null offset");
        }
        this.f1254b = aVar;
    }

    @Override // D0.q.b
    public q.a c() {
        return this.f1254b;
    }

    @Override // D0.q.b
    public long d() {
        return this.f1253a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.b)) {
            return false;
        }
        q.b bVar = (q.b) obj;
        return this.f1253a == bVar.d() && this.f1254b.equals(bVar.c());
    }

    public int hashCode() {
        long j3 = this.f1253a;
        return ((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f1254b.hashCode();
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.f1253a + ", offset=" + this.f1254b + "}";
    }
}
