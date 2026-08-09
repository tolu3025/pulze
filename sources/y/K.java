package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class K extends N.a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3123a;

    public K(long j3) {
        this.f3123a = ((Long) AbstractC0643s.k(Long.valueOf(j3))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof K) && this.f3123a == ((K) obj).f3123a;
    }

    public final int hashCode() {
        return AbstractC0642q.c(Long.valueOf(this.f3123a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.v(parcel, 1, this.f3123a);
        N.c.b(parcel, iA);
    }
}
