package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class zzos {
    public static final /* synthetic */ int zza = 0;
    private static final zzos zzb = new zzos();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzox zzc = new zzoa();

    private zzos() {
    }

    public static zzos zza() {
        return zzb;
    }

    public final zzow zzb(Class cls) {
        zznl.zzc(cls, "messageType");
        zzow zzowVarZza = (zzow) this.zzd.get(cls);
        if (zzowVarZza == null) {
            zzowVarZza = this.zzc.zza(cls);
            zznl.zzc(cls, "messageType");
            zzow zzowVar = (zzow) this.zzd.putIfAbsent(cls, zzowVarZza);
            if (zzowVar != null) {
                return zzowVar;
            }
        }
        return zzowVarZza;
    }
}
