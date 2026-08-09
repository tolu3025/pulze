package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzjv {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    zzjv() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjv) {
            zzjv zzjvVar = (zzjv) obj;
            if (zzb() == zzjvVar.zzb() && zzc(zzjvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] bArrZze = zze();
        int i3 = bArrZze[0] & 255;
        for (int i4 = 1; i4 < bArrZze.length; i4++) {
            i3 |= (bArrZze[i4] & 255) << (i4 * 8);
        }
        return i3;
    }

    public final String toString() {
        byte[] bArrZze = zze();
        int length = bArrZze.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b3 : bArrZze) {
            char[] cArr = zza;
            sb.append(cArr[(b3 >> 4) & 15]);
            sb.append(cArr[b3 & 15]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    abstract boolean zzc(zzjv zzjvVar);

    public abstract byte[] zzd();

    byte[] zze() {
        throw null;
    }
}
