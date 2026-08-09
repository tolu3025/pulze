package K;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        Bundle bundleF = null;
        int iD = 0;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                bundleF = N.b.f(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new a(iD, iD2, bundleF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new a[i3];
    }
}
