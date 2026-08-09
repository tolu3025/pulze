package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
final class zzabv implements zzafv<zzagy> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzabw zzb;

    zzabv(zzabw zzabwVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzabwVar);
        this.zzb = zzabwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzagy zzagyVar) {
        zzagy zzagyVar2 = zzagyVar;
        this.zzb.zza.zza(new zzahv(zzagyVar2.zzb(), zzagyVar2.zza(), Long.valueOf(zzahx.zza(zzagyVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(r.a(str));
    }
}
