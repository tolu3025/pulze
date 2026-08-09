package G;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        ArrayList arrayListR = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    strP = N.b.p(parcel, iB);
                    break;
                case 2:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case 3:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 4:
                    arrayListR = N.b.r(parcel, iB);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) N.b.o(parcel, iB, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) N.b.o(parcel, iB, PendingIntent.CREATOR);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0318a(strP, strP2, strP3, arrayListR, googleSignInAccount, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0318a[i3];
    }
}
