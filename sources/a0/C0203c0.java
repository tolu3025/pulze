package A0;

/* JADX INFO: renamed from: A0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0203c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final D0.r f111b;

    /* JADX INFO: renamed from: A0.c0$a */
    public enum a {
        ASCENDING(1),
        DESCENDING(-1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f115a;

        a(int i3) {
            this.f115a = i3;
        }

        int e() {
            return this.f115a;
        }
    }

    private C0203c0(a aVar, D0.r rVar) {
        this.f110a = aVar;
        this.f111b = rVar;
    }

    public static C0203c0 d(a aVar, D0.r rVar) {
        return new C0203c0(aVar, rVar);
    }

    int a(D0.i iVar, D0.i iVar2) {
        int iE;
        int iJ;
        if (this.f111b.equals(D0.r.f1277b)) {
            iE = this.f110a.e();
            iJ = iVar.getKey().compareTo(iVar2.getKey());
        } else {
            V0.I iE2 = iVar.e(this.f111b);
            V0.I iE3 = iVar2.e(this.f111b);
            iE = this.f110a.e();
            iJ = D0.z.j(iE2, iE3);
        }
        return iE * iJ;
    }

    public a b() {
        return this.f110a;
    }

    public D0.r c() {
        return this.f111b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0203c0)) {
            return false;
        }
        C0203c0 c0203c0 = (C0203c0) obj;
        return this.f110a == c0203c0.f110a && this.f111b.equals(c0203c0.f111b);
    }

    public int hashCode() {
        return ((899 + this.f110a.hashCode()) * 31) + this.f111b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f110a == a.ASCENDING ? "" : "-");
        sb.append(this.f111b.n());
        return sb.toString();
    }
}
