package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0829j;
import y1.c0;

/* JADX INFO: loaded from: classes.dex */
abstract class N extends y1.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.c0 f8641a;

    N(y1.c0 c0Var) {
        AbstractC0829j.o(c0Var, "delegate can not be null");
        this.f8641a = c0Var;
    }

    @Override // y1.c0
    public String a() {
        return this.f8641a.a();
    }

    @Override // y1.c0
    public void b() {
        this.f8641a.b();
    }

    @Override // y1.c0
    public void c() {
        this.f8641a.c();
    }

    @Override // y1.c0
    public void d(c0.d dVar) {
        this.f8641a.d(dVar);
    }

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", this.f8641a).toString();
    }
}
