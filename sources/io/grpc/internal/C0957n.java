package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0957n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f9204f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S0 f9205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0942f0 f9206b = AbstractC0944g0.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0942f0 f9207c = AbstractC0944g0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0942f0 f9208d = AbstractC0944g0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f9209e;

    /* JADX INFO: renamed from: io.grpc.internal.n$a */
    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.C0957n.b
        public C0957n a() {
            return new C0957n(S0.f8694a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.n$b */
    public interface b {
        C0957n a();
    }

    C0957n(S0 s02) {
        this.f9205a = s02;
    }

    public void a(boolean z2) {
        (z2 ? this.f9207c : this.f9208d).a(1L);
    }

    public void b() {
        this.f9206b.a(1L);
        this.f9209e = this.f9205a.a();
    }
}
