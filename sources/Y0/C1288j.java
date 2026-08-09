package y0;

/* JADX INFO: renamed from: y0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1288j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1288j f11750b = new C1288j(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11751a;

    public C1288j(String str) {
        this.f11751a = str;
    }

    public String a() {
        return this.f11751a;
    }

    public boolean b() {
        return this.f11751a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1288j.class != obj.getClass()) {
            return false;
        }
        String str = this.f11751a;
        String str2 = ((C1288j) obj).f11751a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f11751a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "User(uid:" + this.f11751a + ")";
    }
}
