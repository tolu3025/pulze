package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzoi extends zzcb {
    private final zzqe zza;

    public zzoi(zzqe zzqeVar) {
        this.zza = zzqeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoi)) {
            return false;
        }
        zzqe zzqeVar = ((zzoi) obj).zza;
        return this.zza.zza().zzd().equals(zzqeVar.zza().zzd()) && this.zza.zza().zzf().equals(zzqeVar.zza().zzf()) && this.zza.zza().zze().equals(zzqeVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzc());
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zza().zzf();
        int i3 = zzoh.zza[this.zza.zza().zzd().ordinal()];
        objArr[1] = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxz.RAW;
    }

    public final zzqe zzb() {
        return this.zza;
    }
}
