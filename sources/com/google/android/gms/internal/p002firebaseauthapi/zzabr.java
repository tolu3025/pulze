package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.Objects;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
final class zzabr implements zzafv<zzajl> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzabs zzb;

    zzabr(zzabs zzabsVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzabsVar);
        this.zzb = zzabsVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajl zzajlVar) {
        zzajl zzajlVar2 = zzajlVar;
        if (TextUtils.isEmpty(zzajlVar2.zza()) || TextUtils.isEmpty(zzajlVar2.zzb())) {
            this.zza.zza(r.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        this.zzb.zza.zza(new zzahv(zzajlVar2.zzb(), zzajlVar2.zza(), Long.valueOf(zzahx.zza(zzajlVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(r.a(str));
    }
}
