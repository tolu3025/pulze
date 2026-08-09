package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.AbstractC0629d;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class F implements AbstractC0629d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f5339a;

    F(G g3) {
        Objects.requireNonNull(g3);
        this.f5339a = g3;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d.e
    public final void a() {
        this.f5339a.f5352m.g().post(new E(this));
    }
}
