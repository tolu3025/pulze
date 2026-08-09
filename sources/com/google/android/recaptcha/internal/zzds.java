package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.AbstractC0566i;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzds extends l implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzds(zzdt zzdtVar, zzen zzenVar, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzds(this.zzb, this.zzc, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = AbstractC0566i.g(zzdtVar.zzi.zza().e(), new zzdh(zzdtVar, null), this);
            if (obj == objE) {
                return objE;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
