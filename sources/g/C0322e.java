package G;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: renamed from: G.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0322e extends N.a {
    public static final Parcelable.Creator<C0322e> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1573a;

    C0322e(int i3) {
        this.f1573a = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0322e) {
            return AbstractC0642q.b(Integer.valueOf(this.f1573a), Integer.valueOf(((C0322e) obj).f1573a));
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0642q.c(Integer.valueOf(this.f1573a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f1573a);
        N.c.b(parcel, iA);
    }
}
