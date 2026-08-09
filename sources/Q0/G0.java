package q0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        C1150i c1150i = null;
        F0 f02 = null;
        com.google.firebase.auth.E0 e02 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                c1150i = (C1150i) N.b.o(parcel, iB, C1150i.CREATOR);
            } else if (iV == 2) {
                f02 = (F0) N.b.o(parcel, iB, F0.CREATOR);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                e02 = (com.google.firebase.auth.E0) N.b.o(parcel, iB, com.google.firebase.auth.E0.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new H0(c1150i, f02, e02);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new H0[i3];
    }
}
