package G;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;

/* JADX INFO: loaded from: classes.dex */
public class h extends N.a {
    public static final Parcelable.Creator<h> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f1586a;

    public h(PendingIntent pendingIntent) {
        this.f1586a = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return AbstractC0642q.b(this.f1586a, ((h) obj).f1586a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f1586a);
    }

    public PendingIntent s() {
        return this.f1586a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, s(), i3, false);
        N.c.b(parcel, iA);
    }
}
