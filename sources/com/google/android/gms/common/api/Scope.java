package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends N.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5310b;

    Scope(int i3, String str) {
        AbstractC0643s.f(str, "scopeUri must not be null or empty");
        this.f5309a = i3;
        this.f5310b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f5310b.equals(((Scope) obj).f5310b);
        }
        return false;
    }

    public int hashCode() {
        return this.f5310b.hashCode();
    }

    public String s() {
        return this.f5310b;
    }

    public String toString() {
        return this.f5310b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f5309a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.C(parcel, 2, s(), false);
        N.c.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
