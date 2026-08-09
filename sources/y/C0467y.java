package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: Y.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0467y extends N.a {
    public static final Parcelable.Creator<C0467y> CREATOR = new Z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3244c;

    public C0467y(String str, String str2, String str3) {
        this.f3242a = (String) AbstractC0643s.k(str);
        this.f3243b = (String) AbstractC0643s.k(str2);
        this.f3244c = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0467y)) {
            return false;
        }
        C0467y c0467y = (C0467y) obj;
        return AbstractC0642q.b(this.f3242a, c0467y.f3242a) && AbstractC0642q.b(this.f3243b, c0467y.f3243b) && AbstractC0642q.b(this.f3244c, c0467y.f3244c);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3242a, this.f3243b, this.f3244c);
    }

    public String s() {
        return this.f3244c;
    }

    public String t() {
        return this.f3242a;
    }

    public String u() {
        return this.f3243b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 2, t(), false);
        N.c.C(parcel, 3, u(), false);
        N.c.C(parcel, 4, s(), false);
        N.c.b(parcel, iA);
    }
}
