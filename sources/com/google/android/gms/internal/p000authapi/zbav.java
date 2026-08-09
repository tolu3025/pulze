package com.google.android.gms.internal.p000authapi;

import G.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zbav extends zbak {
    final /* synthetic */ TaskCompletionSource zba;

    zbav(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbal
    public final void zbb(Status status, j jVar) {
        AbstractC0621v.b(status, jVar, this.zba);
    }
}
