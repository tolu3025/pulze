package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C;
import q0.L;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzacx extends zzaff<C, t0> {
    private final String zzv;

    public zzacx(String str) {
        super(1);
        AbstractC0643s.f(str, "refresh token cannot be null");
        this.zzv = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzv);
        }
        ((t0) this.zze).a(this.zzj, this.zzd);
        zzb(L.a(this.zzj.zzc()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzb);
    }
}
