package M;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        PendingIntent pendingIntent = null;
        String strP = null;
        Integer numE = null;
        int iD = 0;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV == 3) {
                pendingIntent = (PendingIntent) N.b.o(parcel, iB, PendingIntent.CREATOR);
            } else if (iV == 4) {
                strP = N.b.p(parcel, iB);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                numE = N.b.E(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0413a(iD, iD2, pendingIntent, strP, numE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0413a[i3];
    }
}
