package com.google.android.gms.internal.p000authapi;

import G.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0627b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zbau extends zbai {
    final /* synthetic */ TaskCompletionSource zba;

    zbau(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbaj
    public final void zbb(Status status, h hVar) {
        if (status.x()) {
            this.zba.setResult(hVar);
        } else {
            this.zba.setException(AbstractC0627b.a(status));
        }
    }
}
