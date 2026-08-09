package com.google.android.gms.internal.p002firebaseauthapi;

import N.b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzaiy implements Parcelable.Creator<zzaiz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            b.v(iB);
            b.J(parcel, iB);
        }
        b.u(parcel, iK);
        return new zzaiz();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz[] newArray(int i3) {
        return new zzaiz[i3];
    }
}
