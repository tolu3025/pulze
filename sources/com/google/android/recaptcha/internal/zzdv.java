package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzdv extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdv(zzec zzecVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzl(null, this);
    }
}
