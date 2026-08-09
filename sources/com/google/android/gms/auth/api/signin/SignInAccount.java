package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f5292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f5293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f5294c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5293b = googleSignInAccount;
        this.f5292a = AbstractC0643s.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f5294c = AbstractC0643s.f(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount s() {
        return this.f5293b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 4, this.f5292a, false);
        N.c.A(parcel, 7, this.f5293b, i3, false);
        N.c.C(parcel, 8, this.f5294c, false);
        N.c.b(parcel, iA);
    }
}
