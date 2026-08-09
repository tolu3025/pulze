package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.X;
import java.util.List;
import q0.C1161u;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzacw extends zzaff<X, t0> {
    private final String zzv;
    private final String zzw;

    public zzacw(String str, String str2) {
        super(3);
        AbstractC0643s.f(str, "email cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(new C1161u(this.zzl.zza() == null ? zzah.zzg() : (List) AbstractC0643s.k(this.zzl.zza())));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zze(this.zzv, this.zzw, this.zzb);
    }
}
