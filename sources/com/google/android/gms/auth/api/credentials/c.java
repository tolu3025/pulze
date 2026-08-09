package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                zW = N.b.w(parcel, iB);
            } else if (iV == 2) {
                zW2 = N.b.w(parcel, iB);
            } else if (iV == 3) {
                zW3 = N.b.w(parcel, iB);
            } else if (iV == 4) {
                iD2 = N.b.D(parcel, iB);
            } else if (iV != 1000) {
                N.b.J(parcel, iB);
            } else {
                iD = N.b.D(parcel, iB);
            }
        }
        N.b.u(parcel, iK);
        return new CredentialPickerConfig(iD, zW, zW2, zW3, iD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new CredentialPickerConfig[i3];
    }
}
