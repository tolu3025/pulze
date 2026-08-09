package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        String strP = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                pendingIntent = (PendingIntent) N.b.o(parcel, iB, PendingIntent.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new zzbb(iD, strP, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new zzbb[i3];
    }
}
