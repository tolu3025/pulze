package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import com.google.android.gms.internal.p002firebaseauthapi.zzxh;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbm implements zzob {
    private final List<zzbs> zza;
    private final zzok zzb;
    private final zzbm zzc;

    private zzbm(zzxh zzxhVar, List<zzbs> list, zzok zzokVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzokVar;
        if (zziu.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzxh.zzb zzbVar : zzxhVar.zze()) {
                if (hashSet.contains(Integer.valueOf(zzbVar.zza()))) {
                    throw new GeneralSecurityException("KeyID " + zzbVar.zza() + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
                hashSet.add(Integer.valueOf(zzbVar.zza()));
            }
            if (!hashSet.contains(Integer.valueOf(zzxhVar.zzb()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    private final zzbm zze() {
        zzbm zzbmVar = this.zzc;
        return zzbmVar == null ? this : zzbmVar;
    }

    public final String toString() {
        return zzcm.zza(zzd()).toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
    public final int zza() {
        return this.zza.size();
    }

    public final zzbm zzb() throws GeneralSecurityException {
        zzbi zzofVar;
        boolean z2;
        zzbs zzbsVar;
        zzxh.zzb zzbVarZzb;
        zzxh zzxhVarZzd = zzd();
        zzxh.zza zzaVarZzc = zzxh.zzc();
        ArrayList arrayList = new ArrayList(this.zza.size());
        int i3 = 0;
        for (zzbs zzbsVar2 : this.zza) {
            if (zzbsVar2.zzb() instanceof zzce) {
                zzbi zzbiVarZzc = ((zzce) zzbsVar2.zzb()).zzc();
                zzbs zzbsVar3 = new zzbs(zzbiVarZzc, zzbsVar2.zzc, zzbsVar2.zza(), zzbsVar2.zze(), false, zzbs.zza);
                zzbVarZzb = zzb(zzbiVarZzc, zzbsVar2.zzc, zzbsVar2.zza());
                zzbsVar = zzbsVar3;
            } else {
                zzxh.zzb zzbVarZza = zzxhVarZzd.zza(i3);
                zzwx zzwxVarZzb = zzbVarZza.zzb();
                if (zzwxVarZzb.zzb() != zzwx.zzb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
                zzxh.zzb zzbVar = (zzxh.zzb) ((zzalf) zzbVarZza.zzn().zza(zzci.zza(zzwxVarZzb.zzf(), zzwxVarZzb.zze())).zze());
                try {
                    zzofVar = zza(zzbVar);
                    z2 = false;
                } catch (GeneralSecurityException e3) {
                    if (zziu.zza.zza()) {
                        throw e3;
                    }
                    zzofVar = new zzof(zzb(zzbVar), zzch.zza());
                    z2 = true;
                }
                int iZza = zzbVar.zza();
                zzbsVar = new zzbs(zzofVar, zzbsVar2.zzc, iZza, iZza == zzxhVarZzd.zzb(), z2, zzbs.zza);
                zzbVarZzb = zzbVar;
            }
            zzaVarZzc.zza(zzbVarZzb);
            arrayList.add(zzbsVar);
            i3++;
        }
        zzaVarZzc.zza(zzxhVarZzd.zzb());
        return zzb(new zzbm((zzxh) ((zzalf) zzaVarZzc.zze()), arrayList, this.zzb));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
    public final /* synthetic */ zzoa zzc() {
        for (zzbs zzbsVar : this.zza) {
            if (zzbsVar != null && zzbsVar.zze()) {
                if (zzbsVar.zzc() == zzbk.zza) {
                    return zzbsVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    final zzxh zzd() {
        try {
            zzxh.zza zzaVarZzc = zzxh.zzc();
            for (zzbs zzbsVar : this.zza) {
                zzaVarZzc.zza(zzb(zzbsVar.zzb(), zzbsVar.zzc, zzbsVar.zza()));
                if (zzbsVar.zze()) {
                    zzaVarZzc.zza(zzbsVar.zza());
                }
            }
            return (zzxh) ((zzalf) zzaVarZzc.zze());
        } catch (GeneralSecurityException e3) {
            throw new zzql(e3);
        }
    }

    private static zzbi zza(zzxh.zzb zzbVar) {
        zzqb zzqbVarZzb = zzb(zzbVar);
        zzoz zzozVarZza = zzoz.zza();
        zzch zzchVarZza = zzch.zza();
        return !zzozVarZza.zzb(zzqbVarZzb) ? new zzof(zzqbVarZzb, zzchVarZza) : zzozVarZza.zza(zzqbVarZzb, zzchVarZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzbm zzb(final zzbm zzbmVar) {
        final zzok zzokVar = zzbmVar.zzb;
        if (zzokVar.zza()) {
            return zzbmVar;
        }
        zzbu zzbuVar = new zzbu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzbl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
            public final void zza(zzbs zzbsVar) {
                zzow.zzb().zza().zza(this.zza, zzokVar, "keyset_handle", "get_key").zza(zzbsVar.zza());
            }
        };
        ArrayList arrayList = new ArrayList(zzbmVar.zza.size());
        for (zzbs zzbsVar : zzbmVar.zza) {
            arrayList.add(new zzbs(zzbsVar.zzb, zzbsVar.zzc, zzbsVar.zze, zzbsVar.zzf, zzbsVar.zzg, zzbuVar));
        }
        return new zzbm(arrayList, zzokVar, zzbmVar);
    }

    private static List<zzbs> zzc(zzxh zzxhVar) throws GeneralSecurityException {
        zzbi zzofVar;
        boolean z2;
        ArrayList arrayList = new ArrayList(zzxhVar.zza());
        for (zzxh.zzb zzbVar : zzxhVar.zze()) {
            int iZza = zzbVar.zza();
            try {
                zzofVar = zza(zzbVar);
                z2 = false;
            } catch (GeneralSecurityException e3) {
                if (zziu.zza.zza()) {
                    throw e3;
                }
                zzofVar = new zzof(zzb(zzbVar), zzch.zza());
                z2 = true;
            }
            if (zziu.zza.zza() && !zza(zzbVar.zzc())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new zzbs(zzofVar, zzbVar.zzc(), iZza, iZza == zzxhVar.zzb(), z2, zzbs.zza));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(zzxh zzxhVar) throws GeneralSecurityException {
        if (zzxhVar == null || zzxhVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private zzbm(List<zzbs> list, zzok zzokVar, zzbm zzbmVar) {
        this.zza = list;
        this.zzb = zzokVar;
        this.zzc = zzbmVar;
    }

    public static final zzbm zza(zzbj zzbjVar) {
        return new zzbn().zza(new zzbq(zzbjVar.zza()).zzb().zza()).zza();
    }

    private static zzqb zzb(zzxh.zzb zzbVar) {
        return zzqb.zza(zzbVar.zzb().zzf(), zzbVar.zzb().zze(), zzbVar.zzb().zzb(), zzbVar.zzf(), zzbVar.zzf() == zzxz.RAW ? null : Integer.valueOf(zzbVar.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzxh.zzb zzb(zzbi zzbiVar, zzxc zzxcVar, int i3) throws GeneralSecurityException {
        zzqb zzqbVar = (zzqb) zzoz.zza().zza(zzbiVar, zzqb.class, zzch.zza());
        Integer numZze = zzqbVar.zze();
        if (numZze == null || numZze.intValue() == i3) {
            return (zzxh.zzb) ((zzalf) zzxh.zzb.zzd().zza(zzwx.zza().zza(zzqbVar.zzf()).zza(zzqbVar.zzd()).zza(zzqbVar.zza())).zza(zzxcVar).zza(i3).zza(zzqbVar.zzb()).zze());
        }
        throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
    }

    @Deprecated
    public static final zzbm zza(zzbv zzbvVar, zzba zzbaVar, byte[] bArr) throws GeneralSecurityException {
        zzvv zzvvVarZza = zzbvVar.zza();
        if (zzvvVarZza == null || zzvvVarZza.zzc().zzb() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return zza(zza(zzvvVarZza, zzbaVar, bArr));
    }

    static final zzbm zza(zzxh zzxhVar) throws GeneralSecurityException {
        zzd(zzxhVar);
        return new zzbm(zzxhVar, zzc(zzxhVar), zzok.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
    public final /* synthetic */ zzoa zza(int i3) {
        if (i3 < 0 || i3 >= zza()) {
            throw new IndexOutOfBoundsException("Invalid index " + i3 + " for keyset of size " + zza());
        }
        zzbs zzbsVar = this.zza.get(i3);
        if (!zza(zzbsVar.zzc)) {
            throw new IllegalStateException("Keyset-Entry at position " + i3 + " has wrong status");
        }
        if (!zzbsVar.zzg) {
            return this.zza.get(i3);
        }
        throw new IllegalStateException("Keyset-Entry at position " + i3 + " didn't parse correctly");
    }

    static /* synthetic */ zzxc zza(zzbk zzbkVar) {
        if (zzbk.zza.equals(zzbkVar)) {
            return zzxc.ENABLED;
        }
        if (zzbk.zzb.equals(zzbkVar)) {
            return zzxc.DISABLED;
        }
        if (zzbk.zzc.equals(zzbkVar)) {
            return zzxc.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static zzxh zza(zzvv zzvvVar, zzba zzbaVar, byte[] bArr) throws GeneralSecurityException {
        try {
            zzxh zzxhVarZza = zzxh.zza(zzbaVar.zza(zzvvVar.zzc().zzd(), bArr), zzaku.zza());
            zzd(zzxhVarZza);
            return zzxhVarZza;
        } catch (zzall unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final <P> P zza(zzbb zzbbVar, Class<P> cls) throws GeneralSecurityException {
        if (!(zzbbVar instanceof zznp)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zznp zznpVar = (zznp) zzbbVar;
        zzxh zzxhVarZzd = zze().zzd();
        zzcm.zzb(zzxhVarZzd);
        for (int i3 = 0; i3 < zza(); i3++) {
            if (this.zza.get(i3).zzg || !zza(this.zza.get(i3).zzc)) {
                throw new GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + zzxhVarZzd.zza(i3).zzb().zzf() + " failed, unable to get primitive");
            }
        }
        return (P) zznpVar.zza(zze(), this.zzb, cls);
    }

    @Deprecated
    public final void zza(zzby zzbyVar) throws GeneralSecurityException {
        zzxh zzxhVarZzd = zzd();
        for (zzxh.zzb zzbVar : zzxhVarZzd.zze()) {
            if (zzbVar.zzb().zzb() == zzwx.zzb.UNKNOWN_KEYMATERIAL || zzbVar.zzb().zzb() == zzwx.zzb.SYMMETRIC || zzbVar.zzb().zzb() == zzwx.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzbVar.zzb().zzb().name(), zzbVar.zzb().zzf()));
            }
        }
        zzbyVar.zza(zzxhVarZzd);
    }

    @Deprecated
    public final void zza(zzby zzbyVar, zzba zzbaVar, byte[] bArr) {
        zzxh zzxhVarZzd = zzd();
        zzbyVar.zza((zzvv) ((zzalf) zzvv.zza().zza(zzajv.zza(zzbaVar.zzb(zzxhVarZzd.zzk(), bArr))).zza(zzcm.zza(zzxhVarZzd)).zze()));
    }

    private static boolean zza(zzxc zzxcVar) {
        int i3 = zzbo.zza[zzxcVar.ordinal()];
        return i3 == 1 || i3 == 2 || i3 == 3;
    }
}
