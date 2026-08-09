package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzhf extends zzhh {
    zzhf(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final double zza(Object obj, long j3) {
        return Double.longBitsToDouble(zzj(obj, j3));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final float zzb(Object obj, long j3) {
        return Float.intBitsToFloat(zzi(obj, j3));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzc(Object obj, long j3, boolean z2) {
        if (zzhi.zza) {
            zzhi.zzi(obj, j3, z2);
        } else {
            zzhi.zzj(obj, j3, z2);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzd(Object obj, long j3, double d3) {
        zzn(obj, j3, Double.doubleToLongBits(d3));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zze(Object obj, long j3, float f3) {
        zzm(obj, j3, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final boolean zzf(Object obj, long j3) {
        return zzhi.zza ? zzhi.zzq(obj, j3) : zzhi.zzr(obj, j3);
    }
}
