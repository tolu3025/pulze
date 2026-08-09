package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        int iD = 0;
        PendingIntent pendingIntent = null;
        String strP = null;
        String strP2 = null;
        ArrayList arrayListR = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    pendingIntent = (PendingIntent) N.b.o(parcel, iB, PendingIntent.CREATOR);
                    break;
                case 2:
                    strP = N.b.p(parcel, iB);
                    break;
                case 3:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case 4:
                    arrayListR = N.b.r(parcel, iB);
                    break;
                case 5:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 6:
                    iD = N.b.D(parcel, iB);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new SaveAccountLinkingTokenRequest(pendingIntent, strP, strP2, arrayListR, strP3, iD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new SaveAccountLinkingTokenRequest[i3];
    }
}
