package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        b bVar = null;
        String strP = null;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                bVar = (b) N.b.o(parcel, iB, b.CREATOR);
            } else if (iV == 3) {
                strP = N.b.p(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                strP2 = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new e(bVar, strP, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new e[i3];
    }
}
