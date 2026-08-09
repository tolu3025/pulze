package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        byte[] bArrG = null;
        byte[] bArrG2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                bArrG = N.b.g(parcel, iB);
            } else if (iV != 2) {
                N.b.J(parcel, iB);
            } else {
                bArrG2 = N.b.g(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new p0(bArrG, bArrG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new p0[i3];
    }
}
