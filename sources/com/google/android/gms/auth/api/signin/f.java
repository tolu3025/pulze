package com.google.android.gms.auth.api.signin;

import V0.I;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        ArrayList arrayListT = null;
        Account account = null;
        String strP = null;
        String strP2 = null;
        ArrayList arrayListT2 = null;
        String strP3 = null;
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    iD = N.b.D(parcel, iB);
                    break;
                case 2:
                    arrayListT = N.b.t(parcel, iB, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) N.b.o(parcel, iB, Account.CREATOR);
                    break;
                case 4:
                    zW = N.b.w(parcel, iB);
                    break;
                case 5:
                    zW2 = N.b.w(parcel, iB);
                    break;
                case 6:
                    zW3 = N.b.w(parcel, iB);
                    break;
                case 7:
                    strP = N.b.p(parcel, iB);
                    break;
                case 8:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    arrayListT2 = N.b.t(parcel, iB, K.a.CREATOR);
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    strP3 = N.b.p(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new GoogleSignInOptions(iD, arrayListT, account, zW, zW2, zW3, strP, strP2, arrayListT2, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new GoogleSignInOptions[i3];
    }
}
