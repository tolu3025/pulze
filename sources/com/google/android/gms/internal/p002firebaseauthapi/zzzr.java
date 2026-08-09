package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public final class zzzr implements zzzp<KeyAgreement> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzp
    public final /* synthetic */ KeyAgreement zza(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
