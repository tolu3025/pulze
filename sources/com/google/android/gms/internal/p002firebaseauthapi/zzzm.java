package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzzm<JcePrimitiveT> implements zzzn<JcePrimitiveT> {
    private final zzzp<JcePrimitiveT> zza;

    private zzzm(zzzp<JcePrimitiveT> zzzpVar) {
        this.zza = zzzpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzn
    public final JcePrimitiveT zza(String str) {
        Iterator<Provider> it = zzzj.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e3) {
                if (exc == null) {
                    exc = e3;
                }
            }
        }
        return this.zza.zza(str, null);
    }
}
