package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.InterfaceC0681i;
import com.google.firebase.auth.O;
import q0.C1150i;
import q0.H0;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzady extends zzaff<InterfaceC0681i, t0> {
    private final zzaan zzv;

    public zzady(O o2, String str) {
        super(2);
        AbstractC0643s.k(o2);
        this.zzv = new zzaan(o2, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "signInWithPhoneNumber";
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
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
