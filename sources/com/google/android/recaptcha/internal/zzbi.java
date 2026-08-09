package com.google.android.recaptcha.internal;

import c2.AbstractC0570k;
import c2.AbstractC0586s0;
import c2.C0557d0;
import c2.N;
import c2.O;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class zzbi {
    private final N zza = O.b();
    private final N zzb;
    private final N zzc;
    private final N zzd;

    public zzbi() {
        N nA = O.a(AbstractC0586s0.c(Executors.newSingleThreadExecutor()));
        AbstractC0570k.d(nA, null, null, new zzbh(null), 3, null);
        this.zzb = nA;
        this.zzc = O.a(C0557d0.b());
        N nA2 = O.a(AbstractC0586s0.c(Executors.newSingleThreadExecutor()));
        AbstractC0570k.d(nA2, null, null, new zzbg(null), 3, null);
        this.zzd = nA2;
    }

    public final N zza() {
        return this.zzc;
    }

    public final N zzb() {
        return this.zza;
    }

    public final N zzc() {
        return this.zzd;
    }

    public final N zzd() {
        return this.zzb;
    }
}
