package E;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        long jF = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                zW = N.b.w(parcel, iB);
            } else if (iV == 3) {
                jF = N.b.F(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                zW2 = N.b.w(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new a(iD, zW, jF, zW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new a[i3];
    }
}
