package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.G;

/* JADX INFO: loaded from: classes.dex */
final class bl extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f5809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G f5810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f5809c = bnVar;
        this.f5810d = new G("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.y
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f5810d.d("onWarmUpExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.b bVarA = this.f5809c.f5817f.a(bundle);
        if (bVarA != null) {
            this.f5803a.trySetException(bVarA);
        } else {
            this.f5803a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
