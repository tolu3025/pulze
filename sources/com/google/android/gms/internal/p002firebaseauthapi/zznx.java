package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzbi;
import com.google.android.gms.internal.p002firebaseauthapi.zzqf;

/* JADX INFO: loaded from: classes.dex */
public abstract class zznx<KeyT extends zzbi, SerializationT extends zzqf> {
    private final Class<KeyT> zza;
    private final Class<SerializationT> zzb;

    private zznx(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <KeyT extends zzbi, SerializationT extends zzqf> zznx<KeyT, SerializationT> zza(zznz<KeyT, SerializationT> zznzVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new zznw(cls, cls2, zznzVar);
    }

    public abstract SerializationT zza(KeyT keyt, zzch zzchVar);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }
}
