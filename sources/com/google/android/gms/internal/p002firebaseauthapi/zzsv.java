package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzsv implements zzsq {
    private static final zziv.zza zza = zziv.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzsu();
    private final SecretKey zzc;
    private byte[] zzd;
    private byte[] zze;

    private zzsv(byte[] bArr) throws GeneralSecurityException {
        zzaai.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzc = secretKeySpec;
        Cipher cipherZza = zza();
        cipherZza.init(1, secretKeySpec);
        byte[] bArrZzb = zzsf.zzb(cipherZza.doFinal(new byte[16]));
        this.zzd = bArrZzb;
        this.zze = zzsf.zzb(bArrZzb);
    }

    public static zzsq zza(zzso zzsoVar) {
        return new zzsv(zzsoVar.zzd().zza(zzbf.zza()));
    }

    private static Cipher zza() throws GeneralSecurityException {
        if (zza.zza()) {
            return zzb.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zza(byte[] bArr, byte[] bArr2, int i3, byte[] bArr3) {
        for (int i4 = 0; i4 < 16; i4++) {
            bArr3[i4] = (byte) (bArr[i4] ^ bArr2[i4 + i3]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i3) throws GeneralSecurityException {
        if (i3 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherZza = zza();
        cipherZza.init(1, this.zzc);
        int length = bArr.length;
        int i4 = length == 0 ? 1 : ((length - 1) / 16) + 1;
        byte[] bArrZza = (i4 << 4) == bArr.length ? zzyz.zza(bArr, (i4 - 1) << 4, this.zzd, 0, 16) : zzyz.zza(zzsf.zza(Arrays.copyOfRange(bArr, (i4 - 1) << 4, bArr.length)), this.zze);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i5 = 0; i5 < i4 - 1; i5++) {
            zza(bArr2, bArr, i5 << 4, bArr3);
            if (cipherZza.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zza(bArr2, bArrZza, 0, bArr3);
        if (cipherZza.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i3 ? bArr2 : Arrays.copyOf(bArr2, i3);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
