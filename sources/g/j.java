package G;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public class j extends N.a {
    public static final Parcelable.Creator<j> CREATOR = new B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f1593a;

    public j(PendingIntent pendingIntent) {
        this.f1593a = (PendingIntent) AbstractC0643s.k(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return AbstractC0642q.b(this.f1593a, ((j) obj).f1593a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f1593a);
    }

    public PendingIntent s() {
        return this.f1593a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, s(), i3, false);
        N.c.b(parcel, iA);
    }
}
