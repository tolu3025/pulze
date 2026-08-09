package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends N.a {
    public static final Parcelable.Creator<g> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f5657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a.C0110a f5658c;

    g(int i3, String str, a.C0110a c0110a) {
        this.f5656a = i3;
        this.f5657b = str;
        this.f5658c = c0110a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f5656a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.C(parcel, 2, this.f5657b, false);
        N.c.A(parcel, 3, this.f5658c, i3, false);
        N.c.b(parcel, iA);
    }

    g(String str, a.C0110a c0110a) {
        this.f5656a = 1;
        this.f5657b = str;
        this.f5658c = c0110a;
    }
}
