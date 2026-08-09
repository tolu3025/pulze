package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzim extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzim(zzja zzjaVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzE(null, this);
    }
}
