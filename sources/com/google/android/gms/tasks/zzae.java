package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
final class zzae<T> implements zzab<T> {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzae(int i3, zzw zzwVar) {
        this.zzb = i3;
        this.zzc = zzwVar;
    }

    private final void zza() {
        int i3 = this.zzd + this.zze + this.zzf;
        int i4 = this.zzb;
        if (i3 == i4) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zze();
                    return;
                } else {
                    this.zzc.zza(null);
                    return;
                }
            }
            zzw zzwVar = this.zzc;
            int i5 = this.zze;
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 8 + String.valueOf(i4).length() + 24);
            sb.append(i5);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            zzwVar.zzc(new ExecutionException(sb.toString(), this.zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t2) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
