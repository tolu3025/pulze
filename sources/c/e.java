package C;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        String strP = null;
        Account account = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                iD = N.b.D(parcel, iB);
            } else if (iV == 2) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV == 3) {
                strP = N.b.p(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                account = (Account) N.b.o(parcel, iB, Account.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new b(iD, iD2, strP, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new b[i3];
    }
}
