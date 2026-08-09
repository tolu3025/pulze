package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: renamed from: Y.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0441d extends N.a {
    public static final Parcelable.Creator<C0441d> CREATOR = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f3136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f3137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f3138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I0 f3139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K f3140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final M f3141f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final E0 f3142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final P f3143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C0461s f3144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final S f3145o;

    C0441d(r rVar, C0 c02, F f3, I0 i02, K k3, M m3, E0 e02, P p2, C0461s c0461s, S s2) {
        this.f3136a = rVar;
        this.f3138c = f3;
        this.f3137b = c02;
        this.f3139d = i02;
        this.f3140e = k3;
        this.f3141f = m3;
        this.f3142l = e02;
        this.f3143m = p2;
        this.f3144n = c0461s;
        this.f3145o = s2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0441d)) {
            return false;
        }
        C0441d c0441d = (C0441d) obj;
        return AbstractC0642q.b(this.f3136a, c0441d.f3136a) && AbstractC0642q.b(this.f3137b, c0441d.f3137b) && AbstractC0642q.b(this.f3138c, c0441d.f3138c) && AbstractC0642q.b(this.f3139d, c0441d.f3139d) && AbstractC0642q.b(this.f3140e, c0441d.f3140e) && AbstractC0642q.b(this.f3141f, c0441d.f3141f) && AbstractC0642q.b(this.f3142l, c0441d.f3142l) && AbstractC0642q.b(this.f3143m, c0441d.f3143m) && AbstractC0642q.b(this.f3144n, c0441d.f3144n) && AbstractC0642q.b(this.f3145o, c0441d.f3145o);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3136a, this.f3137b, this.f3138c, this.f3139d, this.f3140e, this.f3141f, this.f3142l, this.f3143m, this.f3144n, this.f3145o);
    }

    public r s() {
        return this.f3136a;
    }

    public F t() {
        return this.f3138c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 2, s(), i3, false);
        N.c.A(parcel, 3, this.f3137b, i3, false);
        N.c.A(parcel, 4, t(), i3, false);
        N.c.A(parcel, 5, this.f3139d, i3, false);
        N.c.A(parcel, 6, this.f3140e, i3, false);
        N.c.A(parcel, 7, this.f3141f, i3, false);
        N.c.A(parcel, 8, this.f3142l, i3, false);
        N.c.A(parcel, 9, this.f3143m, i3, false);
        N.c.A(parcel, 10, this.f3144n, i3, false);
        N.c.A(parcel, 11, this.f3145o, i3, false);
        N.c.b(parcel, iA);
    }
}
