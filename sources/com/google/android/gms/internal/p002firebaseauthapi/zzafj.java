package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.Q;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzafj implements zzafm {
    private final /* synthetic */ String zza;

    zzafj(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(Q.b bVar, Object... objArr) {
        bVar.onCodeSent(this.zza, Q.a.s());
    }
}
