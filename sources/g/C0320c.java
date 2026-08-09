package G;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: G.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0320c extends N.a {
    public static final Parcelable.Creator<C0320c> CREATOR = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f1572a;

    public C0320c(PendingIntent pendingIntent) {
        this.f1572a = (PendingIntent) AbstractC0643s.k(pendingIntent);
    }

    public PendingIntent s() {
        return this.f1572a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.A(parcel, 1, s(), i3, false);
        N.c.b(parcel, iA);
    }
}
