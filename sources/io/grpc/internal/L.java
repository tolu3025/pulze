package io.grpc.internal;

import io.grpc.internal.C0956m0;
import io.grpc.internal.R0;

/* JADX INFO: loaded from: classes.dex */
abstract class L implements C0956m0.b {
    L() {
    }

    @Override // io.grpc.internal.C0956m0.b
    public void a(R0.a aVar) {
        c().a(aVar);
    }

    @Override // io.grpc.internal.C0956m0.b
    public void b(Throwable th) {
        c().b(th);
    }

    protected abstract C0956m0.b c();

    @Override // io.grpc.internal.C0956m0.b
    public void e(boolean z2) {
        c().e(z2);
    }

    @Override // io.grpc.internal.C0956m0.b
    public void f(int i3) {
        c().f(i3);
    }
}
