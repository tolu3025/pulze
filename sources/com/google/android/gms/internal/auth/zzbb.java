package com.google.android.gms.internal.auth;

import N.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb extends N.a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    zzbb(int i3, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        this.zzb = (String) AbstractC0643s.k(str);
        this.zzc = (PendingIntent) AbstractC0643s.k(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.A(parcel, 3, this.zzc, i3, false);
        c.b(parcel, iA);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
