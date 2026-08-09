package com.google.android.gms.common.api.internal;

import M.C0413a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class W implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z f5381a;

    W(Z z2) {
        Objects.requireNonNull(z2);
        this.f5381a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5381a.w().c(new C0413a(4));
    }
}
