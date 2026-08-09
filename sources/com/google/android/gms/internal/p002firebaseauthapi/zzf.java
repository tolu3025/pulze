package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzf {
    protected zzf() {
    }

    public int zza(CharSequence charSequence, int i3) {
        int length = charSequence.length();
        zzu.zza(i3, length, "index");
        while (i3 < length) {
            if (zza(charSequence.charAt(i3))) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public abstract boolean zza(char c3);
}
