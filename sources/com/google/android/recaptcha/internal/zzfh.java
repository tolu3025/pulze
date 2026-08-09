package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzfh extends l implements p {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfh(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, M1.d dVar) {
        super(2, dVar);
        this.zza = zzfjVar;
        this.zzb = zzbrVar;
        this.zzc = zzspVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzfh(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        N1.d.e();
        o.b(obj);
        zzew zzewVarZza = null;
        try {
            try {
                try {
                    zzewVarZza = zzfj.zza(this.zza).zza(this.zzb.zzd());
                    zzewVarZza.zzc();
                    zzewVarZza.zze(this.zzc.zzd());
                    zzsr zzsrVar = (zzsr) zzewVarZza.zza(zzsr.zzi());
                    zzewVarZza.zzd();
                    return zzsrVar;
                } catch (zzbd e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e4.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVarZza != null) {
                zzewVarZza.zzd();
            }
            throw th;
        }
    }
}
