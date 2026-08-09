package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzak extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzan zzc;
    int zzd;
    zzan zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzak(zzan zzanVar, M1.d dVar) {
        super(dVar);
        this.zzc = zzanVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zze(this);
    }
}
