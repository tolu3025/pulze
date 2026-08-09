package z0;

import D0.l;
import D0.w;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f12094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f12095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f12097d;

    public h(l lVar, w wVar, boolean z2, List list) {
        this.f12094a = lVar;
        this.f12095b = wVar;
        this.f12096c = z2;
        this.f12097d = list;
    }

    public boolean a() {
        return this.f12096c;
    }

    public l b() {
        return this.f12094a;
    }

    public List c() {
        return this.f12097d;
    }

    public w d() {
        return this.f12095b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f12096c == hVar.f12096c && this.f12094a.equals(hVar.f12094a) && this.f12095b.equals(hVar.f12095b)) {
            return this.f12097d.equals(hVar.f12097d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f12094a.hashCode() * 31) + this.f12095b.hashCode()) * 31) + (this.f12096c ? 1 : 0)) * 31) + this.f12097d.hashCode();
    }
}
