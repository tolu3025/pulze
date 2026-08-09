package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzdk extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdt zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdk(zzdt zzdtVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzdtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzn(null, 0L, this);
    }
}
