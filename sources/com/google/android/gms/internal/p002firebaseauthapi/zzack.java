package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.C0676f0;
import java.util.Objects;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
final class zzack implements zzafv<zzahv> {
    private final /* synthetic */ C0676f0 zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaar zzc;

    zzack(zzaar zzaarVar, C0676f0 c0676f0, zzael zzaelVar) {
        this.zza = c0676f0;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        zzail zzailVar = new zzail();
        zzailVar.zzd(zzahvVar2.zzc());
        if (this.zza.t() || this.zza.p() != null) {
            zzailVar.zzb(this.zza.p());
        }
        if (this.zza.u() || this.zza.s() != null) {
            zzailVar.zzg(this.zza.zza());
        }
        zzaar.zza(this.zzc, this.zzb, zzahvVar2, zzailVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(r.a(str));
    }
}
