package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzlk implements zzly {
    zzlk() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final byte[] zzc() {
        return zzmk.zzk;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzly
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (zzhv.zza()) {
            return zzhv.zza(bArr).zza(bArr2, bArr3, i3, bArr4);
        }
        return new zzht(bArr).zza(bArr2, Arrays.copyOfRange(bArr3, i3, bArr3.length), bArr4);
    }
}
