package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.N;
import c2.W0;
import c2.Y0;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzdg extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdg(zzdt zzdtVar, String str, long j3, zzsp zzspVar, M1.d dVar) {
        super(2, dVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j3;
        this.zzf = zzspVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        Exception e3;
        zzbd e4;
        W0 e5;
        Object objE = N1.d.e();
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                o.b(obj);
            } catch (W0 e6) {
                e5 = e6;
                zzbd zzbdVarZzs = this.zzc.zzs(e5, new zzbd(zzbb.zzc, zzba.zzb, e5.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (zzbd e7) {
                e4 = e7;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e4, e4);
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e8) {
                e3 = e8;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzZ, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            o.b(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j3 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objC = Y0.c(j3, zzdfVar, this);
                if (objC == objE) {
                    return objE;
                }
                zzenVar = zzenVarZzf;
                obj = objC;
            } catch (W0 e9) {
                zzenVar = zzenVarZzf;
                e5 = e9;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e5, new zzbd(zzbb.zzc, zzba.zzb, e5.getMessage()));
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (zzbd e10) {
                zzenVar = zzenVarZzf;
                e4 = e10;
                zzbd zzbdVarZzs22 = this.zzc.zzs(e4, e4);
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            } catch (Exception e11) {
                zzenVar = zzenVarZzf;
                e3 = e11;
                zzbd zzbdVarZzs32 = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzZ, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs32);
                throw zzbdVarZzs32;
            }
        }
        return (zzsr) obj;
    }
}
