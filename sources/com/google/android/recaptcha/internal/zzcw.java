package com.google.android.recaptcha.internal;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
final class zzcw extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcw(zzdc zzdcVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo10execute0E7RQCE = this.zzb.mo10execute0E7RQCE(null, 0L, this);
        return objMo10execute0E7RQCE == N1.d.e() ? objMo10execute0E7RQCE : n.a(objMo10execute0E7RQCE);
    }
}
