package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
class zzcg extends zzch {
    private volatile zzch zza;
    final zzcd zzb;
    final Character zzc;

    zzcg(zzcd zzcdVar, Character ch) {
        this.zzb = zzcdVar;
        if (ch != null && zzcdVar.zzc('=')) {
            throw new IllegalArgumentException(zzaq.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.zzb.equals(zzcgVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzcgVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return iHashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                str = ".omitPadding()";
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                str = "')";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcg(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzch
    void zzb(Appendable appendable, byte[] bArr, int i3, int i4) {
        int i5 = 0;
        zzap.zze(0, i4, bArr.length);
        while (i5 < i4) {
            zze(appendable, bArr, i5, Math.min(this.zzb.zzd, i4 - i5));
            i5 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzch
    final int zzc(int i3) {
        zzcd zzcdVar = this.zzb;
        return zzcdVar.zzc * zzcj.zza(i3, zzcdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public final zzch zzd() {
        zzch zzchVarZza = this.zza;
        if (zzchVarZza == null) {
            zzcd zzcdVarZzb = this.zzb.zzb();
            zzchVarZza = zzcdVarZzb == this.zzb ? this : zza(zzcdVarZzb, this.zzc);
            this.zza = zzchVarZza;
        }
        return zzchVarZza;
    }

    final void zze(Appendable appendable, byte[] bArr, int i3, int i4) {
        zzap.zze(i3, i3 + i4, bArr.length);
        int i5 = 0;
        zzap.zzc(i4 <= this.zzb.zzd);
        long j3 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            j3 = (j3 | ((long) (bArr[i3 + i6] & 255))) << 8;
        }
        int i7 = ((i4 + 1) * 8) - this.zzb.zzb;
        while (i5 < i4 * 8) {
            zzcd zzcdVar = this.zzb;
            appendable.append(zzcdVar.zza(zzcdVar.zza & ((int) (j3 >>> (i7 - i5)))));
            i5 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i5 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i5 += this.zzb.zzb;
            }
        }
    }

    zzcg(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }
}
