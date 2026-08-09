package y1;

import e0.AbstractC0829j;

/* JADX INFO: renamed from: y1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1314q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1313p f12042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f12043b;

    private C1314q(EnumC1313p enumC1313p, l0 l0Var) {
        this.f12042a = (EnumC1313p) AbstractC0829j.o(enumC1313p, "state is null");
        this.f12043b = (l0) AbstractC0829j.o(l0Var, "status is null");
    }

    public static C1314q a(EnumC1313p enumC1313p) {
        AbstractC0829j.e(enumC1313p != EnumC1313p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C1314q(enumC1313p, l0.f11960e);
    }

    public static C1314q b(l0 l0Var) {
        AbstractC0829j.e(!l0Var.o(), "The error status must not be OK");
        return new C1314q(EnumC1313p.TRANSIENT_FAILURE, l0Var);
    }

    public EnumC1313p c() {
        return this.f12042a;
    }

    public l0 d() {
        return this.f12043b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1314q)) {
            return false;
        }
        C1314q c1314q = (C1314q) obj;
        return this.f12042a.equals(c1314q.f12042a) && this.f12043b.equals(c1314q.f12043b);
    }

    public int hashCode() {
        return this.f12042a.hashCode() ^ this.f12043b.hashCode();
    }

    public String toString() {
        if (this.f12043b.o()) {
            return this.f12042a.toString();
        }
        return this.f12042a + "(" + this.f12043b + ")";
    }
}
