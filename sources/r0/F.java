package r0;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f11101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f11102b;

    private @interface a {
    }

    public F(Class cls, Class cls2) {
        this.f11101a = cls;
        this.f11102b = cls2;
    }

    public static F a(Class cls, Class cls2) {
        return new F(cls, cls2);
    }

    public static F b(Class cls) {
        return new F(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f3 = (F) obj;
        if (this.f11102b.equals(f3.f11102b)) {
            return this.f11101a.equals(f3.f11101a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f11102b.hashCode() * 31) + this.f11101a.hashCode();
    }

    public String toString() {
        if (this.f11101a == a.class) {
            return this.f11102b.getName();
        }
        return "@" + this.f11101a.getName() + " " + this.f11102b.getName();
    }
}
