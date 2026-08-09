package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0641p extends N.a {
    public static final Parcelable.Creator<C0641p> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f5608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f5609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5610f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f5612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f5613n;

    public C0641p(int i3, int i4, int i5, long j3, long j4, String str, String str2, int i6, int i7) {
        this.f5605a = i3;
        this.f5606b = i4;
        this.f5607c = i5;
        this.f5608d = j3;
        this.f5609e = j4;
        this.f5610f = str;
        this.f5611l = str2;
        this.f5612m = i6;
        this.f5613n = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f5605a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.s(parcel, 2, this.f5606b);
        N.c.s(parcel, 3, this.f5607c);
        N.c.v(parcel, 4, this.f5608d);
        N.c.v(parcel, 5, this.f5609e);
        N.c.C(parcel, 6, this.f5610f, false);
        N.c.C(parcel, 7, this.f5611l, false);
        N.c.s(parcel, 8, this.f5612m);
        N.c.s(parcel, 9, this.f5613n);
        N.c.b(parcel, iA);
    }
}
