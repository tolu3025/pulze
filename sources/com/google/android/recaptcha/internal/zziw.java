package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class zziw extends n implements U1.a {
    public static final zziw zza = new zziw();

    public zziw() {
        super(0);
    }

    @Override // U1.a
    public final Object invoke() throws zzbd {
        int i3 = zzav.zza;
        Object objZzb = zzau.zza().zzb(Application.class.getName().hashCode());
        if (objZzb != null) {
            return (Application) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
