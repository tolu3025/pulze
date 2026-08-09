package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        byte[] bArrG = null;
        byte[] bArrG2 = null;
        byte[] bArrG3 = null;
        String[] strArrQ = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                bArrG = N.b.g(parcel, iB);
            } else if (iV == 3) {
                bArrG2 = N.b.g(parcel, iB);
            } else if (iV == 4) {
                bArrG3 = N.b.g(parcel, iB);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                strArrQ = N.b.q(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0449h(bArrG, bArrG2, bArrG3, strArrQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0449h[i3];
    }
}
