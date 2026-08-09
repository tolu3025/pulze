package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends n implements U1.a {
    public static final zzo zza = new zzo();

    public zzo() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzbf.class.getName().hashCode());
        if (objZzb != null) {
            return (zzbf) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
