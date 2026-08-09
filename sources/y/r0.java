package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends N.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3206b;

    public r0(boolean z2, byte[] bArr) {
        this.f3205a = z2;
        this.f3206b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f3205a == r0Var.f3205a && Arrays.equals(this.f3206b, r0Var.f3206b);
    }

    public final int hashCode() {
        return AbstractC0642q.c(Boolean.valueOf(this.f3205a), this.f3206b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.g(parcel, 1, this.f3205a);
        N.c.k(parcel, 2, this.f3206b, false);
        N.c.b(parcel, iA);
    }
}
