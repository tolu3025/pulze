package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* JADX INFO: renamed from: com.google.firebase.auth.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0670c0 extends AbstractC0679h {
    public static final Parcelable.Creator<C0670c0> CREATOR = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6040b;

    C0670c0(String str, String str2) {
        this.f6039a = AbstractC0643s.e(str);
        this.f6040b = AbstractC0643s.e(str2);
    }

    public static zzajb v(C0670c0 c0670c0, String str) {
        AbstractC0643s.k(c0670c0);
        return new zzajb(null, c0670c0.f6039a, c0670c0.s(), null, c0670c0.f6040b, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String s() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String t() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final AbstractC0679h u() {
        return new C0670c0(this.f6039a, this.f6040b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f6039a, false);
        N.c.C(parcel, 2, this.f6040b, false);
        N.c.b(parcel, iA);
    }
}
