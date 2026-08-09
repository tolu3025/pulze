package c0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: renamed from: c0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0537h extends N.a implements com.google.android.gms.common.api.j {
    public static final Parcelable.Creator<C0537h> CREATOR = new C0538i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4999b;

    public C0537h(List list, String str) {
        this.f4998a = list;
        this.f4999b = str;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status getStatus() {
        return this.f4999b != null ? Status.f5312f : Status.f5316o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        List list = this.f4998a;
        int iA = N.c.a(parcel);
        N.c.E(parcel, 1, list, false);
        N.c.C(parcel, 2, this.f4999b, false);
        N.c.b(parcel, iA);
    }
}
