package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = -1;
        int iD2 = 0;
        int iD3 = 0;
        int iD4 = 0;
        int iD5 = 0;
        String strP = null;
        String strP2 = null;
        long jF = 0;
        long jF2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    iD2 = N.b.D(parcel, iB);
                    break;
                case 2:
                    iD3 = N.b.D(parcel, iB);
                    break;
                case 3:
                    iD4 = N.b.D(parcel, iB);
                    break;
                case 4:
                    jF = N.b.F(parcel, iB);
                    break;
                case 5:
                    jF2 = N.b.F(parcel, iB);
                    break;
                case 6:
                    strP = N.b.p(parcel, iB);
                    break;
                case 7:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case 8:
                    iD5 = N.b.D(parcel, iB);
                    break;
                case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    iD = N.b.D(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0641p(iD2, iD3, iD4, jF, jF2, strP, strP2, iD5, iD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0641p[i3];
    }
}
