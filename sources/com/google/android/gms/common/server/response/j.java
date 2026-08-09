package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        int iD = 0;
        ArrayList arrayListT = null;
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
                arrayListT = N.b.t(parcel, iB, g.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new f(iD, strP, arrayListT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new f[i3];
    }
}
