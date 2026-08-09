package c0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Q;

/* JADX INFO: renamed from: c0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0540k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        Q q2 = null;
        int iD = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV != 2) {
                N.b.J(parcel, iB);
            } else {
                q2 = (Q) N.b.o(parcel, iB, Q.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new C0539j(iD, q2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0539j[i3];
    }
}
