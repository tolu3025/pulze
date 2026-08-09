package I0;

import I0.Z;

/* JADX INFO: renamed from: I0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0372m extends Z.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Z.a f2334e;

    C0372m(int i3, int i4, String str, String str2, Z.a aVar) {
        this.f2330a = i3;
        this.f2331b = i4;
        if (str == null) {
            throw new NullPointerException("Null projectId");
        }
        this.f2332c = str;
        if (str2 == null) {
            throw new NullPointerException("Null databaseId");
        }
        this.f2333d = str2;
        this.f2334e = aVar;
    }

    @Override // I0.Z.b
    Z.a a() {
        return this.f2334e;
    }

    @Override // I0.Z.b
    String c() {
        return this.f2333d;
    }

    @Override // I0.Z.b
    int d() {
        return this.f2331b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z.b)) {
            return false;
        }
        Z.b bVar = (Z.b) obj;
        if (this.f2330a == bVar.f() && this.f2331b == bVar.d() && this.f2332c.equals(bVar.g()) && this.f2333d.equals(bVar.c())) {
            Z.a aVar = this.f2334e;
            Z.a aVarA = bVar.a();
            if (aVar == null) {
                if (aVarA == null) {
                    return true;
                }
            } else if (aVar.equals(aVarA)) {
                return true;
            }
        }
        return false;
    }

    @Override // I0.Z.b
    int f() {
        return this.f2330a;
    }

    @Override // I0.Z.b
    String g() {
        return this.f2332c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f2330a ^ 1000003) * 1000003) ^ this.f2331b) * 1000003) ^ this.f2332c.hashCode()) * 1000003) ^ this.f2333d.hashCode()) * 1000003;
        Z.a aVar = this.f2334e;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "ExistenceFilterMismatchInfo{localCacheCount=" + this.f2330a + ", existenceFilterCount=" + this.f2331b + ", projectId=" + this.f2332c + ", databaseId=" + this.f2333d + ", bloomFilter=" + this.f2334e + "}";
    }
}
