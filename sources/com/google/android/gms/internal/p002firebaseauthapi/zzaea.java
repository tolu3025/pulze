package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import q0.C1157p;

/* JADX INFO: loaded from: classes.dex */
final class zzaea extends zzaff<zzair, Void> {
    private final zzaiu zzv;

    public zzaea(C1157p c1157p, String str) {
        super(12);
        AbstractC0643s.k(c1157p);
        this.zzv = zzaiu.zza(AbstractC0643s.e(c1157p.v()), str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(this.zzt);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
