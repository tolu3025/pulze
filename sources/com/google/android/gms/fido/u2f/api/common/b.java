package com.google.android.gms.fido.u2f.api.common;

import Z.e;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        Integer numE = null;
        Double dZ = null;
        Uri uri = null;
        byte[] bArrG = null;
        ArrayList arrayListT = null;
        Z.a aVar = null;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 2:
                    numE = N.b.E(parcel, iB);
                    break;
                case 3:
                    dZ = N.b.z(parcel, iB);
                    break;
                case 4:
                    uri = (Uri) N.b.o(parcel, iB, Uri.CREATOR);
                    break;
                case 5:
                    bArrG = N.b.g(parcel, iB);
                    break;
                case 6:
                    arrayListT = N.b.t(parcel, iB, e.CREATOR);
                    break;
                case 7:
                    aVar = (Z.a) N.b.o(parcel, iB, Z.a.CREATOR);
                    break;
                case 8:
                    strP = N.b.p(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new SignRequestParams(numE, dZ, uri, bArrG, arrayListT, aVar, strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new SignRequestParams[i3];
    }
}
