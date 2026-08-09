package j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f9375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9376b;

    public f(float f3, float f4) {
        this.f9375a = e.a(f3, "width");
        this.f9376b = e.a(f4, "height");
    }

    public float a() {
        return this.f9376b;
    }

    public float b() {
        return this.f9375a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f9375a == this.f9375a && fVar.f9376b == this.f9376b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f9375a) ^ Float.floatToIntBits(this.f9376b);
    }

    public String toString() {
        return this.f9375a + "x" + this.f9376b;
    }
}
