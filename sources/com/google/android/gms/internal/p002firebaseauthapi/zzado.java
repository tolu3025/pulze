package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzado extends zzaff<Void, t0> {
    public zzado() {
        super(2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "reload";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        ((t0) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzc(this.zzd.zze(), this.zzb);
    }
}
