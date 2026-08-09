package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzfd extends n implements U1.a {
    public static final zzfd zza = new zzfd();

    public zzfd() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzaq.class.getName().hashCode());
        if (objZzb != null) {
            return (zzaq) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
