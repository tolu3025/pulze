package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzlm implements zzlr {
    private final zzdi zza;
    private final int zzb;

    public zzlm(zzdi zzdiVar) {
        this.zza = zzdiVar;
        this.zzb = zzdiVar.zzb() + zzdiVar.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlr
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlr
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i3) throws GeneralSecurityException {
        if (bArr2.length < i3) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return zzzk.zza(zzdd.zze().zza(this.zza).zza(zzaal.zza(Arrays.copyOf(bArr, this.zza.zzb()), zzbf.zza())).zzb(zzaal.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzb() + this.zza.zzc()), zzbf.zza())).zza()).zza(Arrays.copyOfRange(bArr2, i3, bArr2.length), zzln.zza);
    }
}
