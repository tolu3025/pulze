package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zzq extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzg
    public final void zzb(Status status, boolean z2) {
        AbstractC0621v.b(status, Boolean.valueOf(z2), this.zza);
    }
}
