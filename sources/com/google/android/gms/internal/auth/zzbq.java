package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.f;

/* JADX INFO: loaded from: classes.dex */
final class zzbq extends zzbi {
    final /* synthetic */ I.b zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbq(zzbt zzbtVar, f fVar, I.b bVar) {
        super(fVar);
        this.zza = bVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    protected final void zza(Context context, zzbh zzbhVar) {
        zzbhVar.zze(new zzbp(this), this.zza);
    }
}
