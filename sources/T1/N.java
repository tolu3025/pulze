package t1;

import J1.AbstractC0412p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11374d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11377c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final N a(List list) {
            kotlin.jvm.internal.m.e(list, "list");
            Object obj = list.get(0);
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) list.get(1);
            Object obj2 = list.get(2);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            return new N((String) obj, str, (String) obj2);
        }
    }

    public N(String appName, String str, String bucket) {
        kotlin.jvm.internal.m.e(appName, "appName");
        kotlin.jvm.internal.m.e(bucket, "bucket");
        this.f11375a = appName;
        this.f11376b = str;
        this.f11377c = bucket;
    }

    public final String a() {
        return this.f11375a;
    }

    public final String b() {
        return this.f11377c;
    }

    public final List c() {
        return AbstractC0412p.j(this.f11375a, this.f11376b, this.f11377c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        return kotlin.jvm.internal.m.a(this.f11375a, n3.f11375a) && kotlin.jvm.internal.m.a(this.f11376b, n3.f11376b) && kotlin.jvm.internal.m.a(this.f11377c, n3.f11377c);
    }

    public int hashCode() {
        int iHashCode = this.f11375a.hashCode() * 31;
        String str = this.f11376b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f11377c.hashCode();
    }

    public String toString() {
        return "PigeonStorageFirebaseApp(appName=" + this.f11375a + ", tenantId=" + this.f11376b + ", bucket=" + this.f11377c + ")";
    }
}
