package c0;

import M.C0413a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.T;

/* JADX INFO: renamed from: c0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0542m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        C0413a c0413a = null;
        int iD = 0;
        T t2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                c0413a = (C0413a) N.b.o(parcel, iB, C0413a.CREATOR);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                t2 = (T) N.b.o(parcel, iB, T.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new C0541l(iD, c0413a, t2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0541l[i3];
    }
}
