package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends N.a {
    public static final Parcelable.Creator<C0> CREATOR = new D0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3101a;

    public C0(List list) {
        this.f3101a = (List) AbstractC0643s.k(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return this.f3101a.containsAll(c02.f3101a) && c02.f3101a.containsAll(this.f3101a);
    }

    public final int hashCode() {
        return AbstractC0642q.c(new HashSet(this.f3101a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.G(parcel, 1, this.f3101a, false);
        N.c.b(parcel, iA);
    }
}
