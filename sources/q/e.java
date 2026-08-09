package Q;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        ArrayList arrayListT = null;
        int iD = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV != 2) {
                N.b.J(parcel, iB);
            } else {
                arrayListT = N.b.t(parcel, iB, d.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new a(iD, arrayListT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new a[i3];
    }
}
