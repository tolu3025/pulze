package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        ArrayList arrayListT = null;
        String strP = null;
        Account account = null;
        String strP2 = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    arrayListT = N.b.t(parcel, iB, Scope.CREATOR);
                    break;
                case 2:
                    strP = N.b.p(parcel, iB);
                    break;
                case 3:
                    zW = N.b.w(parcel, iB);
                    break;
                case 4:
                    zW2 = N.b.w(parcel, iB);
                    break;
                case 5:
                    account = (Account) N.b.o(parcel, iB, Account.CREATOR);
                    break;
                case 6:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case 7:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 8:
                    zW3 = N.b.w(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new AuthorizationRequest(arrayListT, strP, zW, zW2, account, strP2, strP3, zW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new AuthorizationRequest[i3];
    }
}
