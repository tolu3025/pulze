package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.Q;
import com.google.firebase.auth.U;

/* JADX INFO: loaded from: classes.dex */
final class zzadz extends zzaff<Void, Q.b> {
    private final zzaaq zzv;

    public zzadz(U u2, String str, String str2, long j3, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4) {
        super(8);
        AbstractC0643s.k(u2);
        AbstractC0643s.e(str);
        this.zzv = new zzaaq(u2, str, str2, j3, z2, z3, str3, str4, str5, z4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
