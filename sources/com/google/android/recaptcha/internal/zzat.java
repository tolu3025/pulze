package com.google.android.recaptcha.internal;

import J1.F;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
final class zzat extends n implements U1.a {
    public static final zzat zza = new zzat();

    zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // U1.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
