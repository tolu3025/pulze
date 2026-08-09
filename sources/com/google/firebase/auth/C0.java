package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.Q;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            N.b.v(iB);
            N.b.J(parcel, iB);
        }
        N.b.u(parcel, iK);
        return new Q.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new Q.a[i3];
    }
}
