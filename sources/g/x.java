package G;

import G.C0319b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        byte[] bArrG = null;
        boolean zW = false;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                zW = N.b.w(parcel, iB);
            } else if (iV == 2) {
                bArrG = N.b.g(parcel, iB);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                strP = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0319b.d(zW, bArrG, strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0319b.d[i3];
    }
}
