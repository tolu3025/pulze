package io.grpc.internal;

import io.grpc.internal.C0956m0;
import io.grpc.internal.R0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
final class O0 extends L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0956m0.b f8644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8645b;

    public O0(C0956m0.b bVar) {
        this.f8644a = bVar;
    }

    @Override // io.grpc.internal.L, io.grpc.internal.C0956m0.b
    public void a(R0.a aVar) {
        if (!this.f8645b) {
            super.a(aVar);
        } else if (aVar instanceof Closeable) {
            S.e((Closeable) aVar);
        }
    }

    @Override // io.grpc.internal.L, io.grpc.internal.C0956m0.b
    public void b(Throwable th) {
        this.f8645b = true;
        super.b(th);
    }

    @Override // io.grpc.internal.L
    protected C0956m0.b c() {
        return this.f8644a;
    }

    @Override // io.grpc.internal.L, io.grpc.internal.C0956m0.b
    public void e(boolean z2) {
        this.f8645b = true;
        super.e(z2);
    }
}
