package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzdw extends kotlin.coroutines.jvm.internal.d {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdw(zzec zzecVar, M1.d dVar) {
        super(dVar);
        this.zzc = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzm(0L, this);
    }
}
