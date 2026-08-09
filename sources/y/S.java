package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class S extends N.a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f3126a;

    public S(byte[][] bArr) {
        AbstractC0643s.a(bArr != null);
        AbstractC0643s.a(1 == ((bArr.length & 1) ^ 1));
        int i3 = 0;
        while (i3 < bArr.length) {
            AbstractC0643s.a(i3 == 0 || bArr[i3] != null);
            int i4 = i3 + 1;
            AbstractC0643s.a(bArr[i4] != null);
            int length = bArr[i4].length;
            AbstractC0643s.a(length == 32 || length == 64);
            i3 += 2;
        }
        this.f3126a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            return Arrays.deepEquals(this.f3126a, ((S) obj).f3126a);
        }
        return false;
    }

    public final int hashCode() {
        int iC = 0;
        for (byte[] bArr : this.f3126a) {
            iC ^= AbstractC0642q.c(bArr);
        }
        return iC;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.l(parcel, 1, this.f3126a, false);
        N.c.b(parcel, iA);
    }
}
