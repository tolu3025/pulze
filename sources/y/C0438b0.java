package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Y.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0438b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        byte[] bArrG = null;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                bArrG = N.b.g(parcel, iB);
            } else if (iV == 3) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 4) {
                strP2 = N.b.p(parcel, iB);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                strP3 = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new A(bArrG, strP, strP2, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new A[i3];
    }
}
