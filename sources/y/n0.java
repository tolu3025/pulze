package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        r rVar = null;
        C0 c02 = null;
        F f3 = null;
        I0 i02 = null;
        K k3 = null;
        M m3 = null;
        E0 e02 = null;
        P p2 = null;
        C0461s c0461s = null;
        S s2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 2:
                    rVar = (r) N.b.o(parcel, iB, r.CREATOR);
                    break;
                case 3:
                    c02 = (C0) N.b.o(parcel, iB, C0.CREATOR);
                    break;
                case 4:
                    f3 = (F) N.b.o(parcel, iB, F.CREATOR);
                    break;
                case 5:
                    i02 = (I0) N.b.o(parcel, iB, I0.CREATOR);
                    break;
                case 6:
                    k3 = (K) N.b.o(parcel, iB, K.CREATOR);
                    break;
                case 7:
                    m3 = (M) N.b.o(parcel, iB, M.CREATOR);
                    break;
                case 8:
                    e02 = (E0) N.b.o(parcel, iB, E0.CREATOR);
                    break;
                case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    p2 = (P) N.b.o(parcel, iB, P.CREATOR);
                    break;
                case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    c0461s = (C0461s) N.b.o(parcel, iB, C0461s.CREATOR);
                    break;
                case 11:
                    s2 = (S) N.b.o(parcel, iB, S.CREATOR);
                    break;
                default:
                    N.b.J(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0441d(rVar, c02, f3, i02, k3, m3, e02, p2, c0461s, s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0441d[i3];
    }
}
