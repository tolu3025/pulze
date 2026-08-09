package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes.dex */
final class zzaw extends zzar {
    private final zzaz zza;

    zzaw(zzaz zzazVar, int i3) {
        super(zzazVar.size(), i3);
        this.zza = zzazVar;
    }

    @Override // com.google.android.gms.internal.fido.zzar
    protected final Object zza(int i3) {
        return this.zza.get(i3);
    }
}
