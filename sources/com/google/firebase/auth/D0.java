package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        zzajb zzajbVar = null;
        String strP4 = null;
        String strP5 = null;
        String strP6 = null;
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
                    zzajbVar = (zzajb) N.b.o(parcel, iB, zzajb.CREATOR);
                    break;
                case 5:
                    strP4 = N.b.p(parcel, iB);
                    break;
                case 6:
                    strP5 = N.b.p(parcel, iB);
                    break;
                case 7:
                    strP6 = N.b.p(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new E0(strP, strP2, strP3, zzajbVar, strP4, strP5, strP6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new E0[i3];
    }
}
