package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends M {
    public static final Parcelable.Creator<E0> CREATOR = new D0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zzajb f5911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5913f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5914l;

    E0(String str, String str2, String str3, zzajb zzajbVar, String str4, String str5, String str6) {
        this.f5908a = zzac.zzb(str);
        this.f5909b = str2;
        this.f5910c = str3;
        this.f5911d = zzajbVar;
        this.f5912e = str4;
        this.f5913f = str5;
        this.f5914l = str6;
    }

    static E0 A(String str, String str2, String str3, String str4) {
        AbstractC0643s.f(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new E0(str, str2, str3, null, null, null, str4);
    }

    public static E0 B(String str, String str2, String str3, String str4, String str5) {
        AbstractC0643s.f(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new E0(str, str2, str3, null, str4, str5, null);
    }

    public static zzajb y(E0 e02, String str) {
        AbstractC0643s.k(e02);
        zzajb zzajbVar = e02.f5911d;
        return zzajbVar != null ? zzajbVar : new zzajb(e02.w(), e02.v(), e02.s(), null, e02.x(), null, str, e02.f5912e, e02.f5914l);
    }

    public static E0 z(zzajb zzajbVar) {
        AbstractC0643s.l(zzajbVar, "Must specify a non-null webSignInCredential");
        return new E0(null, null, null, zzajbVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final String s() {
        return this.f5908a;
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final String t() {
        return this.f5908a;
    }

    @Override // com.google.firebase.auth.AbstractC0679h
    public final AbstractC0679h u() {
        return new E0(this.f5908a, this.f5909b, this.f5910c, this.f5911d, this.f5912e, this.f5913f, this.f5914l);
    }

    @Override // com.google.firebase.auth.M
    public final String v() {
        return this.f5910c;
    }

    @Override // com.google.firebase.auth.M
    public final String w() {
        return this.f5909b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, s(), false);
        N.c.C(parcel, 2, w(), false);
        N.c.C(parcel, 3, v(), false);
        N.c.A(parcel, 4, this.f5911d, i3, false);
        N.c.C(parcel, 5, this.f5912e, false);
        N.c.C(parcel, 6, x(), false);
        N.c.C(parcel, 7, this.f5914l, false);
        N.c.b(parcel, iA);
    }

    @Override // com.google.firebase.auth.M
    public final String x() {
        return this.f5913f;
    }
}
