package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zznz implements zzog {
    private final zzog[] zza;

    zznz(zzog... zzogVarArr) {
        this.zza = zzogVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final zzof zzb(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            zzog zzogVar = this.zza[i3];
            if (zzogVar.zzc(cls)) {
                return zzogVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final boolean zzc(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (this.zza[i3].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
