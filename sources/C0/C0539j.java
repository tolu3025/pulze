package c0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Q;

/* JADX INFO: renamed from: c0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0539j extends N.a {
    public static final Parcelable.Creator<C0539j> CREATOR = new C0540k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Q f5001b;

    C0539j(int i3, Q q2) {
        this.f5000a = i3;
        this.f5001b = q2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f5000a);
        N.c.A(parcel, 2, this.f5001b, i3, false);
        N.c.b(parcel, iA);
    }
}
