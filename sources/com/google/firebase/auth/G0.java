package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            if (N.b.v(iB) != 1) {
                N.b.J(parcel, iB);
            } else {
                strP = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new C0687l(strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0687l[i3];
    }
}
