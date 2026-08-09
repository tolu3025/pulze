package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
final class zzacc implements zzafv<zzahv> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    zzacc(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        this.zzb.zza.zza(new zzahi(zzahvVar2.zzc()), new zzacb(this, this, this.zza, zzahvVar2));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(r.a(str));
    }
}
