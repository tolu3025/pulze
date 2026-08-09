package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Y.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0452i0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<EnumC0452i0> CREATOR = new Parcelable.Creator() { // from class: Y.g0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0452i0.h(parcel.readString());
            } catch (C0450h0 e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i3) {
            return new EnumC0452i0[i3];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3167a;

    EnumC0452i0(String str) {
        this.f3167a = str;
    }

    public static EnumC0452i0 h(String str) throws C0450h0 {
        for (EnumC0452i0 enumC0452i0 : values()) {
            if (str.equals(enumC0452i0.f3167a)) {
                return enumC0452i0;
            }
        }
        throw new C0450h0(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3167a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f3167a);
    }
}
