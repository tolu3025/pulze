package Y0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient n f3330c;

    k(String str, int i3, n nVar) {
        if (str == null) {
            throw new NullPointerException("pattern is null");
        }
        if (nVar == null) {
            throw new NullPointerException("re2 is null");
        }
        this.f3328a = str;
        this.f3329b = i3;
        this.f3330c = nVar;
    }

    public static k a(String str) {
        return b(str, str, 0);
    }

    private static k b(String str, String str2, int i3) {
        return new k(str2, i3, n.a(str, (i3 & 8) != 0 ? 84 : 212, (i3 & 16) != 0));
    }

    public h c(CharSequence charSequence) {
        return new h(this, charSequence);
    }

    public boolean d(String str) {
        return c(str).h();
    }

    n e() {
        return this.f3330c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f3329b == kVar.f3329b && this.f3328a.equals(kVar.f3328a);
    }

    public int hashCode() {
        return (this.f3328a.hashCode() * 31) + this.f3329b;
    }

    public String toString() {
        return this.f3328a;
    }
}
