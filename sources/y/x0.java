package Y;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        C0463u c0463u = null;
        Uri uri = null;
        byte[] bArrG = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                c0463u = (C0463u) N.b.o(parcel, iB, C0463u.CREATOR);
            } else if (iV == 3) {
                uri = (Uri) N.b.o(parcel, iB, Uri.CREATOR);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                bArrG = N.b.g(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0455l(c0463u, uri, bArrG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0455l[i3];
    }
}
