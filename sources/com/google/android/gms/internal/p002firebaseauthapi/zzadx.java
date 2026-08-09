package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;
import q0.C1157p;
import q0.t0;

/* JADX INFO: loaded from: classes.dex */
final class zzadx extends zzaff<Void, t0> {
    private final boolean zzaa;
    private final String zzab;
    private final String zzac;
    private final String zzad;
    private final boolean zzae;
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final long zzy;
    private final boolean zzz;

    public zzadx(C1157p c1157p, String str, String str2, long j3, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4) {
        super(8);
        AbstractC0643s.k(c1157p);
        AbstractC0643s.e(str);
        this.zzv = AbstractC0643s.e(c1157p.v());
        this.zzw = str;
        this.zzx = str2;
        this.zzy = j3;
        this.zzz = z2;
        this.zzaa = z3;
        this.zzab = str3;
        this.zzac = str4;
        this.zzad = str5;
        this.zzae = z4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzb);
    }
}
