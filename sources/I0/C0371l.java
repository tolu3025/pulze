package I0;

import I0.Z;

/* JADX INFO: renamed from: I0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0371l extends Z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0373n f2325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2329e;

    C0371l(C0373n c0373n, boolean z2, int i3, int i4, int i5) {
        this.f2325a = c0373n;
        this.f2326b = z2;
        this.f2327c = i3;
        this.f2328d = i4;
        this.f2329e = i5;
    }

    @Override // I0.Z.a
    boolean a() {
        return this.f2326b;
    }

    @Override // I0.Z.a
    int b() {
        return this.f2328d;
    }

    @Override // I0.Z.a
    C0373n c() {
        return this.f2325a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z.a)) {
            return false;
        }
        Z.a aVar = (Z.a) obj;
        C0373n c0373n = this.f2325a;
        if (c0373n != null ? c0373n.equals(aVar.c()) : aVar.c() == null) {
            if (this.f2326b == aVar.a() && this.f2327c == aVar.f() && this.f2328d == aVar.b() && this.f2329e == aVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // I0.Z.a
    int f() {
        return this.f2327c;
    }

    @Override // I0.Z.a
    int g() {
        return this.f2329e;
    }

    public int hashCode() {
        C0373n c0373n = this.f2325a;
        return (((((((((c0373n == null ? 0 : c0373n.hashCode()) ^ 1000003) * 1000003) ^ (this.f2326b ? 1231 : 1237)) * 1000003) ^ this.f2327c) * 1000003) ^ this.f2328d) * 1000003) ^ this.f2329e;
    }

    public String toString() {
        return "ExistenceFilterBloomFilterInfo{bloomFilter=" + this.f2325a + ", applied=" + this.f2326b + ", hashCount=" + this.f2327c + ", bitmapLength=" + this.f2328d + ", padding=" + this.f2329e + "}";
    }
}
