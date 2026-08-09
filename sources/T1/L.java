package t1;

import J1.AbstractC0412p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11363d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f11366c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final L a(List list) {
            kotlin.jvm.internal.m.e(list, "list");
            Object obj = list.get(0);
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.firebase.storage.PigeonStorageReference?>");
            String str = (String) list.get(1);
            Object obj2 = list.get(2);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.firebase.storage.PigeonStorageReference?>");
            return new L((List) obj, str, (List) obj2);
        }
    }

    public L(List items, String str, List prefixs) {
        kotlin.jvm.internal.m.e(items, "items");
        kotlin.jvm.internal.m.e(prefixs, "prefixs");
        this.f11364a = items;
        this.f11365b = str;
        this.f11366c = prefixs;
    }

    public final List a() {
        return AbstractC0412p.j(this.f11364a, this.f11365b, this.f11366c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l3 = (L) obj;
        return kotlin.jvm.internal.m.a(this.f11364a, l3.f11364a) && kotlin.jvm.internal.m.a(this.f11365b, l3.f11365b) && kotlin.jvm.internal.m.a(this.f11366c, l3.f11366c);
    }

    public int hashCode() {
        int iHashCode = this.f11364a.hashCode() * 31;
        String str = this.f11365b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f11366c.hashCode();
    }

    public String toString() {
        return "PigeonListResult(items=" + this.f11364a + ", pageToken=" + this.f11365b + ", prefixs=" + this.f11366c + ")";
    }
}
