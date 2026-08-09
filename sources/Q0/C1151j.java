package q0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: q0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1151j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        long jF = 0;
        long jF2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                jF = N.b.F(parcel, iB);
            } else if (iV != 2) {
                N.b.J(parcel, iB);
            } else {
                jF2 = N.b.F(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C1152k(jF, jF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C1152k[i3];
    }
}
