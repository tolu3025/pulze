package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        long jF = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            if (N.b.v(iB) != 1) {
                N.b.J(parcel, iB);
            } else {
                jF = N.b.F(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new K(jF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new K[i3];
    }
}
