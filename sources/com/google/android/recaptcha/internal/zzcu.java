package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzcu extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcv zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(zzcv zzcvVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzcvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzj(null, 0, null, this);
    }
}
