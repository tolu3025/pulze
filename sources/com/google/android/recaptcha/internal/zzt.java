package com.google.android.recaptcha.internal;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
final class zzt extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzt(zzv zzvVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == N1.d.e() ? objZzh : n.a(objZzh);
    }
}
