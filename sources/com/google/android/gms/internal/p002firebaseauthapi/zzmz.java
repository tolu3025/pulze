package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes.dex */
public final class zzmz {
    public static zzba zza(String str) {
        return new zznc(str, zza());
    }

    public static boolean zzb(String str) {
        return zza().containsAlias(str);
    }

    private static KeyStore zza() throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e3) {
            throw new GeneralSecurityException(e3);
        }
    }
}
