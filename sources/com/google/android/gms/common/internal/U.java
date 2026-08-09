package com.google.android.gms.common.internal;

import M.C0413a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        IBinder iBinderC = null;
        C0413a c0413a = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                iBinderC = N.b.C(parcel, iB);
            } else if (iV == 3) {
                c0413a = (C0413a) N.b.o(parcel, iB, C0413a.CREATOR);
            } else if (iV == 4) {
                zW = N.b.w(parcel, iB);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                zW2 = N.b.w(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new T(iD, iBinderC, c0413a, zW, zW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new T[i3];
    }
}
