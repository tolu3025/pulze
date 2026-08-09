package com.google.android.recaptcha;

import I1.n;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: loaded from: classes.dex */
final class Recaptcha$getClient$1 extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recaptcha$getClient$1(Recaptcha recaptcha, M1.d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM9getClientBWLJW6A = this.zzb.m9getClientBWLJW6A(null, null, 0L, this);
        return objM9getClientBWLJW6A == N1.d.e() ? objM9getClientBWLJW6A : n.a(objM9getClientBWLJW6A);
    }
}
