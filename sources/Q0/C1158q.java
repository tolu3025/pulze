package q0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0666a0;
import java.util.ArrayList;

/* JADX INFO: renamed from: q0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1158q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        ArrayList arrayListT = null;
        C1157p c1157p = null;
        String strP = null;
        com.google.firebase.auth.E0 e02 = null;
        C1150i c1150i = null;
        ArrayList arrayListT2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    arrayListT = N.b.t(parcel, iB, com.google.firebase.auth.U.CREATOR);
                    break;
                case 2:
                    c1157p = (C1157p) N.b.o(parcel, iB, C1157p.CREATOR);
                    break;
                case 3:
                    strP = N.b.p(parcel, iB);
                    break;
                case 4:
                    e02 = (com.google.firebase.auth.E0) N.b.o(parcel, iB, com.google.firebase.auth.E0.CREATOR);
                    break;
                case 5:
                    c1150i = (C1150i) N.b.o(parcel, iB, C1150i.CREATOR);
                    break;
                case 6:
                    arrayListT2 = N.b.t(parcel, iB, C0666a0.CREATOR);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C1156o(arrayListT, c1157p, strP, e02, c1150i, arrayListT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C1156o[i3];
    }
}
