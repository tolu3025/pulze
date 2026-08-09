package G;

import G.C0319b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        boolean zW = false;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            if (N.b.v(iB) != 1) {
                N.b.J(parcel, iB);
            } else {
                zW = N.b.w(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0319b.e(zW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0319b.e[i3];
    }
}
