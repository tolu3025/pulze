package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.O;
import com.google.firebase.auth.Q;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzafi implements zzafm {
    private final /* synthetic */ O zza;

    zzafi(zzafh zzafhVar, O o2) {
        this.zza = o2;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(Q.b bVar, Object... objArr) {
        bVar.onVerificationCompleted(this.zza);
    }
}
