package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class a extends N.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f5216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CredentialPickerConfig f5217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CredentialPickerConfig f5218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5219f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f5221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f5222n;

    a(int i3, boolean z2, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z3, String str, String str2, boolean z4) {
        this.f5214a = i3;
        this.f5215b = z2;
        this.f5216c = (String[]) AbstractC0643s.k(strArr);
        this.f5217d = credentialPickerConfig == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig;
        this.f5218e = credentialPickerConfig2 == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig2;
        if (i3 < 3) {
            this.f5219f = true;
            this.f5220l = null;
            this.f5221m = null;
        } else {
            this.f5219f = z3;
            this.f5220l = str;
            this.f5221m = str2;
        }
        this.f5222n = z4;
    }

    public String[] s() {
        return this.f5216c;
    }

    public CredentialPickerConfig t() {
        return this.f5218e;
    }

    public CredentialPickerConfig u() {
        return this.f5217d;
    }

    public String v() {
        return this.f5221m;
    }

    public String w() {
        return this.f5220l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.g(parcel, 1, y());
        N.c.D(parcel, 2, s(), false);
        N.c.A(parcel, 3, u(), i3, false);
        N.c.A(parcel, 4, t(), i3, false);
        N.c.g(parcel, 5, x());
        N.c.C(parcel, 6, w(), false);
        N.c.C(parcel, 7, v(), false);
        N.c.g(parcel, 8, this.f5222n);
        N.c.s(parcel, 1000, this.f5214a);
        N.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f5219f;
    }

    public boolean y() {
        return this.f5215b;
    }
}
