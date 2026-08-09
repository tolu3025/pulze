package c0;

import M.C0413a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.T;

/* JADX INFO: renamed from: c0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0541l extends N.a {
    public static final Parcelable.Creator<C0541l> CREATOR = new C0542m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0413a f5003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f5004c;

    C0541l(int i3, C0413a c0413a, T t2) {
        this.f5002a = i3;
        this.f5003b = c0413a;
        this.f5004c = t2;
    }

    public final C0413a s() {
        return this.f5003b;
    }

    public final T t() {
        return this.f5004c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f5002a);
        N.c.A(parcel, 2, this.f5003b, i3, false);
        N.c.A(parcel, 3, this.f5004c, i3, false);
        N.c.b(parcel, iA);
    }
}
