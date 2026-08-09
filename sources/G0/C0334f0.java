package G0;

/* JADX INFO: renamed from: G0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0334f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1821a;

    public C0334f0(long j3) {
        this.f1821a = j3;
    }

    public final long a() {
        return this.f1821a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0334f0) && this.f1821a == ((C0334f0) obj).f1821a;
    }

    public int hashCode() {
        return AbstractC0332e0.a(this.f1821a);
    }

    public String toString() {
        return "LongValue(value=" + this.f1821a + ')';
    }
}
