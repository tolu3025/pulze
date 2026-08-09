package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzfg extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfj zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfg(zzfj zzfjVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzfjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return zzfj.zzc(this.zzb, null, null, this);
    }
}
