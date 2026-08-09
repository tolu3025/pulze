package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzbz {
    public static zzbm zza(zzbv zzbvVar, zzch zzchVar) {
        if (zzchVar != null) {
            return zzbm.zza(zzbvVar.zzb());
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void zza(zzbm zzbmVar, zzby zzbyVar, zzch zzchVar) {
        if (zzchVar == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        zzbyVar.zza(zzbmVar.zzd());
    }
}
