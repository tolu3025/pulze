package com.google.android.recaptcha.internal;

import I1.n;
import I1.o;
import I1.u;
import U1.p;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzg extends l implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzg(zze zzeVar, String str, long j3, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzg(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzg) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZzc;
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 != 0) {
            objZzc = ((n) obj).i();
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j3 = this.zzd;
            this.zza = 1;
            objZzc = zzeVar.zzc(str, j3, this);
            if (objZzc == objE) {
                return objE;
            }
        }
        return n.a(objZzc);
    }
}
