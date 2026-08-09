package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzit extends n implements U1.a {
    public static final zzit zza = new zzit();

    public zzit() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzbr.class.getName().hashCode());
        if (objZzb != null) {
            return (zzbr) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
