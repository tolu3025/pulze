package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* JADX INFO: loaded from: classes.dex */
public class F extends AbstractC0679h {
    public static final Parcelable.Creator<F> CREATOR = new C0698q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5916b;

    F(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f5915a = str;
        this.f5916b = str2;
    }

    public static zzajb v(F f3, String str) {
        AbstractC0643s.k(f3);
        return new zzajb(f3.f5915a, f3.f5916b, f3.s(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String s() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String t() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final AbstractC0679h u() {
        return new F(this.f5915a, this.f5916b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f5915a, false);
        N.c.C(parcel, 2, this.f5916b, false);
        N.c.b(parcel, iA);
    }
}
