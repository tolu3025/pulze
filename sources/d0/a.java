package D0;

import D0.q;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f1248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q.b f1249f;

    a(int i3, String str, List list, q.b bVar) {
        this.f1246c = i3;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.f1247d = str;
        if (list == null) {
            throw new NullPointerException("Null segments");
        }
        this.f1248e = list;
        if (bVar == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f1249f = bVar;
    }

    @Override // D0.q
    public String d() {
        return this.f1247d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f1246c == qVar.f() && this.f1247d.equals(qVar.d()) && this.f1248e.equals(qVar.h()) && this.f1249f.equals(qVar.g());
    }

    @Override // D0.q
    public int f() {
        return this.f1246c;
    }

    @Override // D0.q
    public q.b g() {
        return this.f1249f;
    }

    @Override // D0.q
    public List h() {
        return this.f1248e;
    }

    public int hashCode() {
        return ((((((this.f1246c ^ 1000003) * 1000003) ^ this.f1247d.hashCode()) * 1000003) ^ this.f1248e.hashCode()) * 1000003) ^ this.f1249f.hashCode();
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.f1246c + ", collectionGroup=" + this.f1247d + ", segments=" + this.f1248e + ", indexState=" + this.f1249f + "}";
    }
}
