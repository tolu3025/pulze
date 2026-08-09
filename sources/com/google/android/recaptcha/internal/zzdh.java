package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import M.j;
import U1.p;
import android.os.Build;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzdh extends l implements p {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdh(zzdt zzdtVar, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzdh(this.zzb, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            int iZza = new zzbs(j.e()).zza(this.zzb.zzr());
            zzdt zzdtVar = this.zzb;
            String str = zzdtVar.zza;
            String packageName = zzdtVar.zzr().getPackageName();
            String strZzd = this.zzb.zzb.zzd();
            zzbf zzbfVarZzt = this.zzb.zzt();
            int i4 = Build.VERSION.SDK_INT;
            String strZza = zzbfVarZzt.zza();
            zztn zztnVarZzf = zzto.zzf();
            zztnVarZzf.zzt(str);
            zztnVarZzf.zzq(packageName);
            zztnVarZzf.zzu(iZza);
            zztnVarZzf.zzr("18.6.1");
            zztnVarZzf.zzs(strZzd);
            zztnVarZzf.zzf(String.valueOf(i4));
            zztnVarZzf.zze(strZza);
            zzto zztoVar = (zzto) zztnVarZzf.zzk();
            zzdt zzdtVar2 = this.zzb;
            zzff zzffVarZzg = zzdt.zzg(zzdtVar2);
            String strZzb = zzdt.zzd(zzdtVar2).zzb();
            this.zza = 1;
            obj = zzffVarZzg.zzc(strZzb, zztoVar, this);
            if (obj == objE) {
                return objE;
            }
        }
        return obj;
    }
}
