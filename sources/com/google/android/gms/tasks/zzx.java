package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzx implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ Callable zzb;

    zzx(zzw zzwVar, Callable callable) {
        this.zza = zzwVar;
        this.zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zza(this.zzb.call());
        } catch (Exception e3) {
            this.zza.zzc(e3);
        } catch (Throwable th) {
            this.zza.zzc(new RuntimeException(th));
        }
    }
}
