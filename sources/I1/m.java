package I1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f2410b;

    public m(Object obj, Object obj2) {
        this.f2409a = obj;
        this.f2410b = obj2;
    }

    public final Object a() {
        return this.f2409a;
    }

    public final Object b() {
        return this.f2410b;
    }

    public final Object c() {
        return this.f2409a;
    }

    public final Object d() {
        return this.f2410b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.f2409a, mVar.f2409a) && kotlin.jvm.internal.m.a(this.f2410b, mVar.f2410b);
    }

    public int hashCode() {
        Object obj = this.f2409a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2410b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f2409a + ", " + this.f2410b + ')';
    }
}
