package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Y.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0444e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                strP2 = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new E(strP, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new E[i3];
    }
}
