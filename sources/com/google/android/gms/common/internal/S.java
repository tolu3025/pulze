package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        Account account = null;
        int iD = 0;
        int iD2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                account = (Account) N.b.o(parcel, iB, Account.CREATOR);
            } else if (iV == 3) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                googleSignInAccount = (GoogleSignInAccount) N.b.o(parcel, iB, GoogleSignInAccount.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new Q(iD, account, iD2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new Q[i3];
    }
}
