package Y;

import Y.D;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public enum D implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<D> CREATOR = new Parcelable.Creator() { // from class: Y.c0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            try {
                return D.h(string);
            } catch (D.a e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i3) {
            return new D[i3];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3106a;

    public static class a extends Exception {
        public a(String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    D(String str) {
        this.f3106a = str;
    }

    public static D h(String str) throws a {
        for (D d3 : values()) {
            if (str.equals(d3.f3106a)) {
                return d3;
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
        return this.f3106a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f3106a);
    }
}
