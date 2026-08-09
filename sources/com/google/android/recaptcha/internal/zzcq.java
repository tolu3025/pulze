package com.google.android.recaptcha.internal;

import android.app.Application;
import c2.AbstractC0570k;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j3, M1.d dVar) {
        return zzcv.zzh(zza(application), str, j3, null, null, null, dVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j3) {
        return zzas.zza(AbstractC0570k.b(zza(application).zzd().zza(), null, null, new zzco(application, str, j3, null), 3, null));
    }

    public static final Object zzd(Application application, String str, M1.d dVar) {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, dVar, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(AbstractC0570k.b(zza(application).zzd().zza(), null, null, new zzcp(application, str, null), 3, null));
    }
}
