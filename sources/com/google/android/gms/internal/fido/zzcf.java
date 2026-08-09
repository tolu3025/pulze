package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzcf extends zzcg {
    private zzcf(zzcd zzcdVar, Character ch) {
        super(zzcdVar, ch);
        zzap.zzc(zzcdVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcf(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    final void zzb(Appendable appendable, byte[] bArr, int i3, int i4) throws IOException {
        int i5 = 0;
        zzap.zze(0, i4, bArr.length);
        for (int i6 = i4; i6 >= 3; i6 -= 3) {
            int i7 = bArr[i5] & 255;
            int i8 = ((bArr[i5 + 1] & 255) << 8) | (i7 << 16) | (bArr[i5 + 2] & 255);
            appendable.append(this.zzb.zza(i8 >>> 18));
            appendable.append(this.zzb.zza((i8 >>> 12) & 63));
            appendable.append(this.zzb.zza((i8 >>> 6) & 63));
            appendable.append(this.zzb.zza(i8 & 63));
            i5 += 3;
        }
        if (i5 < i4) {
            zze(appendable, bArr, i5, i4 - i5);
        }
    }

    zzcf(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }
}
