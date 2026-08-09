package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.N;
import c2.O;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes.dex */
final class zzfr extends l implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ zzft zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfr(Exception exc, zzgd zzgdVar, zzft zzftVar, M1.d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = zzgdVar;
        this.zzc = zzftVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        zzfr zzfrVar = new zzfr(this.zza, this.zzb, this.zzc, dVar);
        zzfrVar.zzd = obj;
        return zzfrVar;
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfr) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zztd zztdVarZza;
        N1.d.e();
        o.b(obj);
        N n3 = (N) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzce) {
            zztdVarZza = ((zzce) exc).zza();
            zztdVarZza.zze(this.zzb.zza());
        } else {
            zzgd zzgdVar = this.zzb;
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zze(zzgdVar.zza());
            zztdVarZzf.zzr(2);
            zztdVarZzf.zzq(2);
            zztdVarZza = zztdVarZzf;
        }
        zzte zzteVar = (zzte) zztdVarZza.zzk();
        zzteVar.zzl();
        zzteVar.zzk();
        z.b(this.zza.getClass()).b();
        this.zza.getMessage();
        zzgd zzgdVar2 = this.zzb;
        zzbn zzbnVarZzb = zzgdVar2.zzb();
        zzbn zzbnVar = zzgdVar2.zza;
        if (zzbnVar == null) {
            zzbnVar = null;
        }
        zzrl zzrlVarZza = zzev.zza(zzbnVarZzb, zzbnVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        if (O.e(n3)) {
            zzft zzftVar = this.zzc;
            zzkh zzkhVarZzh = zzkh.zzh();
            byte[] bArrZzd = zzteVar.zzd();
            String strZzi = zzkhVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzkh zzkhVarZzh2 = zzkh.zzh();
            byte[] bArrZzd2 = zzrlVarZza.zzd();
            zzftVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzkhVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return u.f2419a;
    }
}
