package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class P extends N.a {
    public static final Parcelable.Creator<P> CREATOR = new Q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3125a;

    public P(String str) {
        this.f3125a = (String) AbstractC0643s.k(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof P) {
            return this.f3125a.equals(((P) obj).f3125a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0642q.c(this.f3125a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, this.f3125a, false);
        N.c.b(parcel, iA);
    }
}
