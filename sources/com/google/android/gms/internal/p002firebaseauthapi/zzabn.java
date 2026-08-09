package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
final class zzabn implements zzafv<zzahv> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    zzabn(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        zzail zzailVar = new zzail();
        zzailVar.zzd(zzahvVar2.zzc()).zzc(null).zzf(null);
        zzaar.zza(this.zzb, this.zza, zzahvVar2, zzailVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(r.a(str));
    }
}
