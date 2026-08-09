package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        byte[] bArrG = null;
        C0449h c0449h = null;
        C0447g c0447g = null;
        C0451i c0451i = null;
        C0443e c0443e = null;
        String strP3 = null;
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
                    bArrG = N.b.g(parcel, iB);
                    break;
                case 4:
                    c0449h = (C0449h) N.b.o(parcel, iB, C0449h.CREATOR);
                    break;
                case 5:
                    c0447g = (C0447g) N.b.o(parcel, iB, C0447g.CREATOR);
                    break;
                case 6:
                    c0451i = (C0451i) N.b.o(parcel, iB, C0451i.CREATOR);
                    break;
                case 7:
                    c0443e = (C0443e) N.b.o(parcel, iB, C0443e.CREATOR);
                    break;
                case 8:
                    strP3 = N.b.p(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0462t(strP, strP2, bArrG, c0449h, c0447g, c0451i, c0443e, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0462t[i3];
    }
}
