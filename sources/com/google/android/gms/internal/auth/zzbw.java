package com.google.android.gms.internal.auth;

import N.c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbw extends N.a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.b(parcel, iA);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    zzbw(int i3, String str) {
        this.zza = i3;
        this.zzb = str;
    }
}
