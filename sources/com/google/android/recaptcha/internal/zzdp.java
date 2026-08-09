package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzdp extends n implements U1.a {
    public static final zzdp zza = new zzdp();

    public zzdp() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzfj.class.getName().hashCode());
        if (objZzb != null) {
            return (zzfj) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
