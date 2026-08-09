package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzbs implements zzoa {
    private static final zzbu zza = new zzbu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzbr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
        public final void zza(zzbs zzbsVar) {
            zzbs.zzd(zzbsVar);
        }
    };
    private final zzbi zzb;
    private final zzxc zzc;
    private final zzbk zzd;
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final zzbu zzh;

    private zzbs(zzbi zzbiVar, zzxc zzxcVar, int i3, boolean z2, boolean z3, zzbu zzbuVar) {
        this.zzb = zzbiVar;
        this.zzc = zzxcVar;
        int i4 = zzbo.zza[zzxcVar.ordinal()];
        this.zzd = i4 != 1 ? i4 != 2 ? zzbk.zzb : zzbk.zzc : zzbk.zza;
        this.zze = i3;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = zzbuVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoa
    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoa
    public final zzbi zzb() {
        this.zzh.zza(this);
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoa
    public final zzbk zzc() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzf;
    }

    static /* synthetic */ void zzd(zzbs zzbsVar) {
    }
}
