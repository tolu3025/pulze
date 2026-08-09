package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzej {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzej(String str, long j3, int i3) {
        this.zza = str;
        this.zzb = j3;
        this.zzc = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzej)) {
            return false;
        }
        zzej zzejVar = (zzej) obj;
        return m.a(zzejVar.zza, this.zza) && zzejVar.zzb == this.zzb && zzejVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
