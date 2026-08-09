package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class O extends AbstractC0679h implements Cloneable {
    public static final Parcelable.Creator<O> CREATOR = new C0705u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5978e;

    O(String str, String str2, String str3, boolean z2, String str4) {
        AbstractC0643s.b(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f5974a = str;
        this.f5975b = str2;
        this.f5976c = str3;
        this.f5977d = z2;
        this.f5978e = str4;
    }

    public static O w(String str, String str2) {
        return new O(str, str2, null, true, null);
    }

    public static O y(String str, String str2) {
        return new O(null, null, str, true, str2);
    }

    public final boolean A() {
        return this.f5977d;
    }

    public /* synthetic */ Object clone() {
        return new O(this.f5974a, v(), this.f5976c, this.f5977d, this.f5978e);
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String s() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public String t() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final AbstractC0679h u() {
        return (O) clone();
    }

    public String v() {
        return this.f5975b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f5974a, false);
        N.c.C(parcel, 2, v(), false);
        N.c.C(parcel, 4, this.f5976c, false);
        N.c.g(parcel, 5, this.f5977d);
        N.c.C(parcel, 6, this.f5978e, false);
        N.c.b(parcel, iA);
    }

    public final O x(boolean z2) {
        this.f5977d = false;
        return this;
    }

    public final String z() {
        return this.f5976c;
    }

    public final String zzc() {
        return this.f5974a;
    }

    public final String zzd() {
        return this.f5978e;
    }
}
