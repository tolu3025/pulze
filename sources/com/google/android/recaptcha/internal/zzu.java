package com.google.android.recaptcha.internal;

import I1.n;
import I1.o;
import I1.u;
import U1.p;
import c2.N;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends l implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzu(zzsc zzscVar, zzv zzvVar, M1.d dVar) {
        super(2, dVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzu(this.zzd, this.zze, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzse zzseVarZzj;
        zzbd zzbdVar;
        Iterator it;
        Object objA;
        Object objE = N1.d.e();
        if (this.zzc == 0) {
            o.b(obj);
            if (this.zzd.zzS()) {
                zzseVarZzj = this.zzd.zzj();
                if (zzseVarZzj.zzi().zzd() != 0) {
                    this.zze.zzc = zzseVarZzj.zzi();
                    it = this.zze.zzb.iterator();
                } else {
                    n.a aVar = n.f2411b;
                    zzbdVar = new zzbd(zzbb.zzb, zzba.zzab, null);
                }
            } else {
                n.a aVar2 = n.f2411b;
                zzbdVar = new zzbd(zzbb.zzb, zzba.zzab, null);
            }
            objA = o.a(zzbdVar);
            return n.a(n.b(objA));
        }
        it = (Iterator) this.zzb;
        zzseVarZzj = (zzse) this.zza;
        o.b(obj);
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzseVarZzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzseVarZzj, this) == objE) {
                return objE;
            }
        }
        n.a aVar3 = n.f2411b;
        objA = u.f2419a;
        return n.a(n.b(objA));
    }
}
