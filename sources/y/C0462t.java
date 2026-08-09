package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Arrays;

/* JADX INFO: renamed from: Y.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0462t extends N.a {
    public static final Parcelable.Creator<C0462t> CREATOR = new V();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0449h f3211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0447g f3212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0451i f3213f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C0443e f3214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f3215m;

    C0462t(String str, String str2, byte[] bArr, C0449h c0449h, C0447g c0447g, C0451i c0451i, C0443e c0443e, String str3) {
        boolean z2 = true;
        if ((c0449h == null || c0447g != null || c0451i != null) && ((c0449h != null || c0447g == null || c0451i != null) && (c0449h != null || c0447g != null || c0451i == null))) {
            z2 = false;
        }
        AbstractC0643s.a(z2);
        this.f3208a = str;
        this.f3209b = str2;
        this.f3210c = bArr;
        this.f3211d = c0449h;
        this.f3212e = c0447g;
        this.f3213f = c0451i;
        this.f3214l = c0443e;
        this.f3215m = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0462t)) {
            return false;
        }
        C0462t c0462t = (C0462t) obj;
        return AbstractC0642q.b(this.f3208a, c0462t.f3208a) && AbstractC0642q.b(this.f3209b, c0462t.f3209b) && Arrays.equals(this.f3210c, c0462t.f3210c) && AbstractC0642q.b(this.f3211d, c0462t.f3211d) && AbstractC0642q.b(this.f3212e, c0462t.f3212e) && AbstractC0642q.b(this.f3213f, c0462t.f3213f) && AbstractC0642q.b(this.f3214l, c0462t.f3214l) && AbstractC0642q.b(this.f3215m, c0462t.f3215m);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3208a, this.f3209b, this.f3210c, this.f3212e, this.f3211d, this.f3213f, this.f3214l, this.f3215m);
    }

    public String s() {
        return this.f3215m;
    }

    public C0443e t() {
        return this.f3214l;
    }

    public String u() {
        return this.f3208a;
    }

    public byte[] v() {
        return this.f3210c;
    }

    public String w() {
        return this.f3209b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, u(), false);
        N.c.C(parcel, 2, w(), false);
        N.c.k(parcel, 3, v(), false);
        N.c.A(parcel, 4, this.f3211d, i3, false);
        N.c.A(parcel, 5, this.f3212e, i3, false);
        N.c.A(parcel, 6, this.f3213f, i3, false);
        N.c.A(parcel, 7, t(), i3, false);
        N.c.C(parcel, 8, s(), false);
        N.c.b(parcel, iA);
    }
}
