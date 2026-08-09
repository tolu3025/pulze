package com.google.android.gms.internal.auth;

import N.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class zzav extends N.a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    zzav(int i3, String str, int i4) {
        this.zza = 1;
        this.zzb = (String) AbstractC0643s.k(str);
        this.zzc = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.s(parcel, 3, this.zzc);
        c.b(parcel, iA);
    }

    public zzav(String str, int i3) {
        this(1, str, i3);
    }
}
