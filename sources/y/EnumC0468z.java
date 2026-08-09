package Y;

import Y.EnumC0468z;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Y.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0468z implements Parcelable {
    PUBLIC_KEY("public-key");

    public static final Parcelable.Creator<EnumC0468z> CREATOR = new Parcelable.Creator() { // from class: Y.a0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC0468z.h(parcel.readString());
            } catch (EnumC0468z.a e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i3) {
            return new EnumC0468z[i3];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3247a = "public-key";

    /* JADX INFO: renamed from: Y.z$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    EnumC0468z(String str) {
    }

    public static EnumC0468z h(String str) throws a {
        for (EnumC0468z enumC0468z : values()) {
            if (str.equals(enumC0468z.f3247a)) {
                return enumC0468z;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3247a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f3247a);
    }
}
