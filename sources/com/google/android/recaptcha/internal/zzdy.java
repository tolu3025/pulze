package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import c2.Y0;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzdy extends l implements U1.l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdy(long j3, zzec zzecVar, M1.d dVar) {
        super(1, dVar);
        this.zzb = j3;
        this.zzc = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(M1.d dVar) {
        return new zzdy(this.zzb, this.zzc, dVar);
    }

    @Override // U1.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((M1.d) obj)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            long j3 = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (Y0.c(j3, zzdxVar, this) == objE) {
                return objE;
            }
        }
        return u.f2419a;
    }
}
