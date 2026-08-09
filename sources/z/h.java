package Z;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        byte[] bArrG = null;
        ArrayList arrayListT = null;
        int iD = 0;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                bArrG = N.b.g(parcel, iB);
            } else if (iV == 3) {
                strP = N.b.p(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                arrayListT = N.b.t(parcel, iB, Transport.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new b(iD, bArrG, strP, arrayListT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new b[i3];
    }
}
