package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import q0.r;

/* JADX INFO: loaded from: classes.dex */
final class zzabt implements zzafv<zzair> {
    private final /* synthetic */ zzaio zza;
    private final /* synthetic */ zzael zzb;

    zzabt(zzaar zzaarVar, zzaio zzaioVar, zzael zzaelVar) {
        this.zza = zzaioVar;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzair zzairVar) {
        zzair zzairVar2 = zzairVar;
        zzaio zzaioVar = this.zza;
        if (zzaioVar instanceof zzais) {
            this.zzb.zzb(zzairVar2.zza());
            return;
        }
        if (zzaioVar instanceof zzaiu) {
            this.zzb.zza(zzairVar2);
            return;
        }
        throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + this.zza.getClass().getName() + ".");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(r.a(str));
    }
}
