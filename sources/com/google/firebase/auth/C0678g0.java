package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.firebase.auth.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0678g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        String strP5 = null;
        String strP6 = null;
        String strP7 = null;
        String strP8 = null;
        boolean zW = false;
        boolean zW2 = false;
        int iD = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    strP = N.b.p(parcel, iB);
                    break;
                case 2:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case 3:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 4:
                    strP4 = N.b.p(parcel, iB);
                    break;
                case 5:
                    zW = N.b.w(parcel, iB);
                    break;
                case 6:
                    strP5 = N.b.p(parcel, iB);
                    break;
                case 7:
                    zW2 = N.b.w(parcel, iB);
                    break;
                case 8:
                    strP6 = N.b.p(parcel, iB);
                    break;
                case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    iD = N.b.D(parcel, iB);
                    break;
                case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    strP7 = N.b.p(parcel, iB);
                    break;
                case 11:
                    strP8 = N.b.p(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0673e(strP, strP2, strP3, strP4, zW, strP5, zW2, strP6, iD, strP7, strP8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0673e[i3];
    }
}
