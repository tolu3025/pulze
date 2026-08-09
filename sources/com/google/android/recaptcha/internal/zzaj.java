package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzaj extends l implements p {
    int zza;
    final /* synthetic */ zzan zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaj(zzan zzanVar, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzanVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzaj(this.zzb, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            this.zzb.zze = zzao.zza;
            zzan zzanVar = this.zzb;
            this.zza = 1;
            if (zzanVar.zze(this) == objE) {
                return objE;
            }
        }
        return u.f2419a;
    }
}
