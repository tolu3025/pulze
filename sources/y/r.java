package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class r extends N.a {
    public static final Parcelable.Creator<r> CREATOR = new H0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3204a;

    public r(String str) {
        this.f3204a = (String) AbstractC0643s.k(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f3204a.equals(((r) obj).f3204a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3204a);
    }

    public String s() {
        return this.f3204a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 2, s(), false);
        N.c.b(parcel, iA);
    }
}
