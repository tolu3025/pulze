package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zznk<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    private zznk() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zznk<E, O> zza(E e3, O o2) {
        this.zza.put(e3, o2);
        this.zzb.put(o2, e3);
        return this;
    }

    public final zznl<E, O> zza() {
        return new zznl<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }
}
