package w1;

import J1.AbstractC0411o;
import java.util.List;

/* JADX INFO: renamed from: w1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1263C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11562b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11563a;

    /* JADX INFO: renamed from: w1.C$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final C1263C a(List list) {
            kotlin.jvm.internal.m.e(list, "list");
            return new C1263C((String) list.get(0));
        }
    }

    public C1263C(String str) {
        this.f11563a = str;
    }

    public final List a() {
        return AbstractC0411o.d(this.f11563a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1263C) && kotlin.jvm.internal.m.a(this.f11563a, ((C1263C) obj).f11563a);
    }

    public int hashCode() {
        String str = this.f11563a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "SharedPreferencesPigeonOptions(fileKey=" + this.f11563a + ')';
    }
}
