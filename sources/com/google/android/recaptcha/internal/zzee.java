package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzee extends kotlin.coroutines.jvm.internal.d {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;
    int zzd;
    zzef zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzee(zzef zzefVar, M1.d dVar) {
        super(dVar);
        this.zzc = zzefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzb(0L, this);
    }
}
