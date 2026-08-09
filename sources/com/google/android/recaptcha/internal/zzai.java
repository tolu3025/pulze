package com.google.android.recaptcha.internal;

import c2.AbstractC0570k;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzan zzanVar = this.zza;
        AbstractC0570k.d(zzanVar.zzb, null, null, new zzaj(zzanVar, null), 3, null);
    }
}
