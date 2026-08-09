package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.Q;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzafl implements zzafm {
    private final /* synthetic */ String zza;

    zzafl(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(Q.b bVar, Object... objArr) {
        bVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
