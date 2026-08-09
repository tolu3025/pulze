package com.google.android.gms.common.api;

import M.C0413a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        C0413a c0413a = null;
        int iD = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 3) {
                pendingIntent = (PendingIntent) N.b.o(parcel, iB, PendingIntent.CREATOR);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                c0413a = (C0413a) N.b.o(parcel, iB, C0413a.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new Status(iD, strP, pendingIntent, c0413a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new Status[i3];
    }
}
