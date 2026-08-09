package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzbp extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzbq zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbp(zzbq zzbqVar, M1.d dVar) {
        super(dVar);
        this.zzg = zzbqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zza(null, 0L, 0L, 0.0d, null, this);
    }
}
