package com.google.android.gms.internal.auth;

import N.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends N.a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    zzaz(int i3, String str, byte[] bArr) {
        this.zza = 1;
        this.zzb = (String) AbstractC0643s.k(str);
        this.zzc = (byte[]) AbstractC0643s.k(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.k(parcel, 3, this.zzc, false);
        c.b(parcel, iA);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
