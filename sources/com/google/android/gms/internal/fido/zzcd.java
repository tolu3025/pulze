package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzcd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzcd(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < cArr.length; i3++) {
            char c3 = cArr[i3];
            boolean z2 = true;
            zzap.zzd(c3 < 128, "Non-ASCII character: %s", c3);
            if (bArr[c3] != -1) {
                z2 = false;
            }
            zzap.zzd(z2, "Duplicate character: %s", c3);
            bArr[c3] = (byte) i3;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzh == zzcdVar.zzh && Arrays.equals(this.zzf, zzcdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i3) {
        return this.zzf[i3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    final zzcd zzb() {
        int i3;
        boolean z2;
        for (char c3 : this.zzf) {
            if (zzad.zza(c3)) {
                char[] cArr = this.zzf;
                int length = cArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        z2 = false;
                        break;
                    }
                    char c4 = cArr[i4];
                    if (c4 >= 'A' && c4 <= 'Z') {
                        z2 = true;
                        break;
                    }
                    i4++;
                }
                if (!(!z2)) {
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                char[] cArr2 = new char[this.zzf.length];
                int i5 = 0;
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i5 >= cArr3.length) {
                        break;
                    }
                    char c5 = cArr3[i5];
                    if (zzad.zza(c5)) {
                        c5 ^= 32;
                    }
                    cArr2[i5] = (char) c5;
                    i5++;
                }
                zzcd zzcdVar = new zzcd(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzcdVar.zzh) {
                    return zzcdVar;
                }
                byte[] bArr = zzcdVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i3 = 65; i3 <= 90; i3++) {
                    int i6 = i3 | 32;
                    byte[] bArr2 = zzcdVar.zzg;
                    byte b3 = bArr2[i3];
                    byte b4 = bArr2[i6];
                    if (b3 == -1) {
                        bArrCopyOf[i3] = b4;
                    } else {
                        char c6 = (char) i3;
                        char c7 = (char) i6;
                        if (b4 != -1) {
                            throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c6), Character.valueOf(c7)));
                        }
                        bArrCopyOf[i6] = b3;
                    }
                }
                return new zzcd(zzcdVar.zze.concat(".ignoreCase()"), zzcdVar.zzf, bArrCopyOf, true);
            }
        }
        return this;
    }

    public final boolean zzc(char c3) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzcd(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzcj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i3 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i3;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i3];
            for (int i4 = 0; i4 < this.zzd; i4++) {
                zArr[zzcj.zza(i4 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z2;
        } catch (ArithmeticException e3) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e3);
        }
    }
}
