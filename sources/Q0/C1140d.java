package q0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: q0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1140d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        String strP5 = null;
        String strP6 = null;
        String strP7 = null;
        boolean zW = false;
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
                    strP5 = N.b.p(parcel, iB);
                    break;
                case 4:
                    strP4 = N.b.p(parcel, iB);
                    break;
                case 5:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 6:
                    strP6 = N.b.p(parcel, iB);
                    break;
                case 7:
                    zW = N.b.w(parcel, iB);
                    break;
                case 8:
                    strP7 = N.b.p(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C1142e(strP, strP2, strP3, strP4, strP5, strP6, zW, strP7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C1142e[i3];
    }
}
