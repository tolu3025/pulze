package E;

import N.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        HashSet hashSet = new HashSet();
        int iD = 0;
        ArrayList arrayListT = null;
        e eVar = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            int i3 = 1;
            if (iV != 1) {
                i3 = 2;
                if (iV != 2) {
                    i3 = 3;
                    if (iV != 3) {
                        i3 = 4;
                        if (iV != 4) {
                            N.b.J(parcel, iB);
                        } else {
                            eVar = (e) N.b.o(parcel, iB, e.CREATOR);
                        }
                    } else {
                        iD = N.b.D(parcel, iB);
                    }
                } else {
                    arrayListT = N.b.t(parcel, iB, g.CREATOR);
                }
            } else {
                iD2 = N.b.D(parcel, iB);
            }
            hashSet.add(Integer.valueOf(i3));
        }
        if (parcel.dataPosition() == iK) {
            return new b(hashSet, iD2, arrayListT, iD, eVar);
        }
        throw new b.a("Overread allowed size end=" + iK, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new b[i3];
    }
}
