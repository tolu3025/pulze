package Y;

import Y.EnumC0439c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: Y.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0463u extends C {
    public static final Parcelable.Creator<C0463u> CREATOR = new U();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0467y f3216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f3217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f3219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Double f3220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f3221f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C0454k f3222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Integer f3223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final E f3224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final EnumC0439c f3225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C0441d f3226p;

    C0463u(C0467y c0467y, A a3, byte[] bArr, List list, Double d3, List list2, C0454k c0454k, Integer num, E e3, String str, C0441d c0441d) {
        this.f3216a = (C0467y) AbstractC0643s.k(c0467y);
        this.f3217b = (A) AbstractC0643s.k(a3);
        this.f3218c = (byte[]) AbstractC0643s.k(bArr);
        this.f3219d = (List) AbstractC0643s.k(list);
        this.f3220e = d3;
        this.f3221f = list2;
        this.f3222l = c0454k;
        this.f3223m = num;
        this.f3224n = e3;
        if (str != null) {
            try {
                this.f3225o = EnumC0439c.h(str);
            } catch (EnumC0439c.a e4) {
                throw new IllegalArgumentException(e4);
            }
        } else {
            this.f3225o = null;
        }
        this.f3226p = c0441d;
    }

    public Double A() {
        return this.f3220e;
    }

    public E B() {
        return this.f3224n;
    }

    public A C() {
        return this.f3217b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C0463u)) {
            return false;
        }
        C0463u c0463u = (C0463u) obj;
        return AbstractC0642q.b(this.f3216a, c0463u.f3216a) && AbstractC0642q.b(this.f3217b, c0463u.f3217b) && Arrays.equals(this.f3218c, c0463u.f3218c) && AbstractC0642q.b(this.f3220e, c0463u.f3220e) && this.f3219d.containsAll(c0463u.f3219d) && c0463u.f3219d.containsAll(this.f3219d) && (((list = this.f3221f) == null && c0463u.f3221f == null) || (list != null && (list2 = c0463u.f3221f) != null && list.containsAll(list2) && c0463u.f3221f.containsAll(this.f3221f))) && AbstractC0642q.b(this.f3222l, c0463u.f3222l) && AbstractC0642q.b(this.f3223m, c0463u.f3223m) && AbstractC0642q.b(this.f3224n, c0463u.f3224n) && AbstractC0642q.b(this.f3225o, c0463u.f3225o) && AbstractC0642q.b(this.f3226p, c0463u.f3226p);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3216a, this.f3217b, Integer.valueOf(Arrays.hashCode(this.f3218c)), this.f3219d, this.f3220e, this.f3221f, this.f3222l, this.f3223m, this.f3224n, this.f3225o, this.f3226p);
    }

    public String s() {
        EnumC0439c enumC0439c = this.f3225o;
        if (enumC0439c == null) {
            return null;
        }
        return enumC0439c.toString();
    }

    public C0441d t() {
        return this.f3226p;
    }

    public C0454k u() {
        return this.f3222l;
    }

    public byte[] v() {
        return this.f3218c;
    }

    public List w() {
        return this.f3221f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 2, z(), i3, false);
        N.c.A(parcel, 3, C(), i3, false);
        N.c.k(parcel, 4, v(), false);
        N.c.G(parcel, 5, x(), false);
        N.c.o(parcel, 6, A(), false);
        N.c.G(parcel, 7, w(), false);
        N.c.A(parcel, 8, u(), i3, false);
        N.c.u(parcel, 9, y(), false);
        N.c.A(parcel, 10, B(), i3, false);
        N.c.C(parcel, 11, s(), false);
        N.c.A(parcel, 12, t(), i3, false);
        N.c.b(parcel, iA);
    }

    public List x() {
        return this.f3219d;
    }

    public Integer y() {
        return this.f3223m;
    }

    public C0467y z() {
        return this.f3216a;
    }
}
