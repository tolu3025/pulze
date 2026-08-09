package com.google.android.recaptcha.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class zzju extends zzjv implements Serializable {
    final byte[] zza;

    zzju(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        }
        throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    final boolean zzc(zzjv zzjvVar) {
        if (this.zza.length != zzjvVar.zze().length) {
            return false;
        }
        boolean z2 = true;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i3 >= bArr.length) {
                return z2;
            }
            z2 &= bArr[i3] == zzjvVar.zze()[i3];
            i3++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    final byte[] zze() {
        return this.zza;
    }
}
