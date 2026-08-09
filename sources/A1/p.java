package A1;

import io.grpc.internal.W0;

/* JADX INFO: loaded from: classes.dex */
class p implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m2.d f520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f522c;

    p(m2.d dVar, int i3) {
        this.f520a = dVar;
        this.f521b = i3;
    }

    @Override // io.grpc.internal.W0
    public int a() {
        return this.f522c;
    }

    @Override // io.grpc.internal.W0
    public void b(byte[] bArr, int i3, int i4) {
        this.f520a.h0(bArr, i3, i4);
        this.f521b -= i4;
        this.f522c += i4;
    }

    @Override // io.grpc.internal.W0
    public int c() {
        return this.f521b;
    }

    @Override // io.grpc.internal.W0
    public void d(byte b3) {
        this.f520a.v(b3);
        this.f521b--;
        this.f522c++;
    }

    m2.d e() {
        return this.f520a;
    }

    @Override // io.grpc.internal.W0
    public void release() {
    }
}
