package E0;

/* JADX INFO: loaded from: classes.dex */
final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f1382b;

    b(int i3, f fVar) {
        this.f1381a = i3;
        if (fVar == null) {
            throw new NullPointerException("Null mutation");
        }
        this.f1382b = fVar;
    }

    @Override // E0.k
    public int c() {
        return this.f1381a;
    }

    @Override // E0.k
    public f d() {
        return this.f1382b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1381a == kVar.c() && this.f1382b.equals(kVar.d());
    }

    public int hashCode() {
        return ((this.f1381a ^ 1000003) * 1000003) ^ this.f1382b.hashCode();
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.f1381a + ", mutation=" + this.f1382b + "}";
    }
}
