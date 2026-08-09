package com.google.android.recaptcha.internal;

import I1.r;
import J1.x;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) throws zzce {
        if (str.length() == 0) {
            throw new zzce(3, 17, null);
        }
        try {
            zzhv zzhvVar = new zzhv(this.zza.zza(x.W(list)), 255L, zzhv.zza);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i3 = 0; i3 < str.length(); i3++) {
                sb.append((char) r.c(r.c(str.charAt(i3)) ^ r.c((int) zzhvVar.zza())));
            }
            return zztz.zzg(zzkh.zzh().zzj(sb.toString()));
        } catch (Exception e3) {
            throw new zzce(3, 18, e3);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    public final zztz zza(zzub zzubVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        zztz zztzVarZzb = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i3 = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), jZza);
        return zztzVarZzb;
    }
}
