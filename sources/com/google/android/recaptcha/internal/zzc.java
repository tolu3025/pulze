package com.google.android.recaptcha.internal;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
final class zzc extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(zze zzeVar, M1.d dVar) {
        super(dVar);
        this.zzc = zzeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == N1.d.e() ? objZze : n.a(objZze);
    }
}
