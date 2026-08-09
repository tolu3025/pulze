package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzrh;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzra extends zzrk {
    private final zzrh zza;
    private final zzaal zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    public static class zza {
        private zzrh zza;
        private zzaal zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzaal zzaalVar) {
            this.zzb = zzaalVar;
            return this;
        }

        public final zza zza(zzrh zzrhVar) {
            this.zza = zzrhVar;
            return this;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zzra zza() throws GeneralSecurityException {
            zzaaj zzaajVarZza;
            zzrh zzrhVar = this.zza;
            if (zzrhVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzrhVar.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzf() == zzrh.zzc.zzd) {
                zzaajVarZza = zzpe.zza;
            } else if (this.zza.zzf() == zzrh.zzc.zzc || this.zza.zzf() == zzrh.zzc.zzb) {
                zzaajVarZza = zzpe.zza(this.zzc.intValue());
            } else {
                if (this.zza.zzf() != zzrh.zzc.zza) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: " + String.valueOf(this.zza.zzf()));
                }
                zzaajVarZza = zzpe.zzb(this.zzc.intValue());
            }
            return new zzra(this.zza, this.zzb, zzaajVarZza, this.zzc);
        }
    }

    private zzra(zzrh zzrhVar, zzaal zzaalVar, zzaaj zzaajVar, Integer num) {
        this.zza = zzrhVar;
        this.zzb = zzaalVar;
        this.zzc = zzaajVar;
        this.zzd = num;
    }

    public static zza zzc() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrk, com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzrh) zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrk
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ zzrn zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrk
    public final zzaaj zze() {
        return this.zzc;
    }

    public final zzaal zzf() {
        return this.zzb;
    }
}
