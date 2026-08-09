package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zbbf extends zbae {
    final /* synthetic */ TaskCompletionSource zba;

    zbbf(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbaf
    public final void zbb(Status status, PendingIntent pendingIntent) {
        AbstractC0621v.b(status, pendingIntent, this.zba);
    }
}
