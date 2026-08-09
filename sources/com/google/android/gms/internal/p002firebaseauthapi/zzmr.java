package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class zzmr implements zzmf {
    private final zzzi zza;
    private final zzlz zzb;

    private zzmr(zzlz zzlzVar, zzzi zzziVar) {
        this.zzb = zzlzVar;
        this.zza = zzziVar;
    }

    static zzmr zza(zzzi zzziVar) throws GeneralSecurityException {
        int i3 = zzmq.zza[zzziVar.ordinal()];
        if (i3 == 1) {
            return new zzmr(new zzlz("HmacSha256"), zzzi.NIST_P256);
        }
        if (i3 == 2) {
            return new zzmr(new zzlz("HmacSha384"), zzzi.NIST_P384);
        }
        if (i3 == 3) {
            return new zzmr(new zzlz("HmacSha512"), zzzi.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: " + String.valueOf(zzziVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza() throws GeneralSecurityException {
        int i3 = zzmq.zza[this.zza.ordinal()];
        if (i3 == 1) {
            return zzmk.zzc;
        }
        if (i3 == 2) {
            return zzmk.zzd;
        }
        if (i3 == 3) {
            return zzmk.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza(byte[] bArr, zzme zzmeVar) throws GeneralSecurityException {
        byte[] bArrZza = zzzf.zza(zzzf.zza(this.zza, zzmeVar.zza().zzb()), zzzf.zza(zzzf.zza(this.zza), zzzh.UNCOMPRESSED, bArr));
        byte[] bArrZza2 = zzyz.zza(bArr, zzmeVar.zzb().zzb());
        byte[] bArrZza3 = zzmk.zza(zza());
        zzlz zzlzVar = this.zzb;
        return zzlzVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzlzVar.zza());
    }
}
