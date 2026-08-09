package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        C0467y c0467y = null;
        A a3 = null;
        byte[] bArrG = null;
        ArrayList arrayListT = null;
        Double dZ = null;
        ArrayList arrayListT2 = null;
        C0454k c0454k = null;
        Integer numE = null;
        E e3 = null;
        String strP = null;
        C0441d c0441d = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 2:
                    c0467y = (C0467y) N.b.o(parcel, iB, C0467y.CREATOR);
                    break;
                case 3:
                    a3 = (A) N.b.o(parcel, iB, A.CREATOR);
                    break;
                case 4:
                    bArrG = N.b.g(parcel, iB);
                    break;
                case 5:
                    arrayListT = N.b.t(parcel, iB, C0465w.CREATOR);
                    break;
                case 6:
                    dZ = N.b.z(parcel, iB);
                    break;
                case 7:
                    arrayListT2 = N.b.t(parcel, iB, C0464v.CREATOR);
                    break;
                case 8:
                    c0454k = (C0454k) N.b.o(parcel, iB, C0454k.CREATOR);
                    break;
                case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    numE = N.b.E(parcel, iB);
                    break;
                case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    e3 = (E) N.b.o(parcel, iB, E.CREATOR);
                    break;
                case 11:
                    strP = N.b.p(parcel, iB);
                    break;
                case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    c0441d = (C0441d) N.b.o(parcel, iB, C0441d.CREATOR);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0463u(c0467y, a3, bArrG, arrayListT, dZ, arrayListT2, c0454k, numE, e3, strP, c0441d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0463u[i3];
    }
}
