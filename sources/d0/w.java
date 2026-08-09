package D0;

import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f1302b = new w(new C1004r(0, 0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1004r f1303a;

    public w(C1004r c1004r) {
        this.f1303a = c1004r;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(w wVar) {
        return this.f1303a.compareTo(wVar.f1303a);
    }

    public C1004r e() {
        return this.f1303a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof w) && compareTo((w) obj) == 0;
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f1303a.l() + ", nanos=" + this.f1303a.i() + ")";
    }
}
