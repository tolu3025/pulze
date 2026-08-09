package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        int iD = 0;
        byte[] bArrG = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 3) {
                bArrG = N.b.g(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                strP2 = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new d(iD, strP, bArrG, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new d[i3];
    }
}
