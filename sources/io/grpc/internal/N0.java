package io.grpc.internal;

import io.grpc.internal.M0;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements InterfaceC0964q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.d f8642a;

    private N0(M0.d dVar) {
        this.f8642a = dVar;
    }

    public static N0 c(M0.d dVar) {
        return new N0(dVar);
    }

    @Override // io.grpc.internal.InterfaceC0964q0
    public Object a() {
        return M0.d(this.f8642a);
    }

    @Override // io.grpc.internal.InterfaceC0964q0
    public Object b(Object obj) {
        M0.f(this.f8642a, obj);
        return null;
    }
}
