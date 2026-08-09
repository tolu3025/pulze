package A0;

/* JADX INFO: renamed from: A0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0214l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.f f204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f207d;

    public C0214l(D0.f fVar, String str, String str2, boolean z2) {
        this.f204a = fVar;
        this.f205b = str;
        this.f206c = str2;
        this.f207d = z2;
    }

    public D0.f a() {
        return this.f204a;
    }

    public String b() {
        return this.f206c;
    }

    public String c() {
        return this.f205b;
    }

    public boolean d() {
        return this.f207d;
    }

    public String toString() {
        return "DatabaseInfo(databaseId:" + this.f204a + " host:" + this.f206c + ")";
    }
}
