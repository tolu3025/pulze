package com.google.android.recaptcha.internal;

import I1.u;
import android.webkit.JavascriptInterface;
import c2.InterfaceC0595x;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzij {
    final /* synthetic */ zzja zza;
    private Long zzb;
    private final zzjh zzc = zzjh.zzb();

    public zzij(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzja zzjaVar = this.zza;
        if (zzjaVar.zzq().zzb == null) {
            zzen zzenVar = zzjaVar.zzp;
            if (zzenVar != null) {
                zzenVar.zza();
            }
            this.zza.zzp = null;
        }
        zzb();
        zzrc zzrcVarZzl = zzrc.zzl(zzbt.zza(str));
        zztw zztwVarZzi = zztx.zzi();
        zztwVarZzi.zzf(zzrcVarZzl);
        this.zza.zzj.zze((zztx) zztwVarZzi.zzk());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zztw zztwVarZzi = zztx.zzi();
        zztwVarZzi.zzq(zzrr.zzi(zzbt.zza(str)));
        this.zza.zzj.zze((zztx) zztwVarZzi.zzk());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzts zztsVarZzg = zzts.zzg(zzbt.zza(str));
        zztsVarZzg.zzi().name();
        if (zztsVarZzg.zzi() == zztv.JS_CODE_SUCCESS) {
            this.zza.zzA().hashCode();
            if (this.zza.zzA().u(u.f2419a)) {
                return;
            }
            this.zza.zzA().hashCode();
            return;
        }
        zztsVarZzg.zzi().name();
        int i3 = zzbd.zza;
        zzbd zzbdVarZza = zzbc.zza(zztsVarZzg.zzi());
        this.zza.zzA().hashCode();
        this.zza.zzA().r(zzbdVarZza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzfo zzfoVar = this.zza.zzb;
        if (zzfoVar == null) {
            zzfoVar = null;
        }
        zzfoVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        zzb();
        zzsi zzsiVarZzi = zzsi.zzi(zzbt.zza(str));
        zzsiVarZzi.toString();
        InterfaceC0595x interfaceC0595x = (InterfaceC0595x) this.zza.zze.remove(zzsiVarZzi.zzk());
        if (interfaceC0595x != null) {
            interfaceC0595x.u(zzsiVarZzi);
        }
    }
}
