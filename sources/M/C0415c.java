package M;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: renamed from: M.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0415c extends N.a {
    public static final Parcelable.Creator<C0415c> CREATOR = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f2667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f2668d;

    public C0415c(String str, int i3, long j3, boolean z2) {
        this.f2665a = str;
        this.f2666b = i3;
        this.f2667c = j3;
        this.f2668d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0415c) {
            C0415c c0415c = (C0415c) obj;
            if (AbstractC0642q.b(t(), c0415c.t()) && u() == c0415c.u() && s() == c0415c.s()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0642q.c(t(), Long.valueOf(u()), Boolean.valueOf(s()));
    }

    public boolean s() {
        return this.f2668d;
    }

    public String t() {
        return this.f2665a;
    }

    public final String toString() {
        AbstractC0642q.a aVarD = AbstractC0642q.d(this);
        aVarD.a("name", t());
        aVarD.a("version", Long.valueOf(u()));
        aVarD.a("is_fully_rolled_out", Boolean.valueOf(s()));
        return aVarD.toString();
    }

    public long u() {
        long j3 = this.f2667c;
        return j3 == -1 ? this.f2666b : j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.C(parcel, 1, t(), false);
        N.c.s(parcel, 2, this.f2666b);
        N.c.v(parcel, 3, u());
        N.c.g(parcel, 4, s());
        N.c.b(parcel, iA);
    }

    public C0415c(String str, long j3) {
        this(str, -1, j3, false);
    }
}
