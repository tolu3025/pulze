package com.google.android.recaptcha.internal;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
final class zzcy extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(zzdc zzdcVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzf = this.zzb.zzf(null, 0L, this);
        return objZzf == N1.d.e() ? objZzf : n.a(objZzf);
    }
}
