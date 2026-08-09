package K;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 2) {
                strP = N.b.p(parcel, iB);
            } else if (iV != 5) {
                N.b.J(parcel, iB);
            } else {
                googleSignInOptions = (GoogleSignInOptions) N.b.o(parcel, iB, GoogleSignInOptions.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new SignInConfiguration(strP, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new SignInConfiguration[i3];
    }
}
