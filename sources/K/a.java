package K;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a extends N.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f2555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f2557c;

    a(int i3, int i4, Bundle bundle) {
        this.f2555a = i3;
        this.f2556b = i4;
        this.f2557c = bundle;
    }

    public int s() {
        return this.f2556b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f2555a);
        N.c.s(parcel, 2, s());
        N.c.j(parcel, 3, this.f2557c, false);
        N.c.b(parcel, iA);
    }
}
