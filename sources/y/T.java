package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        byte[][] bArrH = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            if (N.b.v(iB) != 1) {
                N.b.J(parcel, iB);
            } else {
                bArrH = N.b.h(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new S(bArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new S[i3];
    }
}
