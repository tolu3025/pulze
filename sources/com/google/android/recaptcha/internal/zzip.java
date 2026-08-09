package com.google.android.recaptcha.internal;

import I1.n;

/* JADX INFO: loaded from: classes.dex */
final class zzip extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzip(zzja zzjaVar, M1.d dVar) {
        super(dVar);
        this.zzb = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzf = this.zzb.zzf(null, this);
        return objZzf == N1.d.e() ? objZzf : n.a(objZzf);
    }
}
