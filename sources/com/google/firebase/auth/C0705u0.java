package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.firebase.auth.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0705u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        boolean zW = false;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = N.b.p(parcel, iB);
            } else if (iV == 4) {
                strP3 = N.b.p(parcel, iB);
            } else if (iV == 5) {
                zW = N.b.w(parcel, iB);
            } else if (iV != 6) {
                N.b.J(parcel, iB);
            } else {
                strP4 = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new O(strP, strP2, strP3, zW, strP4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new O[i3];
    }
}
