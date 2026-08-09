package Y;

import Y.EnumC0437b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0437b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC0437b> CREATOR = new Parcelable.Creator() { // from class: Y.I
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0437b.h(parcel.readString());
            } catch (EnumC0437b.a e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i3) {
            return new EnumC0437b[i3];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3130a;

    /* JADX INFO: renamed from: Y.b$a */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    EnumC0437b(String str) {
        this.f3130a = str;
    }

    public static EnumC0437b h(String str) throws a {
        for (EnumC0437b enumC0437b : values()) {
            if (str.equals(enumC0437b.f3130a)) {
                return enumC0437b;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3130a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f3130a);
    }
}
