package com.google.android.recaptcha.internal;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
final class zzcx extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcx(zzdc zzdcVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo11executegIAlus = this.zzb.mo11executegIAlus(null, this);
        return objMo11executegIAlus == N1.d.e() ? objMo11executegIAlus : n.a(objMo11executegIAlus);
    }
}
