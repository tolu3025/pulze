package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        boolean zW = false;
        boolean zW2 = false;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 3) {
                strP2 = N.b.p(parcel, iB);
            } else if (iV == 4) {
                zW = N.b.w(parcel, iB);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                zW2 = N.b.w(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0676f0(strP, strP2, zW, zW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0676f0[i3];
    }
}
