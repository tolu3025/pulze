package com.google.android.gms.internal.p000authapi;

import N.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;

/* JADX INFO: loaded from: classes.dex */
public final class zbq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            if (b.v(iB) != 1) {
                b.J(parcel, iB);
            } else {
                credential = (Credential) b.o(parcel, iB, Credential.CREATOR);
            }
        }
        b.u(parcel, iK);
        return new zbp(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new zbp[i3];
    }
}
