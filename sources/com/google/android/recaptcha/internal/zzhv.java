package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zzhv {
    private static final zzhu zza = new zzhu(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    private final zzhu zzb;
    private long zzc;

    public zzhv(long j3, long j4, zzhu zzhuVar) {
        this.zzb = zzhuVar;
        this.zzc = Math.abs(j3);
    }

    public final long zza() {
        zzhu zzhuVar = this.zzb;
        long jLongValue = (BigInteger.valueOf(zzhuVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzhuVar.zza())).longValue() + 11) % this.zzb.zza();
        this.zzc = jLongValue;
        return jLongValue % 255;
    }
}
