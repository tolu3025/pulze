package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzhl implements zzgx {
    public static final zzhl zza = new zzhl();

    private zzhl() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i3, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        zzgdVar.zzc().zze(i3, zzgdVar.zzc().zza(zzueVarArr[0]));
    }
}
