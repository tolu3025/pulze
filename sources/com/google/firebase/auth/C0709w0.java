package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.firebase.auth.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0709w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        long jF = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = N.b.p(parcel, iB);
            } else if (iV == 3) {
                jF = N.b.F(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                strP3 = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new U(strP, strP2, jF, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new U[i3];
    }
}
