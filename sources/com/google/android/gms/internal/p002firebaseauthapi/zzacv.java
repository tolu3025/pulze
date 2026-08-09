package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.I;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzacv extends zzaff<Void, t0> {
    private final I zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzacv(I i3, String str, String str2, String str3) {
        super(2);
        this.zzv = (I) AbstractC0643s.k(i3);
        this.zzw = AbstractC0643s.e(str);
        this.zzx = str2;
        this.zzy = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        ((t0) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzw, this.zzx, this.zzy, this.zzb);
    }
}
