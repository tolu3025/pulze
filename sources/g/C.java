package G;

import V0.I;
import Y.C0462t;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        Uri uri = null;
        String strP5 = null;
        String strP6 = null;
        String strP7 = null;
        C0462t c0462t = null;
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
                    uri = (Uri) N.b.o(parcel, iB, Uri.CREATOR);
                    break;
                case 6:
                    strP5 = N.b.p(parcel, iB);
                    break;
                case 7:
                    strP6 = N.b.p(parcel, iB);
                    break;
                case 8:
                    strP7 = N.b.p(parcel, iB);
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    c0462t = (C0462t) N.b.o(parcel, iB, C0462t.CREATOR);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new l(strP, strP2, strP3, strP4, uri, strP5, strP6, strP7, c0462t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new l[i3];
    }
}
