package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzlo implements zzlr {
    private final zzjf zza;
    private final int zzb;

    public zzlo(zzjf zzjfVar) {
        this.zza = zzjfVar;
        this.zzb = zzjfVar.zzb();
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
        return zzyx.zza(zzja.zzc().zza(this.zza).zza(zzaal.zza(bArr, zzbf.zza())).zza()).zza(Arrays.copyOfRange(bArr2, i3, bArr2.length), zzln.zza);
    }
}
