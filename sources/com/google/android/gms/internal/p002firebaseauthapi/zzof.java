package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzof extends zzbi {
    private final zzqb zza;

    private static class zza extends zzcb {
        private final String zza;
        private final zzxz zzb;

        private zza(String str, zzxz zzxzVar) {
            this.zza = str;
            this.zzb = zzxzVar;
        }

        public final String toString() {
            Object[] objArr = new Object[2];
            objArr[0] = this.zza;
            int i3 = zzoe.zza[this.zzb.ordinal()];
            objArr[1] = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
            return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
        public final boolean zza() {
            return this.zzb != zzxz.RAW;
        }
    }

    public zzof(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        zza(zzqbVar, zzchVar);
        this.zza = zzqbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final zzcb zza() {
        return new zza(this.zza.zzf(), this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzaaj zzc() throws GeneralSecurityException {
        zzqb zzqbVar = this.zza;
        if (zzqbVar.zzb().equals(zzxz.RAW)) {
            return zzaaj.zza(new byte[0]);
        }
        if (zzqbVar.zzb().equals(zzxz.TINK)) {
            return zzpe.zzb(zzqbVar.zze().intValue());
        }
        if (zzqbVar.zzb().equals(zzxz.LEGACY) || zzqbVar.zzb().equals(zzxz.CRUNCHY)) {
            return zzpe.zza(zzqbVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    public final zzqb zza(zzch zzchVar) throws GeneralSecurityException {
        zza(this.zza, zzchVar);
        return this.zza;
    }

    private static void zza(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        int i3 = zzoe.zzb[zzqbVar.zza().ordinal()];
        if (i3 == 1 || i3 == 2) {
            zzch.zza(zzchVar);
        }
    }
}
