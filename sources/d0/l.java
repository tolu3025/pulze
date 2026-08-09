package D0;

import J0.AbstractC0386b;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f1263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t0.e f1264c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f1265a;

    static {
        Comparator comparator = new Comparator() { // from class: D0.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((l) obj).compareTo((l) obj2);
            }
        };
        f1263b = comparator;
        f1264c = new t0.e(Collections.emptyList(), comparator);
    }

    private l(u uVar) {
        AbstractC0386b.d(r(uVar), "Not a document key path: %s", uVar);
        this.f1265a = uVar;
    }

    public static Comparator c() {
        return f1263b;
    }

    public static l g() {
        return l(Collections.emptyList());
    }

    public static t0.e h() {
        return f1264c;
    }

    public static l i(String str) {
        u uVarB = u.B(str);
        AbstractC0386b.d(uVarB.w() > 4 && uVarB.t(0).equals("projects") && uVarB.t(2).equals("databases") && uVarB.t(4).equals("documents"), "Tried to parse an invalid key: %s", uVarB);
        return j((u) uVarB.x(5));
    }

    public static l j(u uVar) {
        return new l(uVar);
    }

    public static l k(String str) {
        return new l(u.B(str));
    }

    public static l l(List list) {
        return new l(u.A(list));
    }

    public static boolean r(u uVar) {
        return uVar.w() % 2 == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        return this.f1265a.compareTo(lVar.f1265a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f1265a.equals(((l) obj).f1265a);
    }

    public int hashCode() {
        return this.f1265a.hashCode();
    }

    public String m() {
        return this.f1265a.t(r0.w() - 2);
    }

    public u n() {
        return (u) this.f1265a.y();
    }

    public String o() {
        return this.f1265a.s();
    }

    public u p() {
        return this.f1265a;
    }

    public boolean q(String str) {
        if (this.f1265a.w() >= 2) {
            u uVar = this.f1265a;
            if (((String) uVar.f1257a.get(uVar.w() - 2)).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f1265a.toString();
    }
}
