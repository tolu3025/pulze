package Z;

import Z.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class f implements Parcelable.Creator {
    f() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return a.v(parcel.readInt());
        } catch (a.b e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new a.EnumC0072a[i3];
    }
}
