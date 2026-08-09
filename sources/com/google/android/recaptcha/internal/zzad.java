package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzad extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzae zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzad(zzae zzaeVar, M1.d dVar) {
        super(dVar);
        this.zzc = zzaeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzd(null, this);
    }
}
