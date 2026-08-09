package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.Q;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzafk implements zzafm {
    private final /* synthetic */ Status zza;

    zzafk(zzafh zzafhVar, Status status) {
        this.zza = status;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(Q.b bVar, Object... objArr) {
        bVar.onVerificationFailed(zzaen.zza(this.zza));
    }
}
