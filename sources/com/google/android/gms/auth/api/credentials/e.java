package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArrQ = null;
        String strP = null;
        String strP2 = null;
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV != 1000) {
                switch (iV) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) N.b.o(parcel, iB, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        zW = N.b.w(parcel, iB);
                        break;
                    case 3:
                        zW2 = N.b.w(parcel, iB);
                        break;
                    case 4:
                        strArrQ = N.b.q(parcel, iB);
                        break;
                    case 5:
                        zW3 = N.b.w(parcel, iB);
                        break;
                    case 6:
                        strP = N.b.p(parcel, iB);
                        break;
                    case 7:
                        strP2 = N.b.p(parcel, iB);
                        break;
                    default:
                        N.b.J(parcel, iB);
                        break;
                }
            } else {
                iD = N.b.D(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new HintRequest(iD, credentialPickerConfig, zW, zW2, strArrQ, zW3, strP, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new HintRequest[i3];
    }
}
