package C;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class a extends N.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f733f;

    a(int i3, long j3, String str, int i4, int i5, String str2) {
        this.f728a = i3;
        this.f729b = j3;
        this.f730c = (String) AbstractC0643s.k(str);
        this.f731d = i4;
        this.f732e = i5;
        this.f733f = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f728a == aVar.f728a && this.f729b == aVar.f729b && AbstractC0642q.b(this.f730c, aVar.f730c) && this.f731d == aVar.f731d && this.f732e == aVar.f732e && AbstractC0642q.b(this.f733f, aVar.f733f);
    }

    public int hashCode() {
        return AbstractC0642q.c(Integer.valueOf(this.f728a), Long.valueOf(this.f729b), this.f730c, Integer.valueOf(this.f731d), Integer.valueOf(this.f732e), this.f733f);
    }

    public String toString() {
        int i3 = this.f731d;
        String str = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.f730c + ", changeType = " + str + ", changeData = " + this.f733f + ", eventIndex = " + this.f732e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f728a);
        N.c.v(parcel, 2, this.f729b);
        N.c.C(parcel, 3, this.f730c, false);
        N.c.s(parcel, 4, this.f731d);
        N.c.s(parcel, 5, this.f732e);
        N.c.C(parcel, 6, this.f733f, false);
        N.c.b(parcel, iA);
    }
}
