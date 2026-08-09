package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzce extends Exception {
    private final Throwable zza;
    private final zztd zzb;
    private final int zzc;
    private final int zzd;

    public zzce(int i3, int i4, Throwable th) {
        this.zzc = i3;
        this.zzd = i4;
        this.zza = th;
        zztd zztdVarZzf = zzte.zzf();
        zztdVarZzf.zzq(i4);
        zztdVarZzf.zzr(i3);
        this.zzb = zztdVarZzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zztd zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
