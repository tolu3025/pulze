package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import c2.InterfaceC0595x;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzea extends l implements U1.l {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC0595x zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzea(zzec zzecVar, long j3, InterfaceC0595x interfaceC0595x, M1.d dVar) {
        super(1, dVar);
        this.zzc = zzecVar;
        this.zzd = j3;
        this.zze = interfaceC0595x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(M1.d dVar) {
        return new zzea(this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // U1.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((M1.d) obj)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        zzbd e3;
        zzen zzenVar2;
        Object objE = N1.d.e();
        int i3 = this.zzb;
        if (i3 == 0) {
            o.b(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j3 = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j3, this);
                if (objZzo != objE) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return objE;
            } catch (zzbd e4) {
                zzenVar = zzenVarZzf;
                e3 = e4;
                this.zzc.zzd = e3;
                zzenVar.zzb(e3);
                throw e3;
            }
        }
        if (i3 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                o.b(obj);
                zzenVar.zza();
                this.zzc.zzf = zzcm.zzb;
                return kotlin.coroutines.jvm.internal.b.a(this.zze.u(u.f2419a));
            } catch (zzbd e5) {
                e3 = e5;
                this.zzc.zzd = e3;
                zzenVar.zzb(e3);
                throw e3;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            o.b(obj);
        } catch (zzbd e6) {
            e3 = e6;
            zzenVar = zzenVar2;
            this.zzc.zzd = e3;
            zzenVar.zzb(e3);
            throw e3;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j4 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j4, this) != objE) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return kotlin.coroutines.jvm.internal.b.a(this.zze.u(u.f2419a));
        }
        return objE;
    }
}
