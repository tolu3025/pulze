package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        byte[] bArrG = null;
        ArrayList arrayListT = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 3) {
                bArrG = N.b.g(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                arrayListT = N.b.t(parcel, iB, Transport.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new C0464v(strP, bArrG, arrayListT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0464v[i3];
    }
}
