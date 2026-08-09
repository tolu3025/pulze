package com.google.android.gms.tasks;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzo implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzp zzb;

    zzo(zzp zzpVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzpVar);
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.zzb.zzc().then(this.zza.getResult());
            if (taskThen == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzp zzpVar = this.zzb;
            Executor executor = TaskExecutors.zza;
            taskThen.addOnSuccessListener(executor, zzpVar);
            taskThen.addOnFailureListener(executor, zzpVar);
            taskThen.addOnCanceledListener(executor, zzpVar);
        } catch (RuntimeExecutionException e3) {
            if (e3.getCause() instanceof Exception) {
                this.zzb.onFailure((Exception) e3.getCause());
            } else {
                this.zzb.onFailure(e3);
            }
        } catch (CancellationException unused) {
            this.zzb.onCanceled();
        } catch (Exception e4) {
            this.zzb.onFailure(e4);
        }
    }
}
