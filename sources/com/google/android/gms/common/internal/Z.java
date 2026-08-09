package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        int iD2 = 0;
        int iD3 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                zW = N.b.w(parcel, iB);
            } else if (iV == 3) {
                zW2 = N.b.w(parcel, iB);
            } else if (iV == 4) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                iD3 = N.b.D(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0645u(iD, zW, zW2, iD2, iD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0645u[i3];
    }
}
