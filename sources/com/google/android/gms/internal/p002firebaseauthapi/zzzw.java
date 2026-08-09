package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class zzzw implements zzzp<Mac> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzp
    public final /* synthetic */ Mac zza(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
