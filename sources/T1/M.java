package t1;

import J1.AbstractC0412p;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f11367g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f11373f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final M a(List list) {
            kotlin.jvm.internal.m.e(list, "list");
            return new M((String) list.get(0), (String) list.get(1), (String) list.get(2), (String) list.get(3), (String) list.get(4), (Map) list.get(5));
        }
    }

    public M(String str, String str2, String str3, String str4, String str5, Map map) {
        this.f11368a = str;
        this.f11369b = str2;
        this.f11370c = str3;
        this.f11371d = str4;
        this.f11372e = str5;
        this.f11373f = map;
    }

    public final String a() {
        return this.f11368a;
    }

    public final String b() {
        return this.f11369b;
    }

    public final String c() {
        return this.f11370c;
    }

    public final String d() {
        return this.f11371d;
    }

    public final String e() {
        return this.f11372e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m3 = (M) obj;
        return kotlin.jvm.internal.m.a(this.f11368a, m3.f11368a) && kotlin.jvm.internal.m.a(this.f11369b, m3.f11369b) && kotlin.jvm.internal.m.a(this.f11370c, m3.f11370c) && kotlin.jvm.internal.m.a(this.f11371d, m3.f11371d) && kotlin.jvm.internal.m.a(this.f11372e, m3.f11372e) && kotlin.jvm.internal.m.a(this.f11373f, m3.f11373f);
    }

    public final Map f() {
        return this.f11373f;
    }

    public final List g() {
        return AbstractC0412p.j(this.f11368a, this.f11369b, this.f11370c, this.f11371d, this.f11372e, this.f11373f);
    }

    public int hashCode() {
        String str = this.f11368a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11369b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11370c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11371d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11372e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.f11373f;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "PigeonSettableMetadata(cacheControl=" + this.f11368a + ", contentDisposition=" + this.f11369b + ", contentEncoding=" + this.f11370c + ", contentLanguage=" + this.f11371d + ", contentType=" + this.f11372e + ", customMetadata=" + this.f11373f + ")";
    }
}
