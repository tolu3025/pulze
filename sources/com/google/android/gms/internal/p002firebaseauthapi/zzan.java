package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzan {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzan(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.zza) + "=" + String.valueOf(this.zzb) + " and " + String.valueOf(this.zza) + "=" + String.valueOf(this.zzc));
    }
}
