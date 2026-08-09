package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.G;

/* JADX INFO: loaded from: classes.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f5806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G f5807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f5808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j3) {
        super(bnVar, taskCompletionSource);
        this.f5806c = bnVar;
        this.f5807d = new G("OnRequestIntegrityTokenCallback");
        this.f5808e = j3;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.y
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f5807d.d("onRequestExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.b bVarA = this.f5806c.f5817f.a(bundle);
        if (bVarA != null) {
            this.f5803a.trySetException(bVarA);
            return;
        }
        bj bjVar = new bj(this, this.f5806c.f5814c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f5803a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
