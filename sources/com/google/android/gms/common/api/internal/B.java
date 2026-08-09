package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C0603c;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class B implements ComponentCallbacks2C0603c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0607g f5334a;

    B(C0607g c0607g) {
        Objects.requireNonNull(c0607g);
        this.f5334a = c0607g;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0603c.a
    public final void a(boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        C0607g c0607g = this.f5334a;
        c0607g.g().sendMessage(c0607g.g().obtainMessage(1, boolValueOf));
    }
}
