package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zznv {
    zznv() {
    }

    public static final List zza(Object obj, long j3) {
        zznk zznkVar = (zznk) zzps.zzf(obj, j3);
        if (zznkVar.zzc()) {
            return zznkVar;
        }
        int size = zznkVar.size();
        zznk zznkVarZzd = zznkVar.zzd(size == 0 ? 10 : size + size);
        zzps.zzs(obj, j3, zznkVarZzd);
        return zznkVarZzd;
    }
}
