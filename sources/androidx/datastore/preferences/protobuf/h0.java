package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class h0 extends f0 {
    h0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public g0 g(Object obj) {
        return ((AbstractC0505t) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(g0 g0Var) {
        return g0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(g0 g0Var) {
        return g0Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public g0 k(g0 g0Var, g0 g0Var2) {
        return g0.c().equals(g0Var2) ? g0Var : g0.c().equals(g0Var) ? g0.j(g0Var, g0Var2) : g0Var.i(g0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public g0 n() {
        return g0.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, g0 g0Var) {
        p(obj, g0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, g0 g0Var) {
        ((AbstractC0505t) obj).unknownFields = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public g0 r(g0 g0Var) {
        g0Var.h();
        return g0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(g0 g0Var, l0 l0Var) {
        g0Var.p(l0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(g0 g0Var, l0 l0Var) {
        g0Var.r(l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    boolean q(X x2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(g0 g0Var, int i3, int i4) {
        g0Var.n(k0.c(i3, 5), Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(g0 g0Var, int i3, long j3) {
        g0Var.n(k0.c(i3, 1), Long.valueOf(j3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(g0 g0Var, int i3, g0 g0Var2) {
        g0Var.n(k0.c(i3, 3), g0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(g0 g0Var, int i3, AbstractC0492f abstractC0492f) {
        g0Var.n(k0.c(i3, 2), abstractC0492f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(g0 g0Var, int i3, long j3) {
        g0Var.n(k0.c(i3, 0), Long.valueOf(j3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public g0 f(Object obj) {
        g0 g0VarG = g(obj);
        if (g0VarG != g0.c()) {
            return g0VarG;
        }
        g0 g0VarK = g0.k();
        p(obj, g0VarK);
        return g0VarK;
    }
}
