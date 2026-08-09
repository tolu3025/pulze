package com.google.android.gms.common.api.internal;

import c0.C0541l;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class X implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0541l f5382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z f5383b;

    X(Z z2, C0541l c0541l) {
        this.f5382a = c0541l;
        Objects.requireNonNull(z2);
        this.f5383b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5383b.v(this.f5382a);
    }
}
