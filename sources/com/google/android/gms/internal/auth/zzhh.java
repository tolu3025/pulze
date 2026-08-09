package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class zzhh {
    final Unsafe zza;

    zzhh(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j3);

    public abstract float zzb(Object obj, long j3);

    public abstract void zzc(Object obj, long j3, boolean z2);

    public abstract void zzd(Object obj, long j3, double d3);

    public abstract void zze(Object obj, long j3, float f3);

    public abstract boolean zzf(Object obj, long j3);

    public final int zzg(Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzh(Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzi(Object obj, long j3) {
        return this.zza.getInt(obj, j3);
    }

    public final long zzj(Object obj, long j3) {
        return this.zza.getLong(obj, j3);
    }

    public final long zzk(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzl(Object obj, long j3) {
        return this.zza.getObject(obj, j3);
    }

    public final void zzm(Object obj, long j3, int i3) {
        this.zza.putInt(obj, j3, i3);
    }

    public final void zzn(Object obj, long j3, long j4) {
        this.zza.putLong(obj, j3, j4);
    }

    public final void zzo(Object obj, long j3, Object obj2) {
        this.zza.putObject(obj, j3, obj2);
    }
}
