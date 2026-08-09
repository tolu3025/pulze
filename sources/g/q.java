package G;

import G.C0319b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        C0319b.e eVar = null;
        C0319b.C0013b c0013b = null;
        String strP = null;
        C0319b.d dVar = null;
        C0319b.c cVar = null;
        boolean zW = false;
        int iD = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    eVar = (C0319b.e) N.b.o(parcel, iB, C0319b.e.CREATOR);
                    break;
                case 2:
                    c0013b = (C0319b.C0013b) N.b.o(parcel, iB, C0319b.C0013b.CREATOR);
                    break;
                case 3:
                    strP = N.b.p(parcel, iB);
                    break;
                case 4:
                    zW = N.b.w(parcel, iB);
                    break;
                case 5:
                    iD = N.b.D(parcel, iB);
                    break;
                case 6:
                    dVar = (C0319b.d) N.b.o(parcel, iB, C0319b.d.CREATOR);
                    break;
                case 7:
                    cVar = (C0319b.c) N.b.o(parcel, iB, C0319b.c.CREATOR);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0319b(eVar, c0013b, strP, zW, iD, dVar, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0319b[i3];
    }
}
