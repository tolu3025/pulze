package com.google.android.gms.common.internal;

import M.C0413a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC0636k;

/* JADX INFO: loaded from: classes.dex */
public final class T extends N.a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final IBinder f5506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0413a f5507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5509e;

    T(int i3, IBinder iBinder, C0413a c0413a, boolean z2, boolean z3) {
        this.f5505a = i3;
        this.f5506b = iBinder;
        this.f5507c = c0413a;
        this.f5508d = z2;
        this.f5509e = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t2 = (T) obj;
        return this.f5507c.equals(t2.f5507c) && AbstractC0642q.b(s(), t2.s());
    }

    public final InterfaceC0636k s() {
        IBinder iBinder = this.f5506b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC0636k.a.a(iBinder);
    }

    public final C0413a t() {
        return this.f5507c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f5505a);
        N.c.r(parcel, 2, this.f5506b, false);
        N.c.A(parcel, 3, this.f5507c, i3, false);
        N.c.g(parcel, 4, this.f5508d);
        N.c.g(parcel, 5, this.f5509e);
        N.c.b(parcel, iA);
    }
}
