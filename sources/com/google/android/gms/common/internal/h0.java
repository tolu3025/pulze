package com.google.android.gms.common.internal;

import M.C0415c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends N.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f5569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C0415c[] f5570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f5571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C0631f f5572d;

    h0(Bundle bundle, C0415c[] c0415cArr, int i3, C0631f c0631f) {
        this.f5569a = bundle;
        this.f5570b = c0415cArr;
        this.f5571c = i3;
        this.f5572d = c0631f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.j(parcel, 1, this.f5569a, false);
        N.c.F(parcel, 2, this.f5570b, i3, false);
        N.c.s(parcel, 3, this.f5571c);
        N.c.A(parcel, 4, this.f5572d, i3, false);
        N.c.b(parcel, iA);
    }
}
