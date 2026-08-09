package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zzbn extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    zzbn(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(String str) {
        AbstractC0621v.b(str != null ? Status.f5312f : new Status(3006), str, this.zza);
    }
}
