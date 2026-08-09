package q0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.C0703t0;
import java.util.ArrayList;

/* JADX INFO: renamed from: q0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1148h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        zzahv zzahvVar = null;
        C1142e c1142e = null;
        String strP = null;
        String strP2 = null;
        ArrayList arrayListT = null;
        ArrayList arrayListR = null;
        String strP3 = null;
        Boolean boolX = null;
        C1152k c1152k = null;
        com.google.firebase.auth.E0 e02 = null;
        M m3 = null;
        ArrayList arrayListT2 = null;
        boolean zW = false;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    zzahvVar = (zzahv) N.b.o(parcel, iB, zzahv.CREATOR);
                    break;
                case 2:
                    c1142e = (C1142e) N.b.o(parcel, iB, C1142e.CREATOR);
                    break;
                case 3:
                    strP = N.b.p(parcel, iB);
                    break;
                case 4:
                    strP2 = N.b.p(parcel, iB);
                    break;
                case 5:
                    arrayListT = N.b.t(parcel, iB, C1142e.CREATOR);
                    break;
                case 6:
                    arrayListR = N.b.r(parcel, iB);
                    break;
                case 7:
                    strP3 = N.b.p(parcel, iB);
                    break;
                case 8:
                    boolX = N.b.x(parcel, iB);
                    break;
                case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    c1152k = (C1152k) N.b.o(parcel, iB, C1152k.CREATOR);
                    break;
                case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    zW = N.b.w(parcel, iB);
                    break;
                case 11:
                    e02 = (com.google.firebase.auth.E0) N.b.o(parcel, iB, com.google.firebase.auth.E0.CREATOR);
                    break;
                case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    m3 = (M) N.b.o(parcel, iB, M.CREATOR);
                    break;
                case 13:
                    arrayListT2 = N.b.t(parcel, iB, C0703t0.CREATOR);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C1150i(zzahvVar, c1142e, strP, strP2, arrayListT, arrayListR, strP3, boolX, c1152k, zW, e02, m3, arrayListT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C1150i[i3];
    }
}
