package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class zzaae implements zzsq {
    private static final zziv.zza zza = zziv.zza.zzb;
    private final ThreadLocal<Mac> zzb;
    private final String zzc;
    private final Key zzd;
    private final int zze;

    public zzaae(String str, Key key) throws GeneralSecurityException {
        int i3;
        zzaad zzaadVar = new zzaad(this);
        this.zzb = zzaadVar;
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzc = str;
        this.zzd = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                i3 = 20;
                break;
            case "HMACSHA224":
                i3 = 28;
                break;
            case "HMACSHA256":
                i3 = 32;
                break;
            case "HMACSHA384":
                i3 = 48;
                break;
            case "HMACSHA512":
                i3 = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        this.zze = i3;
        zzaadVar.get();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i3) throws InvalidAlgorithmParameterException {
        if (i3 > this.zze) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzb.get().update(bArr);
        return Arrays.copyOf(this.zzb.get().doFinal(), i3);
    }
}
