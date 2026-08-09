package com.google.android.gms.common.server.response;

import V0.I;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        Q.b bVar = null;
        int iD = 0;
        int iD2 = 0;
        boolean zW = false;
        int iD3 = 0;
        boolean zW2 = false;
        int iD4 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    iD = N.b.D(parcel, iB);
                    break;
                case 2:
                    iD2 = N.b.D(parcel, iB);
                    break;
                case 3:
                    zW = N.b.w(parcel, iB);
                    break;
                case 4:
                    iD3 = N.b.D(parcel, iB);
                    break;
                case 5:
                    zW2 = N.b.w(parcel, iB);
                    break;
                case 6:
                    strP = N.b.p(parcel, iB);
                    break;
                case 7:
                    iD4 = N.b.D(parcel, iB);
                    break;
                case 8:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    bVar = (Q.b) N.b.o(parcel, iB, Q.b.CREATOR);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new a.C0110a(iD, iD2, zW, iD3, zW2, strP, iD4, strP2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new a.C0110a[i3];
    }
}
