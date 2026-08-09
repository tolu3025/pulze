package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class zzzt implements zzzp<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzp
    public final /* synthetic */ KeyPairGenerator zza(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
