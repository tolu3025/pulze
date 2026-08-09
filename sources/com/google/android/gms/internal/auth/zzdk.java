package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class zzdk implements Serializable, zzdj {
    final zzdj zza;
    volatile transient boolean zzb;
    transient Object zzc;

    zzdk(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.zzb) {
            obj = "<supplier that returned " + this.zzc + ">";
        } else {
            obj = this.zza;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
