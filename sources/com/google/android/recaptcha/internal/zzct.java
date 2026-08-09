package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzct extends l implements p {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcv zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcn zzg;
    final /* synthetic */ zzch zzh;
    final /* synthetic */ zzbi zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzct(zzcv zzcvVar, String str, long j3, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, M1.d dVar) {
        super(2, dVar);
        this.zzd = zzcvVar;
        this.zze = str;
        this.zzf = j3;
        this.zzg = zzcnVar;
        this.zzi = zzbiVar;
        this.zzh = zzchVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        zzct zzctVar = new zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, dVar);
        zzctVar.zzc = obj;
        return zzctVar;
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((zzek) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzek zzekVar;
        zzcn zzcnVar;
        Object objE = N1.d.e();
        if (this.zzb != 0) {
            zzcnVar = (zzcn) this.zza;
            zzekVar = (zzek) this.zzc;
            o.b(obj);
        } else {
            o.b(obj);
            zzekVar = (zzek) this.zzc;
            zzdc zzdcVarZza = zzcv.zza(this.zzd, this.zze);
            if (zzdcVarZza != null) {
                return zzdcVarZza;
            }
            zzcv.zzc(this.zzd, this.zzf);
            zzcn zzcnVarZze = this.zzg;
            if (zzcnVarZze == null) {
                zzcnVarZze = zzcv.zze(this.zzd, this.zze, this.zzi, this.zzh, zzekVar);
            }
            long j3 = this.zzf;
            this.zzc = zzekVar;
            this.zza = zzcnVarZze;
            this.zzb = 1;
            if (zzcnVarZze.zzb(j3, this) == objE) {
                return objE;
            }
            zzcnVar = zzcnVarZze;
        }
        zzdc zzdcVar = new zzdc(zzcnVar, this.zze, this.zzi, zzekVar);
        this.zzd.zzc = zzdcVar;
        return zzdcVar;
    }
}
