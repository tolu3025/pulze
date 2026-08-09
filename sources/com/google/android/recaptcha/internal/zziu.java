package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zziu extends n implements U1.a {
    public static final zziu zza = new zziu();

    public zziu() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzfk.class.getName().hashCode());
        if (objZzb != null) {
            return (zzfk) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
