package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzgm implements zzgx {
    public static final zzgm zza = new zzgm();

    private zzgm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i3, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        boolean z2 = true;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzgdVar.zzh().zza((String) objZza);
                }
                zzge zzgeVarZzc = zzgdVar.zzc();
                try {
                    zzgc.zza(objZza);
                } catch (zzce e3) {
                    if (e3.zzb() == 8 || e3.zzb() == 6) {
                        z2 = false;
                    } else if (e3.zzb() != 47) {
                        throw e3;
                    }
                }
                zzgeVarZzc.zze(i3, Boolean.valueOf(z2));
            } catch (zzce e4) {
                throw e4;
            }
        } catch (Exception e5) {
            throw new zzce(6, 8, e5);
        }
    }
}
