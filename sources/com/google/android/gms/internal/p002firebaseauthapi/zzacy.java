package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.A;
import com.google.firebase.auth.I;
import com.google.firebase.auth.InterfaceC0681i;
import q0.C1150i;
import q0.H0;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzacy extends zzaff<InterfaceC0681i, t0> {
    private final I zzv;
    private final String zzw;
    private final String zzx;

    public zzacy(I i3, String str, String str2) {
        super(2);
        this.zzv = (I) AbstractC0643s.k(i3);
        this.zzw = AbstractC0643s.e(str);
        this.zzx = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        C1150i c1150iZza = zzacq.zza(this.zzc, this.zzk);
        A a3 = this.zzd;
        if (a3 != null && !a3.a().equalsIgnoreCase(c1150iZza.a())) {
            zza(new Status(17024));
        } else {
            ((t0) this.zze).a(this.zzj, c1150iZza);
            zzb(new H0(c1150iZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzw, this.zzv, this.zzx, this.zzb);
    }
}
