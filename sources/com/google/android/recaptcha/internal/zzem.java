package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzem extends n implements U1.a {
    public static final zzem zza = new zzem();

    public zzem() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzbe.class.getName().hashCode());
        if (objZzb != null) {
            return (zzbe) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
