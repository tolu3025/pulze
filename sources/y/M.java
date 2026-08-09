package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class M extends N.a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3124a;

    public M(boolean z2) {
        this.f3124a = ((Boolean) AbstractC0643s.k(Boolean.valueOf(z2))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof M) && this.f3124a == ((M) obj).f3124a;
    }

    public final int hashCode() {
        return AbstractC0642q.c(Boolean.valueOf(this.f3124a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.g(parcel, 1, this.f3124a);
        N.c.b(parcel, iA);
    }
}
