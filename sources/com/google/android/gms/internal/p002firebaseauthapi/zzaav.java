package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.C0683j;
import java.util.Objects;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
final class zzaav implements zzafv<zzahv> {
    private final /* synthetic */ C0683j zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzael zzc;
    private final /* synthetic */ zzaar zzd;

    zzaav(zzaar zzaarVar, C0683j c0683j, String str, zzael zzaelVar) {
        this.zza = c0683j;
        this.zzb = str;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzd = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zzd.zza(new zzagx(this.zza, zzahvVar.zzc(), this.zzb), this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzc.zza(r.a(str));
    }
}
