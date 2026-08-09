package com.google.android.recaptcha.internal;

import b2.p;

/* JADX INFO: loaded from: classes.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + p.M(String.valueOf(this.zzb / ((long) this.zza)), 10, (char) 0, 2, null) + " us| maxExecutionTime: " + p.M(String.valueOf(this.zzc), 10, (char) 0, 2, null) + " us| totalTime: " + p.M(String.valueOf(this.zzb), 10, (char) 0, 2, null) + " us| #Usages: " + p.M(String.valueOf(this.zza), 5, (char) 0, 2, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return L1.b.a(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j3) {
        this.zzc = j3;
    }

    public final void zzf(long j3) {
        this.zzb = j3;
    }

    public final void zzg(int i3) {
        this.zza = i3;
    }
}
