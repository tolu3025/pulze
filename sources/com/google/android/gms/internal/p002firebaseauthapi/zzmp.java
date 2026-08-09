package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzmp implements zzbg {
    private zzmp(zzbg zzbgVar, byte[] bArr) {
    }

    public static zzbg zza(zzof zzofVar) throws GeneralSecurityException {
        zzaaj zzaajVarZza;
        zzqb zzqbVarZza = zzofVar.zza(zzbf.zza());
        zzbg zzbgVar = (zzbg) zznq.zza().zza(zzqbVarZza.zzf(), zzbg.class).zzb(zzqbVarZza.zzd());
        zzxz zzxzVarZzb = zzqbVarZza.zzb();
        int i3 = zzmo.zza[zzxzVarZzb.ordinal()];
        if (i3 == 1) {
            zzaajVarZza = zzpe.zza;
        } else if (i3 == 2 || i3 == 3) {
            zzaajVarZza = zzpe.zza(zzofVar.zzb().intValue());
        } else {
            if (i3 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + String.valueOf(zzxzVarZzb));
            }
            zzaajVarZza = zzpe.zzb(zzofVar.zzb().intValue());
        }
        return new zzmp(zzbgVar, zzaajVarZza.zzb());
    }
}
