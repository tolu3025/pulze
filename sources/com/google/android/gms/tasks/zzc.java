package com.google.android.gms.tasks;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    zzc(zzd zzdVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzdVar);
        this.zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.zza;
        if (task.isCanceled()) {
            this.zzb.zzd().zze();
            return;
        }
        try {
            this.zzb.zzd().zza(this.zzb.zzc().then(task));
        } catch (RuntimeExecutionException e3) {
            if (!(e3.getCause() instanceof Exception)) {
                this.zzb.zzd().zzc(e3);
                return;
            }
            zzd zzdVar = this.zzb;
            zzdVar.zzd().zzc((Exception) e3.getCause());
        } catch (Exception e4) {
            this.zzb.zzd().zzc(e4);
        }
    }
}
