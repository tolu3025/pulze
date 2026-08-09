package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        Integer numE = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                numE = N.b.E(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0465w(strP, numE.intValue());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0465w[i3];
    }
}
