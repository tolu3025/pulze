package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class k0 extends N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f5440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l0 f5441b;

    k0(l0 l0Var, Dialog dialog) {
        this.f5440a = dialog;
        Objects.requireNonNull(l0Var);
        this.f5441b = l0Var;
    }

    @Override // com.google.android.gms.common.api.internal.N
    public final void a() {
        this.f5441b.f5447b.g();
        Dialog dialog = this.f5440a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
