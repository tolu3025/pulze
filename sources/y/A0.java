package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends N.a {
    public static final Parcelable.Creator<A0> CREATOR = new B0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f3090d;

    A0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f3087a = j3;
        this.f3088b = (byte[]) AbstractC0643s.k(bArr);
        this.f3089c = (byte[]) AbstractC0643s.k(bArr2);
        this.f3090d = (byte[]) AbstractC0643s.k(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return this.f3087a == a02.f3087a && Arrays.equals(this.f3088b, a02.f3088b) && Arrays.equals(this.f3089c, a02.f3089c) && Arrays.equals(this.f3090d, a02.f3090d);
    }

    public final int hashCode() {
        return AbstractC0642q.c(Long.valueOf(this.f3087a), this.f3088b, this.f3089c, this.f3090d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.v(parcel, 1, this.f3087a);
        N.c.k(parcel, 2, this.f3088b, false);
        N.c.k(parcel, 3, this.f3089c, false);
        N.c.k(parcel, 4, this.f3090d, false);
        N.c.b(parcel, iA);
    }
}
