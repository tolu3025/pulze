package k0;

/* JADX INFO: renamed from: k0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0987a extends AbstractC1003q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f9447c;

    C0987a(long j3, long j4, long j5) {
        this.f9445a = j3;
        this.f9446b = j4;
        this.f9447c = j5;
    }

    @Override // k0.AbstractC1003q
    public long b() {
        return this.f9446b;
    }

    @Override // k0.AbstractC1003q
    public long c() {
        return this.f9445a;
    }

    @Override // k0.AbstractC1003q
    public long d() {
        return this.f9447c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1003q)) {
            return false;
        }
        AbstractC1003q abstractC1003q = (AbstractC1003q) obj;
        return this.f9445a == abstractC1003q.c() && this.f9446b == abstractC1003q.b() && this.f9447c == abstractC1003q.d();
    }

    public int hashCode() {
        long j3 = this.f9445a;
        long j4 = this.f9446b;
        int i3 = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f9447c;
        return i3 ^ ((int) ((j5 >>> 32) ^ j5));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f9445a + ", elapsedRealtime=" + this.f9446b + ", uptimeMillis=" + this.f9447c + "}";
    }
}
