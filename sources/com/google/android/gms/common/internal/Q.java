package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends N.a {
    public static final Parcelable.Creator<Q> CREATOR = new S();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Account f5502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f5504d;

    Q(int i3, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.f5501a = i3;
        this.f5502b = account;
        this.f5503c = i4;
        this.f5504d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f5501a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.A(parcel, 2, this.f5502b, i3, false);
        N.c.s(parcel, 3, this.f5503c);
        N.c.A(parcel, 4, this.f5504d, i3, false);
        N.c.b(parcel, iA);
    }

    public Q(Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i3, googleSignInAccount);
    }
}
