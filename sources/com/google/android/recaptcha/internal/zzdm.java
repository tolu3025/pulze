package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzdm extends n implements U1.a {
    public static final zzdm zza = new zzdm();

    public zzdm() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzff.class.getName().hashCode());
        if (objZzb != null) {
            return (zzff) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
