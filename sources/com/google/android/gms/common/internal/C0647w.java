package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0647w extends N.a {
    public static final Parcelable.Creator<C0647w> CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f5631b;

    public C0647w(int i3, List list) {
        this.f5630a = i3;
        this.f5631b = list;
    }

    public final int s() {
        return this.f5630a;
    }

    public final List t() {
        return this.f5631b;
    }

    public final void u(C0641p c0641p) {
        if (this.f5631b == null) {
            this.f5631b = new ArrayList();
        }
        this.f5631b.add(c0641p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f5630a);
        N.c.G(parcel, 2, this.f5631b, false);
        N.c.b(parcel, iA);
    }
}
