package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
final class zzae extends zzz {
    private final zzah zza;

    zzae(zzah zzahVar, int i3) {
        super(zzahVar.size(), i3);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final Object zza(int i3) {
        return this.zza.get(i3);
    }
}
