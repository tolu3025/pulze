package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zzfe extends n implements U1.a {
    public static final zzfe zza = new zzfe();

    public zzfe() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzey.class.getName().hashCode());
        if (objZzb != null) {
            return (zzey) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
