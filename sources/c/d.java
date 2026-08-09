package C;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        long jF = 0;
        String strP = null;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    iD = N.b.D(parcel, iB);
                    break;
                case 2:
                    jF = N.b.F(parcel, iB);
                    break;
                case 3:
                    strP = N.b.p(parcel, iB);
                    break;
                case 4:
                    iD2 = N.b.D(parcel, iB);
                    break;
                case 5:
                    iD3 = N.b.D(parcel, iB);
                    break;
                case 6:
                    strP2 = N.b.p(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new a(iD, jF, strP, iD2, iD3, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new a[i3];
    }
}
