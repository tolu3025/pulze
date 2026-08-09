package Z;

import Z.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d extends N.a {
    public static final Parcelable.Creator<d> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f3569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3571d;

    d(int i3, String str, byte[] bArr, String str2) {
        this.f3568a = i3;
        try {
            this.f3569b = c.h(str);
            this.f3570c = bArr;
            this.f3571d = str2;
        } catch (c.a e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f3570c, dVar.f3570c) || this.f3569b != dVar.f3569b) {
            return false;
        }
        String str = this.f3571d;
        String str2 = dVar.f3571d;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.f3570c) + 31) * 31) + this.f3569b.hashCode();
        String str = this.f3571d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String s() {
        return this.f3571d;
    }

    public byte[] t() {
        return this.f3570c;
    }

    public int u() {
        return this.f3568a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, u());
        N.c.C(parcel, 2, this.f3569b.toString(), false);
        N.c.k(parcel, 3, t(), false);
        N.c.C(parcel, 4, s(), false);
        N.c.b(parcel, iA);
    }
}
