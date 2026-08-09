package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzch {
    private static final zzch zza = new zzcf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzch zzb = new zzcf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzch zzc = new zzcg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzch zzd = new zzcg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzch zze = new zzce("base16()", "0123456789ABCDEF");

    zzch() {
    }

    public static zzch zzf() {
        return zze;
    }

    abstract void zzb(Appendable appendable, byte[] bArr, int i3, int i4);

    abstract int zzc(int i3);

    public abstract zzch zzd();

    public final String zzg(byte[] bArr, int i3, int i4) {
        zzap.zze(0, i4, bArr.length);
        StringBuilder sb = new StringBuilder(zzc(i4));
        try {
            zzb(sb, bArr, 0, i4);
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
