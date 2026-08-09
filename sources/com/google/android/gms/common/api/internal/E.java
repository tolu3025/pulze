package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ F f5338a;

    E(F f3) {
        Objects.requireNonNull(f3);
        this.f5338a = f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G g3 = this.f5338a.f5339a;
        g3.N().disconnect(g3.N().getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
