package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;

/* JADX INFO: renamed from: com.google.firebase.auth.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0713y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        String strP = null;
        String strP2 = null;
        zzaiz zzaizVar = null;
        long jF = 0;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            int iV = N.b.v(iB);
            if (iV == 1) {
                strP = N.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = N.b.p(parcel, iB);
            } else if (iV == 3) {
                jF = N.b.F(parcel, iB);
            } else if (iV != 4) {
                N.b.J(parcel, iB);
            } else {
                zzaizVar = (zzaiz) N.b.o(parcel, iB, zzaiz.CREATOR);
            }
        }
        N.b.u(parcel, iK);
        return new C0666a0(strP, strP2, jF, zzaizVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0666a0[i3];
    }
}
