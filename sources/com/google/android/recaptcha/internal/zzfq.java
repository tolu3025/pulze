package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import J1.x;
import U1.p;
import c2.N;
import c2.O;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzfq extends l implements p {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfq(zzgd zzgdVar, List list, zzft zzftVar, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, dVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE = N1.d.e();
        int i3 = this.zza;
        o.b(obj);
        if (i3 == 0) {
            N n3 = (N) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() >= this.zzc.size() || !O.e(n3)) {
                    break;
                }
                zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzufVar, this.zzb);
                } catch (Exception e3) {
                    zzufVar.zzk();
                    kotlin.coroutines.jvm.internal.b.c(zzufVar.zzg());
                    x.G(zzufVar.zzj(), null, null, null, 0, null, new zzfp(this.zzd), 31, null);
                    zzft zzftVar = this.zzd;
                    zzgd zzgdVar2 = this.zzb;
                    this.zza = 1;
                    if (zzftVar.zzh(e3, zzgdVar2, this) == objE) {
                        return objE;
                    }
                }
            }
            return u.f2419a;
        }
        return u.f2419a;
    }
}
