package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends N.a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f3188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3189b;

    public p0(byte[] bArr, byte[] bArr2) {
        this.f3188a = bArr;
        this.f3189b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Arrays.equals(this.f3188a, p0Var.f3188a) && Arrays.equals(this.f3189b, p0Var.f3189b);
    }

    public final int hashCode() {
        return AbstractC0642q.c(this.f3188a, this.f3189b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.k(parcel, 1, this.f3188a, false);
        N.c.k(parcel, 2, this.f3189b, false);
        N.c.b(parcel, iA);
    }
}
