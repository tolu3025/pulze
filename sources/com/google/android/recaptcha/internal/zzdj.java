package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzdj extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdt zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdj(zzdt zzdtVar, M1.d dVar) {
        super(dVar);
        this.zzc = zzdtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzv(null, 0L, this);
    }
}
