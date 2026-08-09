package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C0683j;
import com.google.firebase.auth.InterfaceC0681i;
import q0.C1150i;
import q0.H0;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzadd extends zzaff<InterfaceC0681i, t0> {
    private final C0683j zzv;

    public zzadd(C0683j c0683j) {
        super(2);
        this.zzv = (C0683j) AbstractC0643s.l(c0683j, "credential cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        C1150i c1150iZza = zzacq.zza(this.zzc, this.zzk);
        ((t0) this.zze).a(this.zzj, c1150iZza);
        zzb(new H0(c1150iZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(new zzagx(this.zzv.v(this.zzd), null, null), this.zzb);
    }
}
