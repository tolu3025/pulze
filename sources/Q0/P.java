package q0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0666a0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        ArrayList arrayListT = null;
        ArrayList arrayListT2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                arrayListT = N.b.t(parcel, iB, com.google.firebase.auth.U.CREATOR);
            } else if (iV != 2) {
                N.b.J(parcel, iB);
            } else {
                arrayListT2 = N.b.t(parcel, iB, C0666a0.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new M(arrayListT, arrayListT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new M[i3];
    }
}
