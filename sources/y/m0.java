package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        G g3 = null;
        p0 p0Var = null;
        C0445f c0445f = null;
        r0 r0Var = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                g3 = (G) N.b.o(parcel, iB, G.CREATOR);
            } else if (iV == 2) {
                p0Var = (p0) N.b.o(parcel, iB, p0.CREATOR);
            } else if (iV == 3) {
                c0445f = (C0445f) N.b.o(parcel, iB, C0445f.CREATOR);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                r0Var = (r0) N.b.o(parcel, iB, r0.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new C0443e(g3, p0Var, c0445f, r0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0443e[i3];
    }
}
