package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public class zzmz extends zzmx implements zzoj {
    protected zzmz(zzna zznaVar) {
        super(zznaVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zzoh
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzna zzl() {
        zznd zzndVarZzl;
        if (((zzna) this.zza).zzL()) {
            ((zzna) this.zza).zzb.zzg();
            zzndVarZzl = super.zzl();
        } else {
            zzndVarZzl = this.zza;
        }
        return (zzna) zzndVarZzl;
    }

    @Override // com.google.android.recaptcha.internal.zzmx
    protected final void zzo() {
        super.zzo();
        if (((zzna) this.zza).zzb != zzmt.zzd()) {
            zzna zznaVar = (zzna) this.zza;
            zznaVar.zzb = zznaVar.zzb.clone();
        }
    }
}
