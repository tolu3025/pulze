package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzakh {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzakl zzc;
    private int zze;
    private int zzf;

    private zzakh() {
        this.zzf = zzd;
        this.zzb = a.e.API_PRIORITY_OTHER;
    }

    public static int zza(int i3) {
        return (-(i3 & 1)) ^ (i3 >>> 1);
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzb(int i3);

    public abstract int zzc();

    public abstract void zzc(int i3);

    public abstract int zzd();

    public abstract void zzd(int i3);

    public abstract int zze();

    public abstract boolean zze(int i3);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzajv zzq();

    public abstract String zzr();

    public abstract String zzs();

    public final void zzt() throws zzall {
        if (this.zza + this.zze >= this.zzf) {
            throw zzall.zzh();
        }
    }

    public final void zzu() {
        if (this.zze == 0) {
            zzc(0);
        }
    }

    public final void zzv() throws zzall {
        int iZzi;
        do {
            iZzi = zzi();
            if (iZzi == 0) {
                return;
            }
            zzt();
            this.zze++;
            this.zze--;
        } while (zze(iZzi));
    }

    public abstract boolean zzw();

    public abstract boolean zzx();

    public static long zza(long j3) {
        return (-(j3 & 1)) ^ (j3 >>> 1);
    }

    static zzakh zza(byte[] bArr, int i3, int i4, boolean z2) {
        zzakk zzakkVar = new zzakk(bArr, i3, i4, z2);
        try {
            zzakkVar.zzb(i4);
            return zzakkVar;
        } catch (zzall e3) {
            throw new IllegalArgumentException(e3);
        }
    }
}
