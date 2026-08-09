package E;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a extends N.a {
    public static final Parcelable.Creator<a> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f1348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f1350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f1351d;

    a(int i3, boolean z2, long j3, boolean z3) {
        this.f1348a = i3;
        this.f1349b = z2;
        this.f1350c = j3;
        this.f1351d = z3;
    }

    public long s() {
        return this.f1350c;
    }

    public boolean t() {
        return this.f1351d;
    }

    public boolean u() {
        return this.f1349b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f1348a);
        N.c.g(parcel, 2, u());
        N.c.v(parcel, 3, s());
        N.c.g(parcel, 4, t());
        N.c.b(parcel, iA);
    }
}
