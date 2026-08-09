package Y;

import Y.C0458o;
import Y.EnumC0468z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: Y.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0465w extends N.a {
    public static final Parcelable.Creator<C0465w> CREATOR = new X();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0468z f3231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0458o f3232b;

    public C0465w(String str, int i3) {
        AbstractC0643s.k(str);
        try {
            this.f3231a = EnumC0468z.h(str);
            AbstractC0643s.k(Integer.valueOf(i3));
            try {
                this.f3232b = C0458o.a(i3);
            } catch (C0458o.a e3) {
                throw new IllegalArgumentException(e3);
            }
        } catch (EnumC0468z.a e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0465w)) {
            return false;
        }
        C0465w c0465w = (C0465w) obj;
        return this.f3231a.equals(c0465w.f3231a) && this.f3232b.equals(c0465w.f3232b);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3231a, this.f3232b);
    }

    public int s() {
        return this.f3232b.b();
    }

    public String t() {
        return this.f3231a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 2, t(), false);
        N.c.u(parcel, 3, Integer.valueOf(s()), false);
        N.c.b(parcel, iA);
    }
}
