package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzsr extends zzss {
    private final int zza;

    private zzsr(int i3) {
        this.zza = i3;
    }

    public static zzsr zza(int i3) throws InvalidAlgorithmParameterException {
        if (i3 == 16 || i3 == 32) {
            return new zzsr(i3);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i3 << 3)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzsr) && ((zzsr) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzsr.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        return "AesCmac PRF Parameters (" + this.zza + "-byte key)";
    }

    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return false;
    }
}
