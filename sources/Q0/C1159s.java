package q0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0666a0;
import java.util.ArrayList;

/* JADX INFO: renamed from: q0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1159s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        ArrayList arrayListT = null;
        ArrayList arrayListT2 = null;
        C1150i c1150i = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = N.b.p(parcel, iB);
            } else if (iV == 3) {
                arrayListT = N.b.t(parcel, iB, com.google.firebase.auth.U.CREATOR);
            } else if (iV == 4) {
                arrayListT2 = N.b.t(parcel, iB, C0666a0.CREATOR);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                c1150i = (C1150i) N.b.o(parcel, iB, C1150i.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new C1157p(strP, strP2, arrayListT, arrayListT2, c1150i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C1157p[i3];
    }
}
