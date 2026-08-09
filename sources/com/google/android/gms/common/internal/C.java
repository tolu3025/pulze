package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        int iD2 = 0;
        boolean zW = false;
        long jF = 0;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 3) {
                jF = N.b.F(parcel, iB);
            } else if (iV == 4) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                zW = N.b.w(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new B(iD, strP, jF, iD2, zW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new B[i3];
    }
}
