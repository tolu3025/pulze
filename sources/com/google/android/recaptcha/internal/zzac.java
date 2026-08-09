package com.google.android.recaptcha.internal;

import I1.o;
import I1.u;
import U1.p;
import c2.N;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzae zzaeVar, String str, M1.d dVar) {
        super(2, dVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final M1.d create(Object obj, M1.d dVar) {
        return new zzac(this.zzc, this.zzd, dVar);
    }

    @Override // U1.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((N) obj, (M1.d) obj2)).invokeSuspend(u.f2419a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzy zzyVar;
        Object objE = N1.d.e();
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e3) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e3.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i3 = 2;
            this.zzb = 2;
            if (e3 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e3).getErrorCode();
                if (errorCode == -100) {
                    i3 = 44;
                } else if (errorCode == -12) {
                    i3 = 39;
                } else if (errorCode == -3) {
                    i3 = 30;
                } else if (errorCode == -2) {
                    i3 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i3 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i3 = 53;
                            break;
                        case -17:
                            i3 = 52;
                            break;
                        case -16:
                            i3 = 43;
                            break;
                        case -15:
                            i3 = 42;
                            break;
                        case -14:
                            i3 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i3 = 36;
                                    break;
                                case -8:
                                    i3 = 35;
                                    break;
                                case -7:
                                    i3 = 34;
                                    break;
                                case -6:
                                    i3 = 33;
                                    break;
                                case -5:
                                    i3 = 32;
                                    break;
                            }
                            break;
                    }
                } else {
                    i3 = 28;
                }
            } else {
                i3 = 45;
            }
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zzq(i3);
            zztdVarZzf.zzr(15);
            obj = zztdVarZzf.zzk();
            if (obj == objE) {
                return objE;
            }
            zzyVar = zzaeVar;
        }
        if (zzenVar == 0) {
            o.b(obj);
            zzen zzenVarZzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzan zzanVar = zzaeVar2.zzc;
            String str = zzaeVar2.zze;
            this.zza = zzenVarZzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzenVarZzb;
            if (obj == objE) {
                return objE;
            }
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                o.b(obj);
                int iZza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(iZza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            o.b(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw((String) obj);
        zztfVarZzf.zzf((zzth) zztgVarZzf.zzk());
        return zzz.zza(zzaeVar3, (zzti) zztfVarZzf.zzk());
    }
}
