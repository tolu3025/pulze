package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
final class zzll implements zzly {
    private final int zza;

    zzll(int i3) throws InvalidAlgorithmParameterException {
        if (i3 == 16 || i3 == 32) {
            this.zza = i3;
        } else {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i3);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final byte[] zzc() throws GeneralSecurityException {
        int i3 = this.zza;
        if (i3 == 16) {
            return zzmk.zzi;
        }
        if (i3 == 32) {
            return zzmk.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length == this.zza) {
            return new zzhs(bArr).zza(bArr2, bArr3, i3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }
}
