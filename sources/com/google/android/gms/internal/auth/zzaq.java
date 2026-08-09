package com.google.android.gms.internal.auth;

import N.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class zzaq extends N.a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    final int zza;
    public final String zzb;

    zzaq(int i3, String str) {
        this.zza = 1;
        this.zzb = (String) AbstractC0643s.k(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.b(parcel, iA);
    }

    public zzaq(String str) {
        this(1, str);
    }
}
