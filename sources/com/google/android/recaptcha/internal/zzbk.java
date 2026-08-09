package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzbk {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i3, long j3) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i3);
        Object zzbjVar = concurrentHashMap.get(numValueOf);
        if (zzbjVar == null) {
            zzbjVar = new zzbj();
        }
        zzbj zzbjVar2 = (zzbj) zzbjVar;
        zzbjVar2.zzg(zzbjVar2.zzb() + 1);
        zzbjVar2.zzf(zzbjVar2.zzd() + j3);
        zzbjVar2.zze(Math.max(j3, zzbjVar2.zzc()));
        concurrentHashMap.put(numValueOf, zzbjVar2);
    }
}
