package F0;

import com.google.firebase.firestore.V0;

/* JADX INFO: renamed from: F0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303g extends K {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC0315t f1478e;

    public C0303g(String alias, AbstractC0315t expr) {
        kotlin.jvm.internal.m.e(alias, "alias");
        kotlin.jvm.internal.m.e(expr, "expr");
        this.f1477d = alias;
        this.f1478e = expr;
    }

    @Override // F0.K
    public String B0() {
        return this.f1477d;
    }

    @Override // F0.K
    public AbstractC0315t C0() {
        return this.f1478e;
    }

    @Override // F0.AbstractC0315t
    public U1.l S(G0.Q context) {
        kotlin.jvm.internal.m.e(context, "context");
        return C0().S(context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0303g)) {
            return false;
        }
        C0303g c0303g = (C0303g) obj;
        return kotlin.jvm.internal.m.a(B0(), c0303g.B0()) && kotlin.jvm.internal.m.a(C0(), c0303g.C0());
    }

    public int hashCode() {
        return (B0().hashCode() * 31) + C0().hashCode();
    }

    @Override // F0.AbstractC0315t
    public V0.I w0(V0 userDataReader) {
        kotlin.jvm.internal.m.e(userDataReader, "userDataReader");
        return C0().w0(userDataReader);
    }

    @Override // F0.AbstractC0315t
    public String x() {
        return C0().x();
    }
}
