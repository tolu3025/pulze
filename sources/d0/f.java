package D0;

import J0.AbstractC0386b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f1258c = e("", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1260b;

    private f(String str, String str2) {
        this.f1259a = str;
        this.f1260b = str2;
    }

    public static f e(String str, String str2) {
        return new f(str, str2);
    }

    public static f g(String str) {
        u uVarB = u.B(str);
        AbstractC0386b.d(uVarB.w() > 3 && uVarB.t(0).equals("projects") && uVarB.t(2).equals("databases"), "Tried to parse an invalid resource name: %s", uVarB);
        return new f(uVarB.t(1), uVarB.t(3));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int iCompareTo = this.f1259a.compareTo(fVar.f1259a);
        return iCompareTo != 0 ? iCompareTo : this.f1260b.compareTo(fVar.f1260b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1259a.equals(fVar.f1259a) && this.f1260b.equals(fVar.f1260b);
    }

    public String h() {
        return this.f1260b;
    }

    public int hashCode() {
        return (this.f1259a.hashCode() * 31) + this.f1260b.hashCode();
    }

    public String i() {
        return this.f1259a;
    }

    public String toString() {
        return "DatabaseId(" + this.f1259a + ", " + this.f1260b + ")";
    }
}
