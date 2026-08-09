package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzao<K, V> {
    zzan zza;
    private Object[] zzb;
    private int zzc;

    public zzao() {
        this(4);
    }

    public final zzal<K, V> zza() {
        zzan zzanVar = this.zza;
        if (zzanVar != null) {
            throw zzanVar.zza();
        }
        zzas zzasVarZza = zzas.zza(this.zzc, this.zzb, this);
        zzan zzanVar2 = this.zza;
        if (zzanVar2 == null) {
            return zzasVarZza;
        }
        throw zzanVar2.zza();
    }

    zzao(int i3) {
        this.zzb = new Object[i3 * 2];
        this.zzc = 0;
    }

    public final zzao<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzae.zza(key, value);
            Object[] objArr = this.zzb;
            int i3 = this.zzc;
            objArr[i3 * 2] = key;
            objArr[(i3 * 2) + 1] = value;
            this.zzc = i3 + 1;
        }
        return this;
    }

    private final void zza(int i3) {
        int i4 = i3 << 1;
        Object[] objArr = this.zzb;
        if (i4 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzai.zza(objArr.length, i4));
        }
    }
}
