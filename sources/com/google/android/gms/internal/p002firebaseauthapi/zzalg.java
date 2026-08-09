package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* JADX INFO: loaded from: classes.dex */
final class zzalg implements zzamj {
    private static final zzalg zza = new zzalg();

    private zzalg() {
    }

    public static zzalg zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamj
    public final boolean zzb(Class<?> cls) {
        return zzalf.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamj
    public final zzamk zza(Class<?> cls) {
        if (!zzalf.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzamk) zzalf.zza(cls.asSubclass(zzalf.class)).zza(zzalf.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e3) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e3);
        }
    }
}
