package E;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        ArrayList arrayListR = null;
        ArrayList arrayListR2 = null;
        ArrayList arrayListR3 = null;
        ArrayList arrayListR4 = null;
        ArrayList arrayListR5 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    iD = N.b.D(parcel, iB);
                    break;
                case 2:
                    arrayListR = N.b.r(parcel, iB);
                    break;
                case 3:
                    arrayListR2 = N.b.r(parcel, iB);
                    break;
                case 4:
                    arrayListR3 = N.b.r(parcel, iB);
                    break;
                case 5:
                    arrayListR4 = N.b.r(parcel, iB);
                    break;
                case 6:
                    arrayListR5 = N.b.r(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new e(iD, arrayListR, arrayListR2, arrayListR3, arrayListR4, arrayListR5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new e[i3];
    }
}
