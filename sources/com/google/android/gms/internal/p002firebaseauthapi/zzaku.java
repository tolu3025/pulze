package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzaku {
    static final zzaku zza = new zzaku(true);
    private static volatile boolean zzb = false;
    private final Map<zzakt, zzalf.zzf<?, ?>> zzc;

    zzaku() {
        this.zzc = new HashMap();
    }

    public static zzaku zza() {
        return zza;
    }

    private zzaku(boolean z2) {
        this.zzc = Collections.emptyMap();
    }

    public final <ContainingType extends zzamm> zzalf.zzf<ContainingType, ?> zza(ContainingType containingtype, int i3) {
        return (zzalf.zzf) this.zzc.get(new zzakt(containingtype, i3));
    }
}
