package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
class x0 extends v0 {
    x0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public w0 g(Object obj) {
        return ((AbstractC0806y) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(w0 w0Var) {
        return w0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(w0 w0Var) {
        return w0Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public w0 k(w0 w0Var, w0 w0Var2) {
        return w0.c().equals(w0Var2) ? w0Var : w0.c().equals(w0Var) ? w0.j(w0Var, w0Var2) : w0Var.i(w0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public w0 n() {
        return w0.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, w0 w0Var) {
        p(obj, w0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, w0 w0Var) {
        ((AbstractC0806y) obj).unknownFields = w0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public w0 r(w0 w0Var) {
        w0Var.h();
        return w0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(w0 w0Var, C0 c02) {
        w0Var.p(c02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(w0 w0Var, C0 c02) {
        w0Var.r(c02);
    }

    @Override // com.google.protobuf.v0
    void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.protobuf.v0
    boolean q(l0 l0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(w0 w0Var, int i3, int i4) {
        w0Var.n(B0.c(i3, 5), Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(w0 w0Var, int i3, long j3) {
        w0Var.n(B0.c(i3, 1), Long.valueOf(j3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(w0 w0Var, int i3, w0 w0Var2) {
        w0Var.n(B0.c(i3, 3), w0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(w0 w0Var, int i3, AbstractC0791i abstractC0791i) {
        w0Var.n(B0.c(i3, 2), abstractC0791i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(w0 w0Var, int i3, long j3) {
        w0Var.n(B0.c(i3, 0), Long.valueOf(j3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public w0 f(Object obj) {
        w0 w0VarG = g(obj);
        if (w0VarG != w0.c()) {
            return w0VarG;
        }
        w0 w0VarK = w0.k();
        p(obj, w0VarK);
        return w0VarK;
    }
}
