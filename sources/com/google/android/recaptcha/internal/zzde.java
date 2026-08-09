package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzde extends n implements U1.a {
    public static final zzde zza = new zzde();

    public zzde() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzfu.class.getName().hashCode());
        if (objZzb != null) {
            return (zzfu) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
