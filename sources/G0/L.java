package G0;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f1681a;

    public L(double d3) {
        this.f1681a = d3;
    }

    public final double a() {
        return this.f1681a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && Double.compare(this.f1681a, ((L) obj).f1681a) == 0;
    }

    public int hashCode() {
        return K.a(this.f1681a);
    }

    public String toString() {
        return "DoubleValue(value=" + this.f1681a + ')';
    }
}
