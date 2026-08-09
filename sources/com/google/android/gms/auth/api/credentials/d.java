package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        String[] strArrQ = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String strP = null;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV != 1000) {
                switch (iV) {
                    case 1:
                        zW = N.b.w(parcel, iB);
                        break;
                    case 2:
                        strArrQ = N.b.q(parcel, iB);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) N.b.o(parcel, iB, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) N.b.o(parcel, iB, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        zW2 = N.b.w(parcel, iB);
                        break;
                    case 6:
                        strP = N.b.p(parcel, iB);
                        break;
                    case 7:
                        strP2 = N.b.p(parcel, iB);
                        break;
                    case 8:
                        zW3 = N.b.w(parcel, iB);
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
        return new a(iD, zW, strArrQ, credentialPickerConfig, credentialPickerConfig2, zW2, strP, strP2, zW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new a[i3];
    }
}
