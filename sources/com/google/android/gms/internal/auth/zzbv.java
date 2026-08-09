package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class zzbv implements j {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) AbstractC0643s.k(status);
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        this.zzb = (String) AbstractC0643s.k(str);
        this.zza = Status.f5312f;
    }
}
