package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzamg<K, V> extends LinkedHashMap<K, V> {
    private static final zzamg<?, ?> zza;
    private boolean zzb;

    static {
        zzamg<?, ?> zzamgVar = new zzamg<>();
        zza = zzamgVar;
        ((zzamg) zzamgVar).zzb = false;
    }

    private zzamg() {
        this.zzb = true;
    }

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zzalh.zza((byte[]) obj);
        }
        if (obj instanceof zzalk) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zze() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZza = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iZza += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return iZza;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k3, V v2) {
        zze();
        zzalh.zza(k3);
        zzalh.zza(v2);
        return (V) super.put(k3, v2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (K k3 : map.keySet()) {
            zzalh.zza(k3);
            zzalh.zza(map.get(k3));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zze();
        return (V) super.remove(obj);
    }

    public final zzamg<K, V> zzb() {
        return isEmpty() ? new zzamg<>() : new zzamg<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzamg(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }

    public static <K, V> zzamg<K, V> zza() {
        return (zzamg<K, V>) zza;
    }

    public final void zza(zzamg<K, V> zzamgVar) {
        zze();
        if (zzamgVar.isEmpty()) {
            return;
        }
        putAll(zzamgVar);
    }
}
