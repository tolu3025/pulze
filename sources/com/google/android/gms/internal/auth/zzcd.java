package com.google.android.gms.internal.auth;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    zzcd(Context context, zzdj zzdjVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = zzdjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zza.equals(zzdaVar.zza())) {
                zzdj zzdjVar = this.zzb;
                zzdj zzdjVarZzb = zzdaVar.zzb();
                if (zzdjVar != null ? zzdjVar.equals(zzdjVarZzb) : zzdjVarZzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdj zzdjVar = this.zzb;
        return iHashCode ^ (zzdjVar == null ? 0 : zzdjVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.auth.zzda
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    final zzdj zzb() {
        return this.zzb;
    }
}
