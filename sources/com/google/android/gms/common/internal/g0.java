package com.google.android.gms.common.internal;

import M.C0413a;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends V {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC0629d f5568g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC0629d abstractC0629d, int i3, Bundle bundle) {
        super(abstractC0629d, i3, bundle);
        Objects.requireNonNull(abstractC0629d);
        this.f5568g = abstractC0629d;
    }

    @Override // com.google.android.gms.common.internal.V
    protected final boolean e() {
        this.f5568g.zzc.b(C0413a.f2656f);
        return true;
    }

    @Override // com.google.android.gms.common.internal.V
    protected final void f(C0413a c0413a) {
        AbstractC0629d abstractC0629d = this.f5568g;
        if (abstractC0629d.enableLocalFallback() && abstractC0629d.zzg()) {
            abstractC0629d.zzf(16);
        } else {
            abstractC0629d.zzc.b(c0413a);
            abstractC0629d.onConnectionFailed(c0413a);
        }
    }
}
