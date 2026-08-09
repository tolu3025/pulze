package io.grpc.internal;

import e0.AbstractC0825f;
import java.util.concurrent.TimeUnit;
import y1.AbstractC1304g;
import y1.C1300c;
import y1.EnumC1313p;

/* JADX INFO: loaded from: classes.dex */
abstract class M extends y1.V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.V f8629a;

    M(y1.V v2) {
        this.f8629a = v2;
    }

    @Override // y1.AbstractC1301d
    public String a() {
        return this.f8629a.a();
    }

    @Override // y1.AbstractC1301d
    public AbstractC1304g e(y1.a0 a0Var, C1300c c1300c) {
        return this.f8629a.e(a0Var, c1300c);
    }

    @Override // y1.V
    public boolean j(long j3, TimeUnit timeUnit) {
        return this.f8629a.j(j3, timeUnit);
    }

    @Override // y1.V
    public void k() {
        this.f8629a.k();
    }

    @Override // y1.V
    public EnumC1313p l(boolean z2) {
        return this.f8629a.l(z2);
    }

    @Override // y1.V
    public void m(EnumC1313p enumC1313p, Runnable runnable) {
        this.f8629a.m(enumC1313p, runnable);
    }

    @Override // y1.V
    public y1.V n() {
        return this.f8629a.n();
    }

    @Override // y1.V
    public y1.V o() {
        return this.f8629a.o();
    }

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", this.f8629a).toString();
    }
}
