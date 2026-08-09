package I;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class b extends N.a {
    public static final Parcelable.Creator<b> CREATOR = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f2129l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f2130m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f2131n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f2132o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f2133p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f2134q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f2135r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f2136s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f2137t = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f2142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Bundle f2143f;

    b(int i3, String str, int i4, long j3, byte[] bArr, Bundle bundle) {
        this.f2142e = i3;
        this.f2138a = str;
        this.f2139b = i4;
        this.f2140c = j3;
        this.f2141d = bArr;
        this.f2143f = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.f2138a + ", method: " + this.f2139b + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f2138a, false);
        N.c.s(parcel, 2, this.f2139b);
        N.c.v(parcel, 3, this.f2140c);
        N.c.k(parcel, 4, this.f2141d, false);
        N.c.j(parcel, 5, this.f2143f, false);
        N.c.s(parcel, 1000, this.f2142e);
        N.c.b(parcel, iA);
    }
}
