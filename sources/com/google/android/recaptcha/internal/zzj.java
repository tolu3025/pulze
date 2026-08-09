package com.google.android.recaptcha.internal;

import I1.n;
import I1.o;
import I1.u;
import U1.p;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzj extends l implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(zze zzeVar, long j3, zzsc zzscVar, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = j3;
        this.zzd = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZze;
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 != 0) {
            objZze = ((n) obj).i();
        } else {
            zze zzeVar = this.zzb;
            long j3 = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            objZze = zzeVar.zze(j3, zzscVar, this);
            if (objZze == objE) {
                return objE;
            }
        }
        return n.a(objZze);
    }
}
