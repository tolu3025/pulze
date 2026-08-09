package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractRunnableC0978y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.r f9372a;

    protected AbstractRunnableC0978y(y1.r rVar) {
        this.f9372a = rVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        y1.r rVarB = this.f9372a.b();
        try {
            a();
        } finally {
            this.f9372a.f(rVarB);
        }
    }
}
