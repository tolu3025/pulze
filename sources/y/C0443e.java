package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: renamed from: Y.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0443e extends N.a {
    public static final Parcelable.Creator<C0443e> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f3146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f3147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0445f f3148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r0 f3149d;

    C0443e(G g3, p0 p0Var, C0445f c0445f, r0 r0Var) {
        this.f3146a = g3;
        this.f3147b = p0Var;
        this.f3148c = c0445f;
        this.f3149d = r0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0443e)) {
            return false;
        }
        C0443e c0443e = (C0443e) obj;
        return AbstractC0642q.b(this.f3146a, c0443e.f3146a) && AbstractC0642q.b(this.f3147b, c0443e.f3147b) && AbstractC0642q.b(this.f3148c, c0443e.f3148c) && AbstractC0642q.b(this.f3149d, c0443e.f3149d);
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3146a, this.f3147b, this.f3148c, this.f3149d);
    }

    public C0445f s() {
        return this.f3148c;
    }

    public G t() {
        return this.f3146a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, t(), i3, false);
        N.c.A(parcel, 2, this.f3147b, i3, false);
        N.c.A(parcel, 3, s(), i3, false);
        N.c.A(parcel, 4, this.f3149d, i3, false);
        N.c.b(parcel, iA);
    }
}
