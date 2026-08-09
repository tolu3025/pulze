package com.google.android.gms.internal.auth;

import I.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zzbm extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    zzbm(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(c cVar) {
        AbstractC0621v.b(new Status(cVar.f2144a), cVar, this.zza);
    }
}
