package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        byte[] bArrG = null;
        Double dZ = null;
        String strP = null;
        ArrayList arrayListT = null;
        Integer numE = null;
        E e3 = null;
        String strP2 = null;
        C0441d c0441d = null;
        Long lG = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 2:
                    bArrG = N.b.g(parcel, iB);
                    break;
                case 3:
                    dZ = N.b.z(parcel, iB);
                    break;
                case 4:
                    strP = N.b.p(parcel, iB);
                    break;
                case 5:
                    arrayListT = N.b.t(parcel, iB, C0464v.CREATOR);
                    break;
                case 6:
                    numE = N.b.E(parcel, iB);
                    break;
                case 7:
                    e3 = (E) N.b.o(parcel, iB, E.CREATOR);
                    break;
                case 8:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    c0441d = (C0441d) N.b.o(parcel, iB, C0441d.CREATOR);
                    break;
                case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    lG = N.b.G(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0466x(bArrG, dZ, strP, arrayListT, numE, e3, strP2, c0441d, lG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0466x[i3];
    }
}
