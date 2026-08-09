package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.InterfaceC0595x;
import c2.N;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzeb extends l implements p {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC0595x zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(zzec zzecVar, InterfaceC0595x interfaceC0595x, long j3, M1.d dVar) {
        super(2, dVar);
        this.zzb = zzecVar;
        this.zzc = interfaceC0595x;
        this.zzd = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objE = N1.d.e();
        try {
            if (this.zza != 0) {
                o.b(obj);
            } else {
                o.b(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == objE) {
                    return objE;
                }
            }
            ((Boolean) obj).booleanValue();
        } catch (zzbd e3) {
            this.zzb.zzf = zzcm.zzd;
            this.zzc.r(e3);
        }
        return u.f2419a;
    }
}
