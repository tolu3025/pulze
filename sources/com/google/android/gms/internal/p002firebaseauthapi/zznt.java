package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqf;

/* JADX INFO: loaded from: classes.dex */
public abstract class zznt<SerializationT extends zzqf> {
    private final zzaaj zza;
    private final Class<SerializationT> zzb;

    private zznt(zzaaj zzaajVar, Class<SerializationT> cls) {
        this.zza = zzaajVar;
        this.zzb = cls;
    }

    public final zzaaj zza() {
        return this.zza;
    }

    public abstract zzbi zza(SerializationT serializationt, zzch zzchVar);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    public static <SerializationT extends zzqf> zznt<SerializationT> zza(zznv<SerializationT> zznvVar, zzaaj zzaajVar, Class<SerializationT> cls) {
        return new zzns(zzaajVar, cls, zznvVar);
    }
}
