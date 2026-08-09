package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: loaded from: classes.dex */
public class H extends N.a {
    public static final Parcelable.Creator<H> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f3120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f3121c;

    H(int i3, short s2, short s3) {
        this.f3119a = i3;
        this.f3120b = s2;
        this.f3121c = s3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        return this.f3119a == h3.f3119a && this.f3120b == h3.f3120b && this.f3121c == h3.f3121c;
    }

    public int hashCode() {
        return AbstractC0642q.c(Integer.valueOf(this.f3119a), Short.valueOf(this.f3120b), Short.valueOf(this.f3121c));
    }

    public short s() {
        return this.f3120b;
    }

    public short t() {
        return this.f3121c;
    }

    public int u() {
        return this.f3119a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, u());
        N.c.B(parcel, 2, s());
        N.c.B(parcel, 3, t());
        N.c.b(parcel, iA);
    }
}
