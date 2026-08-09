package Q;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends N.a {
    public static final Parcelable.Creator<d> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f2778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f2779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f2780c;

    d(int i3, String str, int i4) {
        this.f2778a = i3;
        this.f2779b = str;
        this.f2780c = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f2778a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.C(parcel, 2, this.f2779b, false);
        N.c.s(parcel, 3, this.f2780c);
        N.c.b(parcel, iA);
    }

    d(String str, int i3) {
        this.f2778a = 1;
        this.f2779b = str;
        this.f2780c = i3;
    }
}
