package M;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        boolean zW = false;
        long jF = -1;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 2) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 3) {
                jF = N.b.F(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                zW = N.b.w(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0415c(strP, iD, jF, zW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0415c[i3];
    }
}
