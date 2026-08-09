package com.google.android.gms.common.internal;

import M.C0415c;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Parcelable.Creator {
    static void a(C0632g c0632g, Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, c0632g.f5554a);
        N.c.s(parcel, 2, c0632g.f5555b);
        N.c.s(parcel, 3, c0632g.f5556c);
        N.c.C(parcel, 4, c0632g.f5557d, false);
        N.c.r(parcel, 5, c0632g.f5558e, false);
        N.c.F(parcel, 6, c0632g.f5559f, i3, false);
        N.c.j(parcel, 7, c0632g.f5560l, false);
        N.c.A(parcel, 8, c0632g.f5561m, i3, false);
        N.c.F(parcel, 10, c0632g.f5562n, i3, false);
        N.c.F(parcel, 11, c0632g.f5563o, i3, false);
        N.c.g(parcel, 12, c0632g.f5564p);
        N.c.s(parcel, 13, c0632g.f5565q);
        N.c.g(parcel, 14, c0632g.f5566r);
        N.c.C(parcel, 15, c0632g.s(), false);
        N.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = N.b.K(parcel);
        Scope[] scopeArr = C0632g.f5552t;
        Bundle bundle = new Bundle();
        C0415c[] c0415cArr = C0632g.f5553u;
        C0415c[] c0415cArr2 = c0415cArr;
        String strP = null;
        IBinder iBinderC = null;
        Account account = null;
        String strP2 = null;
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        boolean zW = false;
        int iD4 = 0;
        boolean zW2 = false;
        while (parcel.dataPosition() < iK) {
            int iB = N.b.B(parcel);
            switch (N.b.v(iB)) {
                case 1:
                    iD = N.b.D(parcel, iB);
                    break;
                case 2:
                    iD2 = N.b.D(parcel, iB);
                    break;
                case 3:
                    iD3 = N.b.D(parcel, iB);
                    break;
                case 4:
                    strP = N.b.p(parcel, iB);
                    break;
                case 5:
                    iBinderC = N.b.C(parcel, iB);
                    break;
                case 6:
                    scopeArr = (Scope[]) N.b.s(parcel, iB, Scope.CREATOR);
                    break;
                case 7:
                    bundle = N.b.f(parcel, iB);
                    break;
                case 8:
                    account = (Account) N.b.o(parcel, iB, Account.CREATOR);
                    break;
                case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                default:
                    N.b.J(parcel, iB);
                    break;
                case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    c0415cArr = (C0415c[]) N.b.s(parcel, iB, C0415c.CREATOR);
                    break;
                case 11:
                    c0415cArr2 = (C0415c[]) N.b.s(parcel, iB, C0415c.CREATOR);
                    break;
                case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    zW = N.b.w(parcel, iB);
                    break;
                case 13:
                    iD4 = N.b.D(parcel, iB);
                    break;
                case 14:
                    zW2 = N.b.w(parcel, iB);
                    break;
                case 15:
                    strP2 = N.b.p(parcel, iB);
                    break;
            }
        }
        N.b.u(parcel, iK);
        return new C0632g(iD, iD2, iD3, strP, iBinderC, scopeArr, bundle, account, c0415cArr, c0415cArr2, zW, iD4, zW2, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0632g[i3];
    }
}
