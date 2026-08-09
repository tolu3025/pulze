package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C0673e;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzadp extends zzaff<Void, t0> {
    private final zzahm zzv;
    private final String zzw;

    public zzadp(String str, C0673e c0673e, String str2, String str3, String str4) {
        super(4);
        AbstractC0643s.f(str, "email cannot be null or empty");
        zzahm zzahmVar = new zzahm(c0673e.A());
        this.zzv = zzahmVar;
        zzahmVar.zzb(str);
        zzahmVar.zza(c0673e);
        zzahmVar.zzc(str2);
        zzahmVar.zza(str3);
        this.zzw = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzb);
    }
}
