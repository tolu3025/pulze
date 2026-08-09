package c0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: c0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0531b extends N.a implements com.google.android.gms.common.api.j {
    public static final Parcelable.Creator<C0531b> CREATOR = new C0532c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f4995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f4997c;

    C0531b(int i3, int i4, Intent intent) {
        this.f4995a = i3;
        this.f4996b = i4;
        this.f4997c = intent;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status getStatus() {
        return this.f4996b == 0 ? Status.f5312f : Status.f5316o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f4995a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.s(parcel, 2, this.f4996b);
        N.c.A(parcel, 3, this.f4997c, i3, false);
        N.c.b(parcel, iA);
    }
}
