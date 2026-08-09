package com.google.android.gms.internal.p000authapi;

import G.C0318a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0627b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zbap extends zby {
    final /* synthetic */ TaskCompletionSource zba;

    zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbz
    public final void zbb(Status status, C0318a c0318a) {
        if (status.x()) {
            this.zba.setResult(c0318a);
        } else {
            this.zba.setException(AbstractC0627b.a(status));
        }
    }
}
