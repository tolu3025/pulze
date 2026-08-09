package I;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class c extends N.a {
    public static final Parcelable.Creator<c> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f2145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f2148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Bundle f2149f;

    c(int i3, int i4, PendingIntent pendingIntent, int i5, Bundle bundle, byte[] bArr) {
        this.f2148e = i3;
        this.f2144a = i4;
        this.f2146c = i5;
        this.f2149f = bundle;
        this.f2147d = bArr;
        this.f2145b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, this.f2144a);
        N.c.A(parcel, 2, this.f2145b, i3, false);
        N.c.s(parcel, 3, this.f2146c);
        N.c.j(parcel, 4, this.f2149f, false);
        N.c.k(parcel, 5, this.f2147d, false);
        N.c.s(parcel, 1000, this.f2148e);
        N.c.b(parcel, iA);
    }
}
