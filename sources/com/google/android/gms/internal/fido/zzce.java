package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzce extends zzcg {
    final char[] zza;

    private zzce(zzcd zzcdVar) {
        super(zzcdVar, null);
        this.zza = new char[512];
        zzap.zzc(zzcdVar.zzf.length == 16);
        for (int i3 = 0; i3 < 256; i3++) {
            this.zza[i3] = zzcdVar.zza(i3 >>> 4);
            this.zza[i3 | 256] = zzcdVar.zza(i3 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzce(zzcdVar);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    final void zzb(Appendable appendable, byte[] bArr, int i3, int i4) throws IOException {
        zzap.zze(0, i4, bArr.length);
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = bArr[i5] & 255;
            appendable.append(this.zza[i6]);
            appendable.append(this.zza[i6 | 256]);
        }
    }

    zzce(String str, String str2) {
        this(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
