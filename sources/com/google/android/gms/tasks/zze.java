package com.google.android.gms.tasks;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    zze(zzf zzfVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzfVar);
        this.zzb = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.zzb.zzc().then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzf zzfVar = this.zzb;
            Executor executor = TaskExecutors.zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, zzfVar);
            task.addOnCanceledListener(executor, zzfVar);
        } catch (RuntimeExecutionException e3) {
            if (!(e3.getCause() instanceof Exception)) {
                this.zzb.zzd().zzc(e3);
                return;
            }
            zzf zzfVar2 = this.zzb;
            zzfVar2.zzd().zzc((Exception) e3.getCause());
        } catch (Exception e4) {
            this.zzb.zzd().zzc(e4);
        }
    }
}
