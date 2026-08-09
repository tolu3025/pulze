package I;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundleF = null;
        byte[] bArrG = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV == 2) {
                pendingIntent = (PendingIntent) N.b.o(parcel, iB, PendingIntent.CREATOR);
            } else if (iV == 3) {
                iD3 = N.b.D(parcel, iB);
            } else if (iV == 4) {
                bundleF = N.b.f(parcel, iB);
            } else if (iV == 5) {
                bArrG = N.b.g(parcel, iB);
            } else if (iV != 1000) {
                N.b.J(parcel, iB);
            } else {
                iD = N.b.D(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new c(iD, iD2, pendingIntent, iD3, bundleF, bArrG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new c[i3];
    }
}
