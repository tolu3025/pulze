package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strP2 = "";
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 4) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 7) {
                googleSignInAccount = (GoogleSignInAccount) N.b.o(parcel, iB, GoogleSignInAccount.CREATOR);
            } else if (iV != 8) {
                N.b.J(parcel, iB);
            } else {
                strP2 = N.b.p(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new SignInAccount(strP, googleSignInAccount, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new SignInAccount[i3];
    }
}
