package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class G extends N.a {
    public static final Parcelable.Creator<G> CREATOR = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3118a;

    G(List list) {
        this.f3118a = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        List list2 = this.f3118a;
        return (list2 == null && g3.f3118a == null) || (list2 != null && (list = g3.f3118a) != null && list2.containsAll(list) && g3.f3118a.containsAll(this.f3118a));
    }

    public int hashCode() {
        return AbstractC0642q.c(new HashSet(this.f3118a));
    }

    public List s() {
        return this.f3118a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.G(parcel, 1, s(), false);
        N.c.b(parcel, iA);
    }
}
