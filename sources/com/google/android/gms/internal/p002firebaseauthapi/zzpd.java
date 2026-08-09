package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqf;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzpd<SerializationT extends zzqf> {
    private final zzaaj zza;
    private final Class<SerializationT> zzb;

    private zzpd(zzaaj zzaajVar, Class<SerializationT> cls) {
        this.zza = zzaajVar;
        this.zzb = cls;
    }

    public final zzaaj zza() {
        return this.zza;
    }

    public abstract zzcb zza(SerializationT serializationt);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    public static <SerializationT extends zzqf> zzpd<SerializationT> zza(zzpf<SerializationT> zzpfVar, zzaaj zzaajVar, Class<SerializationT> cls) {
        return new zzpg(zzaajVar, cls, zzpfVar);
    }
}
