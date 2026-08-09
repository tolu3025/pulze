package t1;

import G0.AbstractC0332e0;
import J1.AbstractC0412p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11360c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11362b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final K a(List list) {
            long jLongValue;
            kotlin.jvm.internal.m.e(list, "list");
            Object obj = list.get(0);
            if (obj instanceof Integer) {
                jLongValue = ((Number) obj).intValue();
            } else {
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Long");
                jLongValue = ((Long) obj).longValue();
            }
            return new K(jLongValue, (String) list.get(1));
        }
    }

    public K(long j3, String str) {
        this.f11361a = j3;
        this.f11362b = str;
    }

    public final long a() {
        return this.f11361a;
    }

    public final String b() {
        return this.f11362b;
    }

    public final List c() {
        return AbstractC0412p.j(Long.valueOf(this.f11361a), this.f11362b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        return this.f11361a == k3.f11361a && kotlin.jvm.internal.m.a(this.f11362b, k3.f11362b);
    }

    public int hashCode() {
        int iA = AbstractC0332e0.a(this.f11361a) * 31;
        String str = this.f11362b;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PigeonListOptions(maxResults=" + this.f11361a + ", pageToken=" + this.f11362b + ")";
    }
}
