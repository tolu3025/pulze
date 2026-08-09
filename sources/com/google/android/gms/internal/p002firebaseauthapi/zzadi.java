package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C0683j;
import q0.C1150i;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzadi extends zzaff<Void, t0> {
    private final zzagx zzv;

    public zzadi(C0683j c0683j, String str) {
        super(2);
        AbstractC0643s.l(c0683j, "Credential cannot be null");
        this.zzv = new zzagx(c0683j, null, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        C1150i c1150iZza = zzacq.zza(this.zzc, this.zzk);
        if (!this.zzd.a().equalsIgnoreCase(c1150iZza.a())) {
            zza(new Status(17024));
        } else {
            ((t0) this.zze).a(this.zzj, c1150iZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
