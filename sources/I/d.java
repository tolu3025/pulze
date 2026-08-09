package I;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        int iD2 = 0;
        String strP = null;
        byte[] bArrG = null;
        Bundle bundleF = null;
        long jF = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 2) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV == 3) {
                jF = N.b.F(parcel, iB);
            } else if (iV == 4) {
                bArrG = N.b.g(parcel, iB);
            } else if (iV == 5) {
                bundleF = N.b.f(parcel, iB);
            } else if (iV != 1000) {
                N.b.J(parcel, iB);
            } else {
                iD = N.b.D(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new b(iD, strP, iD2, jF, bArrG, bundleF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new b[i3];
    }
}
