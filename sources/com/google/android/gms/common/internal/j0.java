package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        C0645u c0645u = null;
        int[] iArrK = null;
        int[] iArrK2 = null;
        boolean zW = false;
        boolean zW2 = false;
        int iD = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    c0645u = (C0645u) N.b.o(parcel, iB, C0645u.CREATOR);
                    break;
                case 2:
                    zW = N.b.w(parcel, iB);
                    break;
                case 3:
                    zW2 = N.b.w(parcel, iB);
                    break;
                case 4:
                    iArrK = N.b.k(parcel, iB);
                    break;
                case 5:
                    iD = N.b.D(parcel, iB);
                    break;
                case 6:
                    iArrK2 = N.b.k(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0631f(c0645u, zW, zW2, iArrK, iD, iArrK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0631f[i3];
    }
}
