package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
final class zzyt extends ThreadLocal<Cipher> {
    zzyt() {
    }

    private static Cipher zza() {
        try {
            return zzzj.zza.zza("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
