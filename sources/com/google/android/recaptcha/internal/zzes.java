package com.google.android.recaptcha.internal;

import I1.k;
import I1.u;
import J1.x;
import android.content.Context;
import c2.AbstractC0570k;
import c2.N;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final N zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, N n3) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = n3;
        zzei zzeiVar = null;
        try {
            zzei zzeiVar2 = zzei.zzd;
            zzeiVar2 = zzeiVar2 == null ? new zzei(context, null) : zzeiVar2;
            zzei.zzd = zzeiVar2;
            zzeiVar = zzeiVar2;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzei zzeiVar;
        zztx zztxVarZzk;
        int iZzN;
        int i3;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            for (List<zzej> list : x.b0(zzeiVar2.zzd(), 20, 20, true)) {
                zzrd zzrdVarZzi = zzrf.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zztxVarZzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        iZzN = zztxVarZzk.zzN();
                        i3 = iZzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (iZzN == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        zzrdVarZzi.zzq(zztxVarZzk.zzf());
                    } else if (i3 == 1) {
                        zzrdVarZzi.zzr(zztxVarZzk.zzg());
                    } else {
                        if (i3 != 2) {
                            throw new k();
                        }
                        u uVar = u.f2419a;
                    }
                    arrayList.add(zzejVar);
                }
                if (zzrdVarZzi.zze() + zzrdVarZzi.zzf() != 0) {
                    if (this.zzc.zza(((zzrf) zzrdVarZzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        AbstractC0570k.d(this.zzd, null, null, new zzer(this, zztxVar, null), 3, null);
        zzh();
    }
}
