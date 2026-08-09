package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f5337b;

    D(G g3, int i3) {
        this.f5336a = i3;
        Objects.requireNonNull(g3);
        this.f5337b = g3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5337b.I(this.f5336a);
    }
}
