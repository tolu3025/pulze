package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class B extends N.a {
    public static final Parcelable.Creator<B> CREATOR = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5485e;

    public B(int i3, String str, long j3, int i4, boolean z2) {
        this.f5481a = i3;
        this.f5482b = str;
        this.f5483c = j3;
        this.f5484d = i4;
        this.f5485e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f5481a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.C(parcel, 2, this.f5482b, false);
        N.c.v(parcel, 3, this.f5483c);
        N.c.s(parcel, 4, this.f5484d);
        N.c.g(parcel, 5, this.f5485e);
        N.c.b(parcel, iA);
    }
}
