package com.google.android.recaptcha.internal;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
final class zza extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zza(zze zzeVar, M1.d dVar) {
        super(dVar);
        this.zzd = zzeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == N1.d.e() ? objZzc : n.a(objZzc);
    }
}
