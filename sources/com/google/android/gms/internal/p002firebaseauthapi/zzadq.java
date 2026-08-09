package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C0673e;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzadq extends zzaff<Void, t0> {
    private final zzahm zzv;

    public zzadq(String str, C0673e c0673e) {
        super(6);
        AbstractC0643s.f(str, "token cannot be null or empty");
        zzahm zzahmVar = new zzahm(4);
        this.zzv = zzahmVar;
        zzahmVar.zzd(str);
        if (c0673e != null) {
            zzahmVar.zza(c0673e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
