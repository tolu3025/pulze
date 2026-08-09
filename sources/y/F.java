package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: loaded from: classes.dex */
public class F extends N.a {
    public static final Parcelable.Creator<F> CREATOR = new C0446f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3117a;

    public F(boolean z2) {
        this.f3117a = z2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof F) && this.f3117a == ((F) obj).f3117a;
    }

    public int hashCode() {
        return AbstractC0642q.c(Boolean.valueOf(this.f3117a));
    }

    public boolean s() {
        return this.f3117a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.g(parcel, 1, s());
        N.c.b(parcel, iA);
    }
}
