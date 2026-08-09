package io.grpc.internal;

import e0.AbstractC0829j;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f8734l = new b(S0.f8694a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S0 f8735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f8736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f8740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f8741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f8743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC0942f0 f8744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f8745k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S0 f8746a;

        public b(S0 s02) {
            this.f8746a = s02;
        }

        public V0 a() {
            return new V0(this.f8746a);
        }
    }

    public interface c {
    }

    private V0(S0 s02) {
        this.f8744j = AbstractC0944g0.a();
        this.f8735a = s02;
    }

    public static b a() {
        return f8734l;
    }

    public void b() {
        this.f8740f++;
    }

    public void c() {
        this.f8736b++;
        this.f8737c = this.f8735a.a();
    }

    public void d() {
        this.f8744j.a(1L);
        this.f8745k = this.f8735a.a();
    }

    public void e(int i3) {
        if (i3 == 0) {
            return;
        }
        this.f8742h += (long) i3;
        this.f8743i = this.f8735a.a();
    }

    public void f(boolean z2) {
        if (z2) {
            this.f8738d++;
        } else {
            this.f8739e++;
        }
    }

    public void g(c cVar) {
        this.f8741g = (c) AbstractC0829j.n(cVar);
    }
}
