package io.grpc.internal;

import e0.AbstractC0825f;
import java.io.InputStream;
import y1.C1316t;
import y1.C1318v;
import y1.InterfaceC1311n;

/* JADX INFO: loaded from: classes.dex */
abstract class I implements r {
    I() {
    }

    @Override // io.grpc.internal.Q0
    public void a(InterfaceC1311n interfaceC1311n) {
        p().a(interfaceC1311n);
    }

    @Override // io.grpc.internal.Q0
    public void b(int i3) {
        p().b(i3);
    }

    @Override // io.grpc.internal.r
    public void c(int i3) {
        p().c(i3);
    }

    @Override // io.grpc.internal.r
    public void d(y1.l0 l0Var) {
        p().d(l0Var);
    }

    @Override // io.grpc.internal.r
    public void e(int i3) {
        p().e(i3);
    }

    @Override // io.grpc.internal.Q0
    public void flush() {
        p().flush();
    }

    @Override // io.grpc.internal.r
    public void g(InterfaceC0966s interfaceC0966s) {
        p().g(interfaceC0966s);
    }

    @Override // io.grpc.internal.r
    public void h(C1318v c1318v) {
        p().h(c1318v);
    }

    @Override // io.grpc.internal.Q0
    public boolean i() {
        return p().i();
    }

    @Override // io.grpc.internal.Q0
    public void j(InputStream inputStream) {
        p().j(inputStream);
    }

    @Override // io.grpc.internal.r
    public void k(String str) {
        p().k(str);
    }

    @Override // io.grpc.internal.r
    public void l(Y y2) {
        p().l(y2);
    }

    @Override // io.grpc.internal.r
    public void m(C1316t c1316t) {
        p().m(c1316t);
    }

    @Override // io.grpc.internal.Q0
    public void n() {
        p().n();
    }

    @Override // io.grpc.internal.r
    public void o() {
        p().o();
    }

    protected abstract r p();

    @Override // io.grpc.internal.r
    public void q(boolean z2) {
        p().q(z2);
    }

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", p()).toString();
    }
}
