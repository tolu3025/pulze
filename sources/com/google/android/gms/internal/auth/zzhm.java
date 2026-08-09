package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i3 = zzdr.zza;
        }
        zza = new zzhl();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i3, int i4) {
        byte b3 = bArr[i3 - 1];
        int i5 = i4 - i3;
        if (i5 != 0) {
            if (i5 == 1) {
                byte b4 = bArr[i3];
                if (b3 <= -12 && b4 <= -65) {
                    return b3 ^ (b4 << 8);
                }
            } else {
                if (i5 != 2) {
                    throw new AssertionError();
                }
                byte b5 = bArr[i3];
                byte b6 = bArr[i3 + 1];
                if (b3 <= -12 && b5 <= -65 && b6 <= -65) {
                    return ((b5 << 8) ^ b3) ^ (b6 << 16);
                }
            }
        } else if (b3 <= -12) {
            return b3;
        }
        return -1;
    }

    static String zzb(byte[] bArr, int i3, int i4) throws zzfa {
        int length = bArr.length;
        if ((i3 | i4 | ((length - i3) - i4)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i3), Integer.valueOf(i4)));
        }
        int i5 = i3 + i4;
        char[] cArr = new char[i4];
        int i6 = 0;
        while (i3 < i5) {
            byte b3 = bArr[i3];
            if (!zzhj.zzd(b3)) {
                break;
            }
            i3++;
            cArr[i6] = (char) b3;
            i6++;
        }
        int i7 = i6;
        while (i3 < i5) {
            int i8 = i3 + 1;
            byte b4 = bArr[i3];
            if (zzhj.zzd(b4)) {
                cArr[i7] = (char) b4;
                i7++;
                i3 = i8;
                while (i3 < i5) {
                    byte b5 = bArr[i3];
                    if (!zzhj.zzd(b5)) {
                        break;
                    }
                    i3++;
                    cArr[i7] = (char) b5;
                    i7++;
                }
            } else if (b4 < -32) {
                if (i8 >= i5) {
                    throw zzfa.zzb();
                }
                i3 += 2;
                zzhj.zzc(b4, bArr[i8], cArr, i7);
                i7++;
            } else if (b4 < -16) {
                if (i8 >= i5 - 1) {
                    throw zzfa.zzb();
                }
                int i9 = i3 + 2;
                i3 += 3;
                zzhj.zzb(b4, bArr[i8], bArr[i9], cArr, i7);
                i7++;
            } else {
                if (i8 >= i5 - 2) {
                    throw zzfa.zzb();
                }
                int i10 = i3 + 2;
                int i11 = i3 + 3;
                i3 += 4;
                zzhj.zza(b4, bArr[i8], bArr[i10], bArr[i11], cArr, i7);
                i7 += 2;
            }
        }
        return new String(cArr, 0, i7);
    }

    static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    static boolean zzd(byte[] bArr, int i3, int i4) {
        return zza.zzb(bArr, i3, i4);
    }
}
