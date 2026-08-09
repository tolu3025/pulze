package t1;

import J1.AbstractC0411o;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11358b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11359a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final J a(List list) {
            kotlin.jvm.internal.m.e(list, "list");
            return new J((Map) list.get(0));
        }
    }

    public J(Map map) {
        this.f11359a = map;
    }

    public final List a() {
        return AbstractC0411o.d(this.f11359a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && kotlin.jvm.internal.m.a(this.f11359a, ((J) obj).f11359a);
    }

    public int hashCode() {
        Map map = this.f11359a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "PigeonFullMetaData(metadata=" + this.f11359a + ")";
    }
}
