package com.google.android.recaptcha.internal;

import I1.n;
import I1.o;
import I1.u;
import U1.p;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzd extends l implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(zze zzeVar, zzsc zzscVar, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzd(this.zzb, this.zzc, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzh;
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 != 0) {
            objZzh = ((n) obj).i();
        } else {
            zze zzeVar = this.zzb;
            zzsc zzscVar = this.zzc;
            this.zza = 1;
            objZzh = zzeVar.zzh(zzscVar, this);
            if (objZzh == objE) {
                return objE;
            }
        }
        return n.a(objZzh);
    }
}
