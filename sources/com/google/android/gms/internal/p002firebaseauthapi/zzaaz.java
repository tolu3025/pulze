package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.E0;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzaaz implements zzafv<zzahl> {
    private final /* synthetic */ zzafs zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ E0 zze;
    private final /* synthetic */ zzael zzf;
    private final /* synthetic */ zzahv zzg;

    zzaaz(zzaar zzaarVar, zzafs zzafsVar, String str, String str2, Boolean bool, E0 e02, zzael zzaelVar, zzahv zzahvVar) {
        this.zza = zzafsVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = e02;
        this.zzf = zzaelVar;
        this.zzg = zzahvVar;
        Objects.requireNonNull(zzaarVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahl zzahlVar) {
        zzaib zzaibVar;
        List<zzahk> listZza = zzahlVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        boolean zBooleanValue = false;
        zzahk zzahkVar = listZza.get(0);
        zzaia zzaiaVarZzf = zzahkVar.zzf();
        List<zzaib> listZza2 = zzaiaVarZzf != null ? zzaiaVarZzf.zza() : null;
        if (listZza2 != null && !listZza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                zzaibVar = listZza2.get(0);
            } else {
                for (int i3 = 0; i3 < listZza2.size(); i3++) {
                    if (listZza2.get(i3).zzf().equals(this.zzb)) {
                        zzaibVar = listZza2.get(i3);
                    }
                }
            }
            zzaibVar.zza(this.zzc);
            break;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (zzahkVar.zzb() - zzahkVar.zza() < 1000) {
            zBooleanValue = true;
        }
        zzahkVar.zza(zBooleanValue);
        zzahkVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzahkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
