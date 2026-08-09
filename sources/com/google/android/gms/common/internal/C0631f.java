package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0631f extends N.a {
    public static final Parcelable.Creator<C0631f> CREATOR = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0645u f5544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f5547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f5549f;

    public C0631f(C0645u c0645u, boolean z2, boolean z3, int[] iArr, int i3, int[] iArr2) {
        this.f5544a = c0645u;
        this.f5545b = z2;
        this.f5546c = z3;
        this.f5547d = iArr;
        this.f5548e = i3;
        this.f5549f = iArr2;
    }

    public int s() {
        return this.f5548e;
    }

    public int[] t() {
        return this.f5547d;
    }

    public int[] u() {
        return this.f5549f;
    }

    public boolean v() {
        return this.f5545b;
    }

    public boolean w() {
        return this.f5546c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, this.f5544a, i3, false);
        N.c.g(parcel, 2, v());
        N.c.g(parcel, 3, w());
        N.c.t(parcel, 4, t(), false);
        N.c.s(parcel, 5, s());
        N.c.t(parcel, 6, u(), false);
        N.c.b(parcel, iA);
    }

    public final C0645u x() {
        return this.f5544a;
    }
}
