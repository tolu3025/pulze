package com.google.android.gms.auth.api.credentials;

import V0.I;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        Uri uri = null;
        ArrayList arrayListT = null;
        String strP3 = null;
        String strP4 = null;
        String strP5 = null;
        String strP6 = null;
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
                    uri = (Uri) N.b.o(parcel, iB, Uri.CREATOR);
                    break;
                case 4:
                    arrayListT = N.b.t(parcel, iB, IdToken.CREATOR);
                    break;
                case 5:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 6:
                    strP4 = N.b.p(parcel, iB);
                    break;
                case 7:
                case 8:
                default:
                    N.b.J(parcel, iB);
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    strP5 = N.b.p(parcel, iB);
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    strP6 = N.b.p(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new Credential(strP, strP2, uri, arrayListT, strP3, strP4, strP5, strP6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new Credential[i3];
    }
}
