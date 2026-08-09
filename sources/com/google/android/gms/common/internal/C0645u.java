package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0645u extends N.a {
    public static final Parcelable.Creator<C0645u> CREATOR = new Z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5627e;

    public C0645u(int i3, boolean z2, boolean z3, int i4, int i5) {
        this.f5623a = i3;
        this.f5624b = z2;
        this.f5625c = z3;
        this.f5626d = i4;
        this.f5627e = i5;
    }

    public int s() {
        return this.f5626d;
    }

    public int t() {
        return this.f5627e;
    }

    public boolean u() {
        return this.f5624b;
    }

    public boolean v() {
        return this.f5625c;
    }

    public int w() {
        return this.f5623a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, w());
        N.c.g(parcel, 2, u());
        N.c.g(parcel, 3, v());
        N.c.s(parcel, 4, s());
        N.c.s(parcel, 5, t());
        N.c.b(parcel, iA);
    }
}
