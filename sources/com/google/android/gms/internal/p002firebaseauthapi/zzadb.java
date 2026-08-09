package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC0679h;
import com.google.firebase.auth.InterfaceC0681i;
import q0.C1150i;
import q0.H0;
import q0.s0;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzadb extends zzaff<InterfaceC0681i, t0> {
    private final zzajb zzv;

    public zzadb(AbstractC0679h abstractC0679h) {
        super(2);
        AbstractC0643s.l(abstractC0679h, "credential cannot be null");
        this.zzv = s0.a(abstractC0679h, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "linkFederatedCredential";
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
        zzaeoVar.zza(this.zzd.zze(), this.zzv, this.zzb);
    }
}
