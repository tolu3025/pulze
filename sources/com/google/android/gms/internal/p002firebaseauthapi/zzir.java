package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
final class zzir extends ThreadLocal<Cipher> {
    zzir() {
    }

    private static Cipher zza() {
        try {
            Cipher cipherZza = zzzj.zza.zza("AES/GCM-SIV/NoPadding");
            if (zzgz.zza(cipherZza)) {
                return cipherZza;
            }
            return null;
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
