package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.InterfaceC0681i;
import q0.C1150i;
import q0.H0;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzadw extends zzaff<InterfaceC0681i, t0> {
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzadw(String str, String str2, String str3, String str4) {
        super(2);
        AbstractC0643s.f(str, "email cannot be null or empty");
        AbstractC0643s.f(str2, "password cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
        this.zzx = str3;
        this.zzy = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "signInWithEmailAndPassword";
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
        zzaeoVar.zzb(this.zzv, this.zzw, this.zzx, this.zzy, this.zzb);
    }
}
