package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: renamed from: Y.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0461s extends N.a {
    public static final Parcelable.Creator<C0461s> CREATOR = new O();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3207a;

    public C0461s(boolean z2) {
        this.f3207a = z2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0461s) && this.f3207a == ((C0461s) obj).s();
    }

    public int hashCode() {
        return AbstractC0642q.c(Boolean.valueOf(this.f3207a));
    }

    public boolean s() {
        return this.f3207a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.g(parcel, 1, s());
        N.c.b(parcel, iA);
    }
}
