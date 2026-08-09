package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: loaded from: classes.dex */
final class zzed extends kotlin.coroutines.jvm.internal.d {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;
    int zzd;
    zzef zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzed(zzef zzefVar, M1.d dVar) {
        super(dVar);
        this.zzc = zzefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza(null, null, 0L, this);
    }
}
