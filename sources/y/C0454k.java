package Y;

import Y.D;
import Y.EnumC0437b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: renamed from: Y.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0454k extends N.a {
    public static final Parcelable.Creator<C0454k> CREATOR = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0437b f3168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f3169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC0452i0 f3170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f3171d;

    C0454k(String str, Boolean bool, String str2, String str3) {
        EnumC0437b enumC0437bH;
        D dH = null;
        if (str == null) {
            enumC0437bH = null;
        } else {
            try {
                enumC0437bH = EnumC0437b.h(str);
            } catch (D.a | EnumC0437b.a | C0450h0 e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        this.f3168a = enumC0437bH;
        this.f3169b = bool;
        this.f3170c = str2 == null ? null : EnumC0452i0.h(str2);
        if (str3 != null) {
            dH = D.h(str3);
        }
        this.f3171d = dH;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0454k)) {
            return false;
        }
        C0454k c0454k = (C0454k) obj;
        return AbstractC0642q.b(this.f3168a, c0454k.f3168a) && AbstractC0642q.b(this.f3169b, c0454k.f3169b) && AbstractC0642q.b(this.f3170c, c0454k.f3170c) && AbstractC0642q.b(u(), c0454k.u());
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3168a, this.f3169b, this.f3170c, u());
    }

    public String s() {
        EnumC0437b enumC0437b = this.f3168a;
        if (enumC0437b == null) {
            return null;
        }
        return enumC0437b.toString();
    }

    public Boolean t() {
        return this.f3169b;
    }

    public D u() {
        D d3 = this.f3171d;
        if (d3 != null) {
            return d3;
        }
        Boolean bool = this.f3169b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return D.RESIDENT_KEY_REQUIRED;
    }

    public String v() {
        if (u() == null) {
            return null;
        }
        return u().toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 2, s(), false);
        N.c.i(parcel, 3, t(), false);
        EnumC0452i0 enumC0452i0 = this.f3170c;
        N.c.C(parcel, 4, enumC0452i0 == null ? null : enumC0452i0.toString(), false);
        N.c.C(parcel, 5, v(), false);
        N.c.b(parcel, iA);
    }
}
