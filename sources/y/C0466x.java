package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: Y.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0466x extends C {
    public static final Parcelable.Creator<C0466x> CREATOR = new Y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f3233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f3234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f3236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f3237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E f3238f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final EnumC0452i0 f3239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0441d f3240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Long f3241n;

    C0466x(byte[] bArr, Double d3, String str, List list, Integer num, E e3, String str2, C0441d c0441d, Long l3) {
        this.f3233a = (byte[]) AbstractC0643s.k(bArr);
        this.f3234b = d3;
        this.f3235c = (String) AbstractC0643s.k(str);
        this.f3236d = list;
        this.f3237e = num;
        this.f3238f = e3;
        this.f3241n = l3;
        if (str2 != null) {
            try {
                this.f3239l = EnumC0452i0.h(str2);
            } catch (C0450h0 e4) {
                throw new IllegalArgumentException(e4);
            }
        } else {
            this.f3239l = null;
        }
        this.f3240m = c0441d;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C0466x)) {
            return false;
        }
        C0466x c0466x = (C0466x) obj;
        return Arrays.equals(this.f3233a, c0466x.f3233a) && AbstractC0642q.b(this.f3234b, c0466x.f3234b) && AbstractC0642q.b(this.f3235c, c0466x.f3235c) && (((list = this.f3236d) == null && c0466x.f3236d == null) || (list != null && (list2 = c0466x.f3236d) != null && list.containsAll(list2) && c0466x.f3236d.containsAll(this.f3236d))) && AbstractC0642q.b(this.f3237e, c0466x.f3237e) && AbstractC0642q.b(this.f3238f, c0466x.f3238f) && AbstractC0642q.b(this.f3239l, c0466x.f3239l) && AbstractC0642q.b(this.f3240m, c0466x.f3240m) && AbstractC0642q.b(this.f3241n, c0466x.f3241n);
    }

    public int hashCode() {
        return AbstractC0642q.c(Integer.valueOf(Arrays.hashCode(this.f3233a)), this.f3234b, this.f3235c, this.f3236d, this.f3237e, this.f3238f, this.f3239l, this.f3240m, this.f3241n);
    }

    public List s() {
        return this.f3236d;
    }

    public C0441d t() {
        return this.f3240m;
    }

    public byte[] u() {
        return this.f3233a;
    }

    public Integer v() {
        return this.f3237e;
    }

    public String w() {
        return this.f3235c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.k(parcel, 2, u(), false);
        N.c.o(parcel, 3, x(), false);
        N.c.C(parcel, 4, w(), false);
        N.c.G(parcel, 5, s(), false);
        N.c.u(parcel, 6, v(), false);
        N.c.A(parcel, 7, y(), i3, false);
        EnumC0452i0 enumC0452i0 = this.f3239l;
        N.c.C(parcel, 8, enumC0452i0 == null ? null : enumC0452i0.toString(), false);
        N.c.A(parcel, 9, t(), i3, false);
        N.c.x(parcel, 10, this.f3241n, false);
        N.c.b(parcel, iA);
    }

    public Double x() {
        return this.f3234b;
    }

    public E y() {
        return this.f3238f;
    }
}
