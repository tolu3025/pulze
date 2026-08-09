package Z;

import Z.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends N.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f3561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f3562d;

    b(int i3, byte[] bArr, String str, List list) {
        this.f3559a = i3;
        this.f3560b = bArr;
        try {
            this.f3561c = c.h(str);
            this.f3562d = list;
        } catch (c.a e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Arrays.equals(this.f3560b, bVar.f3560b) || !this.f3561c.equals(bVar.f3561c)) {
            return false;
        }
        List list2 = this.f3562d;
        if (list2 == null && bVar.f3562d == null) {
            return true;
        }
        return list2 != null && (list = bVar.f3562d) != null && list2.containsAll(list) && bVar.f3562d.containsAll(this.f3562d);
    }

    public int hashCode() {
        return AbstractC0642q.c(Integer.valueOf(Arrays.hashCode(this.f3560b)), this.f3561c, this.f3562d);
    }

    public byte[] s() {
        return this.f3560b;
    }

    public c t() {
        return this.f3561c;
    }

    public String toString() {
        List list = this.f3562d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", com.google.android.gms.common.util.c.c(this.f3560b), this.f3561c, list == null ? "null" : list.toString());
    }

    public List u() {
        return this.f3562d;
    }

    public int v() {
        return this.f3559a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, v());
        N.c.k(parcel, 2, s(), false);
        N.c.C(parcel, 3, this.f3561c.toString(), false);
        N.c.G(parcel, 4, u(), false);
        N.c.b(parcel, iA);
    }
}
