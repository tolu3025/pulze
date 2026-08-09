package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzakt {
    private final Object zza;
    private final int zzb;

    zzakt(Object obj, int i3) {
        this.zza = obj;
        this.zzb = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakt)) {
            return false;
        }
        zzakt zzaktVar = (zzakt) obj;
        return this.zza == zzaktVar.zza && this.zzb == zzaktVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
