package Q;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends N.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f2776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f2777b;

    b(int i3, a aVar) {
        this.f2776a = i3;
        this.f2777b = aVar;
    }

    public static b s(a.b bVar) {
        if (bVar instanceof a) {
            return new b((a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final a.b t() {
        a aVar = this.f2777b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = this.f2776a;
        int iA = N.c.a(parcel);
        N.c.s(parcel, 1, i4);
        N.c.A(parcel, 2, this.f2777b, i3, false);
        N.c.b(parcel, iA);
    }

    private b(a aVar) {
        this.f2776a = 1;
        this.f2777b = aVar;
    }
}
