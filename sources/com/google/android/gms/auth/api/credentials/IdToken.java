package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class IdToken extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new F.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5213b;

    public IdToken(String str, String str2) {
        AbstractC0643s.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        AbstractC0643s.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f5212a = str;
        this.f5213b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return AbstractC0642q.b(this.f5212a, idToken.f5212a) && AbstractC0642q.b(this.f5213b, idToken.f5213b);
    }

    public String s() {
        return this.f5212a;
    }

    public String t() {
        return this.f5213b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, s(), false);
        N.c.C(parcel, 2, t(), false);
        N.c.b(parcel, iA);
    }
}
