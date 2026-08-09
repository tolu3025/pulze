package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: renamed from: Y.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0445f extends N.a {
    public static final Parcelable.Creator<C0445f> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3150a;

    public C0445f(boolean z2) {
        this.f3150a = z2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0445f) && this.f3150a == ((C0445f) obj).f3150a;
    }

    public int hashCode() {
        return AbstractC0642q.c(Boolean.valueOf(this.f3150a));
    }

    public boolean s() {
        return this.f3150a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.g(parcel, 1, s());
        N.c.b(parcel, iA);
    }
}
