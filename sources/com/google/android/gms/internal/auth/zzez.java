package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class zzez {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzei zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i3 = zzei.zza;
        zzeg zzegVar = new zzeg(bArr, 0, 0, false, null);
        try {
            zzegVar.zza(0);
            zzf = zzegVar;
        } catch (zzfa e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static int zza(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int iZzd = zzd(length, bArr, 0, length);
        if (iZzd == 0) {
            return 1;
        }
        return iZzd;
    }

    public static int zzc(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    static int zzd(int i3, byte[] bArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            i3 = (i3 * 31) + bArr[i6];
        }
        return i3;
    }

    static Object zze(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object zzf(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static Object zzg(Object obj, Object obj2) {
        return ((zzfw) obj).zzd().zzc((zzfw) obj2).zzg();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zzb);
    }

    public static boolean zzi(byte[] bArr) {
        return zzhm.zzc(bArr);
    }
}
