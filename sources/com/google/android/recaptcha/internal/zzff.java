package com.google.android.recaptcha.internal;

import I1.g;
import I1.i;
import b2.o;
import c2.O;

/* JADX INFO: loaded from: classes.dex */
public final class zzff {
    private final g zza;
    private final g zzb;
    private final g zzc;

    public zzff() {
        int i3 = zzav.zza;
        this.zza = i.a(zzfc.zza);
        this.zzb = i.a(zzfd.zza);
        this.zzc = i.a(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, M1.d dVar) throws Exception {
        String strZza;
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    strZza = zzffVar.zzf().zza(strZzM);
                } catch (Exception e3) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e3.getMessage()));
                }
                if (strZza != null) {
                    zzenVarZzf.zza();
                    strZzb = strZza;
                } else {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e4) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e4.getMessage()));
                    }
                } catch (zzbd e5) {
                    zzenVarZzf2.zzb(e5);
                    throw e5;
                }
            }
            return o.n(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb, false, 4, null);
        } catch (Exception e6) {
            if (e6 instanceof zzbd) {
                throw e6;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e6.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, M1.d dVar) {
        return O.c(new zzfb(this, str, zztoVar, null), dVar);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, M1.d dVar) {
        return zze(this, zzscVar, zzekVar, dVar);
    }
}
