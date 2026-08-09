package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzmb {
    private static final byte[] zza = new byte[0];
    private final zzly zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private BigInteger zzf = BigInteger.ZERO;

    private zzmb(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzly zzlyVar) {
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzlyVar;
    }

    public static zzmb zza(byte[] bArr, zzme zzmeVar, zzmf zzmfVar, zzmc zzmcVar, zzly zzlyVar, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza = zzmfVar.zza(bArr, zzmeVar);
        byte[] bArrZza2 = zzmk.zza(zzmfVar.zza(), zzmcVar.zzb(), zzlyVar.zzc());
        byte[] bArr3 = zzmk.zzl;
        byte[] bArr4 = zza;
        byte[] bArrZza3 = zzyz.zza(zzmk.zza, zzmcVar.zza(bArr3, bArr4, "psk_id_hash", bArrZza2), zzmcVar.zza(bArr3, bArr2, "info_hash", bArrZza2));
        byte[] bArrZza4 = zzmcVar.zza(bArrZza, bArr4, "secret", bArrZza2);
        byte[] bArrZza5 = zzmcVar.zza(bArrZza4, bArrZza3, "key", bArrZza2, zzlyVar.zza());
        byte[] bArrZza6 = zzmcVar.zza(bArrZza4, bArrZza3, "base_nonce", bArrZza2, zzlyVar.zzb());
        zzlyVar.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        return new zzmb(bArr, bArrZza5, bArrZza6, bigInteger.shiftLeft(96).subtract(bigInteger), zzlyVar);
    }

    private final synchronized byte[] zza() {
        byte[] bArrZza;
        bArrZza = zzyz.zza(this.zze, zzne.zza(this.zzf, this.zzb.zzb()));
        if (this.zzf.compareTo(this.zzc) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.zzf = this.zzf.add(BigInteger.ONE);
        return bArrZza;
    }

    final byte[] zza(byte[] bArr, int i3, byte[] bArr2) {
        return this.zzb.zza(this.zzd, zza(), bArr, i3, bArr2);
    }
}
