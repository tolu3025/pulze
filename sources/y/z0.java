package Y;

import Y.C0458o;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class z0 implements Parcelable.Creator {
    z0() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C0458o.a(parcel.readInt());
        } catch (C0458o.a e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new C0458o[i3];
    }
}
