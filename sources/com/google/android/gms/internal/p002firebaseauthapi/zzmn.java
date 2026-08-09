package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzmn implements zzbd {
    private final zzbd zza;
    private final byte[] zzb;

    private zzmn(zzbd zzbdVar, byte[] bArr) {
        this.zza = zzbdVar;
        this.zzb = bArr;
    }

    public static zzbd zza(zzof zzofVar) throws GeneralSecurityException {
        zzaaj zzaajVarZza;
        zzqb zzqbVarZza = zzofVar.zza(zzbf.zza());
        zzbd zzbdVar = (zzbd) zznq.zza().zza(zzqbVarZza.zzf(), zzbd.class).zzb(zzqbVarZza.zzd());
        zzxz zzxzVarZzb = zzqbVarZza.zzb();
        int i3 = zzmm.zza[zzxzVarZzb.ordinal()];
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
        return new zzmn(zzbdVar, zzaajVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (!zzqn.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        return this.zza.zza(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
    }
}
