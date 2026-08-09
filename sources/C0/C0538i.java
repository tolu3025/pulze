package c0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: c0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0538i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        ArrayList arrayListR = null;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                arrayListR = N.b.r(parcel, iB);
            } else if (iV != 2) {
                N.b.J(parcel, iB);
            } else {
                strP = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0537h(arrayListR, strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0537h[i3];
    }
}
