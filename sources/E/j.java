package E;

import N.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i3;
        int iK = N.b.K(parcel);
        HashSet hashSet = new HashSet();
        int iD = 0;
        String strP = null;
        byte[] bArrG = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    iD2 = N.b.D(parcel, iB);
                    i3 = 1;
                    break;
                case 2:
                    strP = N.b.p(parcel, iB);
                    i3 = 2;
                    break;
                case 3:
                    iD = N.b.D(parcel, iB);
                    i3 = 3;
                    break;
                case 4:
                    bArrG = N.b.g(parcel, iB);
                    i3 = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) N.b.o(parcel, iB, PendingIntent.CREATOR);
                    i3 = 5;
                    break;
                case 6:
                    aVar = (a) N.b.o(parcel, iB, a.CREATOR);
                    i3 = 6;
                    break;
                default:
                    N.b.J(parcel, iB);
                    continue;
            }
            hashSet.add(Integer.valueOf(i3));
        }
        if (parcel.dataPosition() == iK) {
            return new i(hashSet, iD2, strP, iD, bArrG, pendingIntent, aVar);
        }
        throw new b.a("Overread allowed size end=" + iK, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new i[i3];
    }
}
