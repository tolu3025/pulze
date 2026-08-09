package E;

import N.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        HashSet hashSet = new HashSet();
        i iVar = null;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        int iD = 0;
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
                            i3 = 5;
                            if (iV != 5) {
                                N.b.J(parcel, iB);
                            } else {
                                strP3 = N.b.p(parcel, iB);
                            }
                        } else {
                            strP2 = N.b.p(parcel, iB);
                        }
                    } else {
                        strP = N.b.p(parcel, iB);
                    }
                } else {
                    iVar = (i) N.b.o(parcel, iB, i.CREATOR);
                }
            } else {
                iD = N.b.D(parcel, iB);
            }
            hashSet.add(Integer.valueOf(i3));
        }
        if (parcel.dataPosition() == iK) {
            return new g(hashSet, iD, iVar, strP, strP2, strP3);
        }
        throw new b.a("Overread allowed size end=" + iK, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new g[i3];
    }
}
