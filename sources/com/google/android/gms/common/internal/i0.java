package com.google.android.gms.common.internal;

import M.C0415c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        Bundle bundleF = null;
        C0631f c0631f = null;
        int iD = 0;
        C0415c[] c0415cArr = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                bundleF = N.b.f(parcel, iB);
            } else if (iV == 2) {
                c0415cArr = (C0415c[]) N.b.s(parcel, iB, C0415c.CREATOR);
            } else if (iV == 3) {
                iD = N.b.D(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                c0631f = (C0631f) N.b.o(parcel, iB, C0631f.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new h0(bundleF, c0415cArr, iD, c0631f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new h0[i3];
    }
}
