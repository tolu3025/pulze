package com.google.android.gms.auth.api.signin.internal;

import K.b;
import K.w;
import N.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f5299b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f5298a = AbstractC0643s.e(str);
        this.f5299b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f5298a.equals(signInConfiguration.f5298a)) {
            GoogleSignInOptions googleSignInOptions = this.f5299b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f5299b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f5298a).a(this.f5299b).b();
    }

    public final GoogleSignInOptions s() {
        return this.f5299b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = c.a(parcel);
        c.C(parcel, 2, this.f5298a, false);
        c.A(parcel, 5, this.f5299b, i3, false);
        c.b(parcel, iA);
    }
}
