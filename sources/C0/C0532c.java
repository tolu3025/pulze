package c0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0532c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        Intent intent = null;
        int iD = 0;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV != 3) {
                N.b.J(parcel, iB);
            } else {
                intent = (Intent) N.b.o(parcel, iB, Intent.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new C0531b(iD, iD2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0531b[i3];
    }
}
