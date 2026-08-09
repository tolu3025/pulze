package com.google.android.gms.common.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0644t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0644t f5620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0645u f5621c = new C0645u(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0645u f5622a;

    private C0644t() {
    }

    public static synchronized C0644t b() {
        try {
            if (f5620b == null) {
                f5620b = new C0644t();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5620b;
    }

    public C0645u a() {
        return this.f5622a;
    }

    public final synchronized void c(C0645u c0645u) {
        if (c0645u == null) {
            this.f5622a = f5621c;
            return;
        }
        C0645u c0645u2 = this.f5622a;
        if (c0645u2 == null || c0645u2.w() < c0645u.w()) {
            this.f5622a = c0645u;
        }
    }
}
