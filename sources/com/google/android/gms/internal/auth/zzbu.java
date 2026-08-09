package com.google.android.gms.internal.auth;

import I.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
final class zzbu implements j {
    private final Status zza;
    private c zzb;

    public zzbu(c cVar) {
        this.zzb = cVar;
        this.zza = Status.f5312f;
    }

    public final c getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(Status status) {
        this.zza = status;
    }
}
