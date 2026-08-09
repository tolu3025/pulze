package Y;

import Y.E;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Y.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0442d0 implements Parcelable.Creator {
    C0442d0() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return E.a.h(parcel.readString());
        } catch (E.b e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new E.a[i3];
    }
}
