package com.google.android.recaptcha.internal;

import I1.g;
import I1.i;
import I1.q;
import I1.u;
import J1.AbstractC0411o;
import J1.F;

/* JADX INFO: loaded from: classes.dex */
public final class zzp implements zzy {
    private final zzek zza;
    private final g zzb;
    private boolean zzc;

    public zzp(zzek zzekVar) {
        this.zza = zzekVar;
        int i3 = zzav.zza;
        this.zzb = i.a(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, M1.d dVar) {
        zzen zzenVarZzb = zzz.zzb(this, str);
        String strZza = zzg().zza();
        zzenVarZzb.zza();
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(strZza);
        zztfVarZzf.zze(AbstractC0411o.d(zztgVarZzf.zzk()));
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, M1.d dVar) {
        zzen zzenVarZzc = zzz.zzc(this);
        if (zzseVar.zzl().length() == 0) {
            this.zzc = false;
            zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
        } else {
            zzg().zzb(F.b(q.a("_GRECAPTCHA_KC", zzseVar.zzl())));
            zzenVarZzc.zza();
        }
        return u.f2419a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }
}
