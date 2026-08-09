package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        Boolean boolX = null;
        String strP2 = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 3) {
                boolX = N.b.x(parcel, iB);
            } else if (iV == 4) {
                strP2 = N.b.p(parcel, iB);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                strP3 = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0454k(strP, boolX, strP2, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0454k[i3];
    }
}
