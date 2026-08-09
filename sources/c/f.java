package C;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        ArrayList arrayListT = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV != 2) {
                N.b.J(parcel, iB);
            } else {
                arrayListT = N.b.t(parcel, iB, a.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new c(iD, arrayListT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new c[i3];
    }
}
