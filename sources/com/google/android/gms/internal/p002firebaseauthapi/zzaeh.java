package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C0673e;

/* JADX INFO: loaded from: classes.dex */
final class zzaeh extends zzaff<Void, Void> {
    private final zzahm zzv;

    public zzaeh(String str, String str2, C0673e c0673e) {
        super(6);
        AbstractC0643s.e(str);
        AbstractC0643s.e(str2);
        AbstractC0643s.k(c0673e);
        this.zzv = zzahm.zza(c0673e, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzc(this.zzv, this.zzb);
    }
}
