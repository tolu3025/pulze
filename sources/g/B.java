package G;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            if (N.b.v(iB) != 1) {
                N.b.J(parcel, iB);
            } else {
                pendingIntent = (PendingIntent) N.b.o(parcel, iB, PendingIntent.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new j(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new j[i3];
    }
}
