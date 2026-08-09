package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzaoc {
    static /* synthetic */ void zza(byte b3, byte b4, byte b5, byte b6, char[] cArr, int i3) throws zzall {
        if (zza(b4) || (((b3 << 28) + (b4 + 112)) >> 30) != 0 || zza(b5) || zza(b6)) {
            throw zzall.zzd();
        }
        int i4 = ((b3 & 7) << 18) | ((b4 & 63) << 12) | ((b5 & 63) << 6) | (b6 & 63);
        cArr[i3] = (char) ((i4 >>> 10) + 55232);
        cArr[i3 + 1] = (char) ((i4 & 1023) + 56320);
    }

    static /* synthetic */ void zza(byte b3, byte b4, byte b5, char[] cArr, int i3) throws zzall {
        if (zza(b4) || ((b3 == -32 && b4 < -96) || ((b3 == -19 && b4 >= -96) || zza(b5)))) {
            throw zzall.zzd();
        }
        cArr[i3] = (char) (((b3 & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
    }

    static /* synthetic */ void zza(byte b3, byte b4, char[] cArr, int i3) throws zzall {
        if (b3 < -62 || zza(b4)) {
            throw zzall.zzd();
        }
        cArr[i3] = (char) (((b3 & 31) << 6) | (b4 & 63));
    }

    static /* synthetic */ void zza(byte b3, char[] cArr, int i3) {
        cArr[i3] = (char) b3;
    }

    private static boolean zza(byte b3) {
        return b3 > -65;
    }
}
