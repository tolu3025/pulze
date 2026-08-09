package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzel extends n implements U1.a {
    public static final zzel zza = new zzel();

    public zzel() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzaz.class.getName().hashCode());
        if (objZzb != null) {
            return (zzaz) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
