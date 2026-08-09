package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzaac implements zzsq {
    private final zzsq zza;
    private final zzsq zzb;

    private zzaac(zzsq zzsqVar, zzsq zzsqVar2) {
        this.zza = zzsqVar;
        this.zzb = zzsqVar2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i3) {
        return (bArr.length <= 64 ? this.zza : this.zzb).zza(bArr, i3);
    }
}
