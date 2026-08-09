package G;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class m extends N.a {
    public static final Parcelable.Creator<m> CREATOR = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1604b;

    public m(String str, String str2) {
        this.f1603a = AbstractC0643s.f(((String) AbstractC0643s.l(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f1604b = AbstractC0643s.e(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC0642q.b(this.f1603a, mVar.f1603a) && AbstractC0642q.b(this.f1604b, mVar.f1604b);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f1603a, this.f1604b);
    }

    public String s() {
        return this.f1603a;
    }

    public String t() {
        return this.f1604b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, s(), false);
        N.c.C(parcel, 2, t(), false);
        N.c.b(parcel, iA);
    }
}
