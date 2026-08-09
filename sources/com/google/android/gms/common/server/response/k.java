package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        Parcel parcelM = null;
        int iD = 0;
        h hVar = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                parcelM = N.b.m(parcel, iB);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                hVar = (h) N.b.o(parcel, iB, h.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new c(iD, parcelM, hVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new c[i3];
    }
}
