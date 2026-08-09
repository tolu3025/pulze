package com.google.android.gms.internal.fido;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzay extends zzaz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaz zzc;

    zzay(zzaz zzazVar, int i3, int i4) {
        this.zzc = zzazVar;
        this.zza = i3;
        this.zzb = i4;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        zzap.zza(i3, this.zzb, "index");
        return this.zzc.get(i3 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i3, int i4) {
        return subList(i3, i4);
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzaz
    /* JADX INFO: renamed from: zzg */
    public final zzaz subList(int i3, int i4) {
        zzap.zze(i3, i4, this.zzb);
        zzaz zzazVar = this.zzc;
        int i5 = this.zza;
        return zzazVar.subList(i3 + i5, i4 + i5);
    }
}
