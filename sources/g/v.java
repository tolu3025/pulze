package G;

import G.C0319b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        ArrayList arrayListR = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    zW = N.b.w(parcel, iB);
                    break;
                case 2:
                    strP = N.b.p(parcel, iB);
                    break;
                case 3:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case 4:
                    zW2 = N.b.w(parcel, iB);
                    break;
                case 5:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 6:
                    arrayListR = N.b.r(parcel, iB);
                    break;
                case 7:
                    zW3 = N.b.w(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0319b.C0013b(zW, strP, strP2, zW2, strP3, arrayListR, zW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0319b.C0013b[i3];
    }
}
