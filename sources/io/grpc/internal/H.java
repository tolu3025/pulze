package io.grpc.internal;

import e0.AbstractC0829j;
import io.grpc.internal.InterfaceC0966s;
import y1.AbstractC1308k;
import y1.C1300c;

/* JADX INFO: loaded from: classes.dex */
class H implements InterfaceC0968t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y1.l0 f8609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0966s.a f8610b;

    H(y1.l0 l0Var, InterfaceC0966s.a aVar) {
        AbstractC0829j.e(!l0Var.o(), "error must not be OK");
        this.f8609a = l0Var;
        this.f8610b = aVar;
    }

    @Override // io.grpc.internal.InterfaceC0968t
    public r b(y1.a0 a0Var, y1.Z z2, C1300c c1300c, AbstractC1308k[] abstractC1308kArr) {
        return new G(this.f8609a, this.f8610b, abstractC1308kArr);
    }

    @Override // y1.P
    public y1.K g() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
