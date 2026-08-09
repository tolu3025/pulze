package G;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        boolean zW = false;
        int iD = 0;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    strP = N.b.p(parcel, iB);
                    break;
                case 2:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case 3:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 4:
                    strP4 = N.b.p(parcel, iB);
                    break;
                case 5:
                    zW = N.b.w(parcel, iB);
                    break;
                case 6:
                    iD = N.b.D(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new f(strP, strP2, strP3, strP4, zW, iD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new f[i3];
    }
}
