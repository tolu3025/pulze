package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class zzfn implements zzfu {
    private final zzfu[] zza;

    zzfn(zzfu... zzfuVarArr) {
        this.zza = zzfuVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final zzft zzb(Class cls) {
        zzfu[] zzfuVarArr = this.zza;
        for (int i3 = 0; i3 < 2; i3++) {
            zzfu zzfuVar = zzfuVarArr[i3];
            if (zzfuVar.zzc(cls)) {
                return zzfuVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzc(Class cls) {
        zzfu[] zzfuVarArr = this.zza;
        for (int i3 = 0; i3 < 2; i3++) {
            if (zzfuVarArr[i3].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
