package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzh extends zzi {
    private final char zza;

    zzh(char c3) {
        this.zza = c3;
    }

    public final String toString() {
        char c3 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(c3 & 15);
            c3 = (char) (c3 >> 4);
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean zza(char c3) {
        return c3 == this.zza;
    }
}
