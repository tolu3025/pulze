package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzdb extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdb(zzdc zzdcVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzg(null, null, this);
    }
}
