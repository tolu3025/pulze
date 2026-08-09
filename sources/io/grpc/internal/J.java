package io.grpc.internal;

import e0.AbstractC0825f;
import io.grpc.internal.InterfaceC0966s;
import io.grpc.internal.R0;

/* JADX INFO: loaded from: classes.dex */
abstract class J implements InterfaceC0966s {
    J() {
    }

    @Override // io.grpc.internal.R0
    public void a(R0.a aVar) {
        e().a(aVar);
    }

    @Override // io.grpc.internal.R0
    public void b() {
        e().b();
    }

    @Override // io.grpc.internal.InterfaceC0966s
    public void c(y1.l0 l0Var, InterfaceC0966s.a aVar, y1.Z z2) {
        e().c(l0Var, aVar, z2);
    }

    @Override // io.grpc.internal.InterfaceC0966s
    public void d(y1.Z z2) {
        e().d(z2);
    }

    protected abstract InterfaceC0966s e();

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", e()).toString();
    }
}
