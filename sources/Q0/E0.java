package q0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class E0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        boolean zW = false;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = N.b.p(parcel, iB);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                zW = N.b.w(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new F0(strP, strP2, zW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new F0[i3];
    }
}
