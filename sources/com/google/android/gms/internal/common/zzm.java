package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
final class zzm extends zzl {
    private final char zza;

    zzm(char c3) {
        this.zza = c3;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i3 = this.zza;
        for (int i4 = 0; i4 < 4; i4++) {
            cArr[5 - i4] = "0123456789ABCDEF".charAt(i3 & 15);
            i3 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(strCopyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(strCopyValueOf);
        sb.append("')");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.common.zzp
    public final boolean zza(char c3) {
        return c3 == this.zza;
    }
}
