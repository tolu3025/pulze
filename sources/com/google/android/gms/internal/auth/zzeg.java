package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
final class zzeg extends zzei {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzeg(byte[] bArr, int i3, int i4, boolean z2, zzef zzefVar) {
        super(null);
        this.zze = a.e.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i3) {
        int i4 = this.zze;
        this.zze = 0;
        int i5 = this.zzc + this.zzd;
        this.zzc = i5;
        if (i5 > 0) {
            this.zzd = i5;
            this.zzc = i5 - i5;
        } else {
            this.zzd = 0;
        }
        return i4;
    }
}
