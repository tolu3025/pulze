package io.grpc.internal;

import e0.AbstractC0825f;
import io.grpc.internal.InterfaceC0954l0;
import io.grpc.internal.InterfaceC0968t;
import java.util.concurrent.Executor;
import y1.AbstractC1308k;
import y1.C1298a;
import y1.C1300c;

/* JADX INFO: loaded from: classes.dex */
abstract class K implements InterfaceC0974w {
    K() {
    }

    protected abstract InterfaceC0974w a();

    @Override // io.grpc.internal.InterfaceC0968t
    public r b(y1.a0 a0Var, y1.Z z2, C1300c c1300c, AbstractC1308k[] abstractC1308kArr) {
        return a().b(a0Var, z2, c1300c, abstractC1308kArr);
    }

    @Override // io.grpc.internal.InterfaceC0954l0
    public Runnable c(InterfaceC0954l0.a aVar) {
        return a().c(aVar);
    }

    @Override // io.grpc.internal.InterfaceC0954l0
    public void d(y1.l0 l0Var) {
        a().d(l0Var);
    }

    @Override // io.grpc.internal.InterfaceC0974w
    public C1298a f() {
        return a().f();
    }

    @Override // y1.P
    public y1.K g() {
        return a().g();
    }

    @Override // io.grpc.internal.InterfaceC0968t
    public void h(InterfaceC0968t.a aVar, Executor executor) {
        a().h(aVar, executor);
    }

    @Override // io.grpc.internal.InterfaceC0954l0
    public void i(y1.l0 l0Var) {
        a().i(l0Var);
    }

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", a()).toString();
    }
}
