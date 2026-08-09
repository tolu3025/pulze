package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzkk {
    public static long zza(long j3, long j4) {
        long j5 = j3 + j4;
        zzkl.zza(((j3 ^ j4) < 0) | ((j3 ^ j5) >= 0), "checkedAdd", j3, j4);
        return j5;
    }

    public static long zzb(long j3, long j4) {
        long j5 = (-1) + j3;
        zzkl.zza(((1 ^ j3) >= 0) | ((j3 ^ j5) >= 0), "checkedSubtract", j3, 1L);
        return j5;
    }
}
