package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class HintRequest extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CredentialPickerConfig f5205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f5208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5209f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f5211m;

    HintRequest(int i3, CredentialPickerConfig credentialPickerConfig, boolean z2, boolean z3, String[] strArr, boolean z4, String str, String str2) {
        this.f5204a = i3;
        this.f5205b = (CredentialPickerConfig) AbstractC0643s.k(credentialPickerConfig);
        this.f5206c = z2;
        this.f5207d = z3;
        this.f5208e = (String[]) AbstractC0643s.k(strArr);
        if (i3 < 2) {
            this.f5209f = true;
            this.f5210l = null;
            this.f5211m = null;
        } else {
            this.f5209f = z4;
            this.f5210l = str;
            this.f5211m = str2;
        }
    }

    public String[] s() {
        return this.f5208e;
    }

    public CredentialPickerConfig t() {
        return this.f5205b;
    }

    public String u() {
        return this.f5211m;
    }

    public String v() {
        return this.f5210l;
    }

    public boolean w() {
        return this.f5206c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, t(), i3, false);
        N.c.g(parcel, 2, w());
        N.c.g(parcel, 3, this.f5207d);
        N.c.D(parcel, 4, s(), false);
        N.c.g(parcel, 5, x());
        N.c.C(parcel, 6, v(), false);
        N.c.C(parcel, 7, u(), false);
        N.c.s(parcel, 1000, this.f5204a);
        N.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f5209f;
    }
}
