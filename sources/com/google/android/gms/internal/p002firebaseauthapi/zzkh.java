package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkb;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public final class zzkh extends zzli {
    private final zzkb zza;
    private final ECPoint zzb;
    private final zzaaj zzc;
    private final zzaaj zzd;
    private final Integer zze;

    private zzkh(zzkb zzkbVar, ECPoint eCPoint, zzaaj zzaajVar, zzaaj zzaajVar2, Integer num) {
        this.zza = zzkbVar;
        this.zzb = eCPoint;
        this.zzc = zzaajVar;
        this.zzd = zzaajVar2;
        this.zze = num;
    }

    private static zzaaj zza(zzkb.zzd zzdVar, Integer num) {
        if (zzdVar == zzkb.zzd.zzc) {
            return zzpe.zza;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: " + String.valueOf(zzdVar));
        }
        if (zzdVar == zzkb.zzd.zzb) {
            return zzpe.zza(num.intValue());
        }
        if (zzdVar == zzkb.zzd.zza) {
            return zzpe.zzb(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: " + String.valueOf(zzdVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final Integer zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli
    /* JADX INFO: renamed from: zzc */
    public final /* synthetic */ zzlg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli
    public final zzaaj zzd() {
        return this.zzd;
    }

    public final zzaaj zze() {
        return this.zzc;
    }

    public final ECPoint zzf() {
        return this.zzb;
    }

    private static void zzb(zzkb.zzd zzdVar, Integer num) throws GeneralSecurityException {
        zzkb.zzd zzdVar2 = zzkb.zzd.zzc;
        if (zzdVar.equals(zzdVar2) || num != null) {
            if (zzdVar.equals(zzdVar2) && num != null) {
                throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
            }
        } else {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzdVar) + " variant.");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli, com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzkb) zza();
    }

    public static zzkh zza(zzkb zzkbVar, zzaaj zzaajVar, Integer num) throws GeneralSecurityException {
        if (!zzkbVar.zzd().equals(zzkb.zzc.zzd)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        zzb(zzkbVar.zzg(), num);
        if (zzaajVar.zza() == 32) {
            return new zzkh(zzkbVar, null, zzaajVar, zza(zzkbVar.zzg(), num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static zzkh zza(zzkb zzkbVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        if (zzkbVar.zzd().equals(zzkb.zzc.zzd)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        zzb(zzkbVar.zzg(), num);
        zzkb.zzc zzcVarZzd = zzkbVar.zzd();
        if (zzcVarZzd == zzkb.zzc.zza) {
            eCParameterSpec = zznj.zza;
        } else if (zzcVarZzd == zzkb.zzc.zzb) {
            eCParameterSpec = zznj.zzb;
        } else {
            if (zzcVarZzd != zzkb.zzc.zzc) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzcVarZzd));
            }
            eCParameterSpec = zznj.zzc;
        }
        zznj.zza(eCPoint, eCParameterSpec.getCurve());
        return new zzkh(zzkbVar, eCPoint, null, zza(zzkbVar.zzg(), num), num);
    }
}
