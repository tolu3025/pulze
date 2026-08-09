package F;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.IdToken;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                strP = N.b.p(parcel, iB);
            } else if (iV != 2) {
                N.b.J(parcel, iB);
            } else {
                strP2 = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new IdToken(strP, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new IdToken[i3];
    }
}
