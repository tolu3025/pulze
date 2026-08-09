package com.google.android.gms.auth.api.signin;

import V0.F;
import V0.I;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        Uri uri = null;
        String strP5 = null;
        String strP6 = null;
        ArrayList arrayListT = null;
        String strP7 = null;
        String strP8 = null;
        long jF = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 2:
                    strP = N.b.p(parcel, iB);
                    break;
                case 3:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case 4:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 5:
                    strP4 = N.b.p(parcel, iB);
                    break;
                case 6:
                    uri = (Uri) N.b.o(parcel, iB, Uri.CREATOR);
                    break;
                case 7:
                    strP5 = N.b.p(parcel, iB);
                    break;
                case 8:
                    jF = N.b.F(parcel, iB);
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    strP6 = N.b.p(parcel, iB);
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    arrayListT = N.b.t(parcel, iB, Scope.CREATOR);
                    break;
                case 11:
                    strP7 = N.b.p(parcel, iB);
                    break;
                case F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    strP8 = N.b.p(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new GoogleSignInAccount(strP, strP2, strP3, strP4, uri, strP5, jF, strP6, arrayListT, strP7, strP8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new GoogleSignInAccount[i3];
    }
}
