package z0;

import D0.w;

/* JADX INFO: loaded from: classes.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f12082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f12084e;

    public e(String str, int i3, w wVar, int i4, long j3) {
        this.f12080a = str;
        this.f12081b = i3;
        this.f12082c = wVar;
        this.f12083d = i4;
        this.f12084e = j3;
    }

    public String a() {
        return this.f12080a;
    }

    public w b() {
        return this.f12082c;
    }

    public int c() {
        return this.f12081b;
    }

    public long d() {
        return this.f12084e;
    }

    public int e() {
        return this.f12083d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f12081b == eVar.f12081b && this.f12083d == eVar.f12083d && this.f12084e == eVar.f12084e && this.f12080a.equals(eVar.f12080a)) {
            return this.f12082c.equals(eVar.f12082c);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f12080a.hashCode() * 31) + this.f12081b) * 31) + this.f12083d) * 31;
        long j3 = this.f12084e;
        return ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f12082c.hashCode();
    }
}
