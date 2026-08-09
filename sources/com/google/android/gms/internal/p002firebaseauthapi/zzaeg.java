package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzaeg extends zzaff<Void, t0> {
    private final String zzv;

    public zzaeg(String str) {
        super(2);
        this.zzv = AbstractC0643s.f(str, "password cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "updatePassword";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        ((t0) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzc(this.zzd.zze(), this.zzv, this.zzb);
    }
}
