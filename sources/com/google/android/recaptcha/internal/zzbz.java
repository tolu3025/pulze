package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzbz extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzcb zzc;
    int zzd;
    zzcb zze;
    zzje[] zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbz(zzcb zzcbVar, M1.d dVar) {
        super(dVar);
        this.zzc = zzcbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzb(null, this);
    }
}
