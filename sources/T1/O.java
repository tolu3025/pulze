package t1;

import J1.AbstractC0412p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11378d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11381c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final O a(List list) {
            kotlin.jvm.internal.m.e(list, "list");
            Object obj = list.get(0);
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(2);
            kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.String");
            return new O((String) obj, (String) obj2, (String) obj3);
        }
    }

    public O(String bucket, String fullPath, String name) {
        kotlin.jvm.internal.m.e(bucket, "bucket");
        kotlin.jvm.internal.m.e(fullPath, "fullPath");
        kotlin.jvm.internal.m.e(name, "name");
        this.f11379a = bucket;
        this.f11380b = fullPath;
        this.f11381c = name;
    }

    public final String a() {
        return this.f11380b;
    }

    public final List b() {
        return AbstractC0412p.j(this.f11379a, this.f11380b, this.f11381c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o2 = (O) obj;
        return kotlin.jvm.internal.m.a(this.f11379a, o2.f11379a) && kotlin.jvm.internal.m.a(this.f11380b, o2.f11380b) && kotlin.jvm.internal.m.a(this.f11381c, o2.f11381c);
    }

    public int hashCode() {
        return (((this.f11379a.hashCode() * 31) + this.f11380b.hashCode()) * 31) + this.f11381c.hashCode();
    }

    public String toString() {
        return "PigeonStorageReference(bucket=" + this.f11379a + ", fullPath=" + this.f11380b + ", name=" + this.f11381c + ")";
    }
}
