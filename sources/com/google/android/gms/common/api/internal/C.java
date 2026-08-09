package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f5335a;

    C(G g3) {
        Objects.requireNonNull(g3);
        this.f5335a = g3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5335a.H();
    }
}
